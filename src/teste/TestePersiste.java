package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import k19_EnitityManager.Pessoa;

public class TestePersiste {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("k21_entitymanager_banco");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("danilo kadota");
		
		manager.persist(pessoa);
		
		manager.getTransaction().commit();
		
		System.out.println("Pessoa id: "+ pessoa.getId());
		
		manager.close();
		factory.close();
		

	}

}
