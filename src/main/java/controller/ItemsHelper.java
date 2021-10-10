package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Items;

/**
 * @author Thomas Syvertsen - tjsyvertsen
 * CIS175 - Fall 2021
 * Oct 5, 2021
 */
public class ItemsHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("DnDCharacterCreation");
	
	public void insertItems(Items items) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();em.persist(items);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<Items> showItems() {
		EntityManager em = emfactory.createEntityManager();
		List<Items> allAttributes = em.createQuery("SELECT items FROM "
				+ "Items items").getResultList();
		return allAttributes;
	}
}
