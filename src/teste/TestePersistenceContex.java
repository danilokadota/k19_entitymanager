package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import k19_EnitityManager.Estado;

public class TestePersistenceContex {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("k21_entitymanager_banco");
		EntityManager manager = factory.createEntityManager();
		
		System.out.println("----------primeiro find----------");
		Estado estado = manager.find(Estado.class, 1L);
		System.out.println("----segundo find ---------");
		estado = manager.find(Estado.class, 1L);

	}

}
