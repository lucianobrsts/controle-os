package br.com.controleos.config;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("unit_os");

	@Produces
	@RequestScoped
	public EntityManager criarEntityManager() {
		return factory.createEntityManager();
	}

	public void fecharEntityManager(@Disposes EntityManager manager) {
		if (manager != null && manager.isOpen()) {
			manager.close();
		}
	}

}
