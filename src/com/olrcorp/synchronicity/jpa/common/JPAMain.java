package com.olrcorp.synchronicity.jpa.common;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class JPAMain {

	public static void main(String[] args) {

		JPATester tester = new JPATester();
		tester.run();

		System.out.println("JPA Testing is complete");
		
	}

}
