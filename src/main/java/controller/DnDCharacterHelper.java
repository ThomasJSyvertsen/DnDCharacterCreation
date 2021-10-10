package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.DnDCharacter;
import model.Items;

/**
 * @author Thomas Syvertsen - tjsyvertsen CIS175 - Fall 2021 Sep 23, 2021
 */
public class DnDCharacterHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("DnDCharacterCreation");

	public void insertCharacter(DnDCharacter character) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(character);
		em.getTransaction().commit();
		em.close();
	}
	
	public void updateDnDCharacter(DnDCharacter toEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.merge(toEdit);
		em.getTransaction().commit();
		em.close();
	}
	
	public void removeDnDCharacter(DnDCharacter dndChar) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		DnDCharacter toRemove = em.merge(dndChar);
		em.remove(toRemove);
		em.getTransaction().commit();
		em.close();
	}

	public DnDCharacter searchForDnDCharacterById(int idToEdit) {
	EntityManager em = emfactory.createEntityManager();
	em.getTransaction().begin();
	DnDCharacter found = em.find(DnDCharacter.class, idToEdit);
	em.close();
	return found;
	}
	
	public List<DnDCharacter> showAllDnDCharacters(){
		EntityManager em = emfactory.createEntityManager();
		List<DnDCharacter> allItems = em.createQuery("SELECT i FROM DnDCharacter i").getResultList();
		return allItems;
		}
	
	public void cleanUp() {
		emfactory.close();
	}
}
