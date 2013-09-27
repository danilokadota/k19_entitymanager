package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import k19_EnitityManager.Cidade;

public class TesteSharedCache {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("k21_entitymanager_banco");
		EntityManager manager1 = factory.createEntityManager();
		
		System.out.println("-----primeiro find-------");
		Cidade cidade = manager1.find(Cidade.class, 1L);
		
		EntityManager manager2 = factory.createEntityManager();
		
		System.out.println("-------segundo find-------");
		cidade = manager2.find(Cidade.class, 1L);
		
		

	}

}
