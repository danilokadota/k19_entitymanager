package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import k19_EnitityManager.Pessoa;

public class TesteRemoved {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("k21_entitymanager_banco");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		Pessoa pessoa = manager.find(Pessoa.class, 1L);
		
		manager.remove(pessoa);
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();

	}

}
