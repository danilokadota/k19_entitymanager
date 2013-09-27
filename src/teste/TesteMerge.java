package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import k19_EnitityManager.Pessoa;

public class TesteMerge {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("k21_entitymanager_banco");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		Pessoa pessoa = manager.find(Pessoa.class, 1L);
		manager.detach(pessoa);
		
		Pessoa pessoa2 = manager.merge(pessoa);
		
		pessoa2.setNome("ana paula");
		
		manager.getTransaction().commit();
		manager.close();
		factory.close();

	}

}
