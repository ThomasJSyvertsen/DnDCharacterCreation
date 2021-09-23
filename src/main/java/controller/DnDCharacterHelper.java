package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.DnDCharacter;

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
	
	public List<DnDCharacter> showAllDnDCharacters(){
		EntityManager em = emfactory.createEntityManager();
		List<DnDCharacter> allItems = em.createQuery("SELECT i FROM DnDCharacter i").getResultList();
		return allItems;
		}
	
	public void cleanUp() {
		emfactory.close();
	}
}
