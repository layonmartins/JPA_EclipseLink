package com.locadorael.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.locadorael.model.Marca;

public class MarcaTest {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LocadoraEL");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		et.begin();
		Marca marca = new Marca();
		marca.setDescricao("Volksvagen");
		em.persist(marca);
		et.commit();

	}

}
