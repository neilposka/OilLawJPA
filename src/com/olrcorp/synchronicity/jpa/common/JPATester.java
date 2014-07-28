package com.olrcorp.synchronicity.jpa.common;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;

import com.olrcorp.synchronicity.jpa.entities.WellForm;

public class JPATester {

	@PersistenceUnit
	EntityManagerFactory emf;
	
	public void run()
	{

		Integer id = new Integer(1549273);
		
	    emf = Persistence.createEntityManagerFactory("OilLawPostgresJPA");
		
		EntityManager em = emf.createEntityManager();
		
		WellForm form = new WellForm();
		form = em.find(WellForm.class, id);
		
//		
//		form.setOperatorNumber(null);
//		
//		em.getTransaction().begin();
//		em.persist(form);
//		em.getTransaction().commit();
		
	}

}
