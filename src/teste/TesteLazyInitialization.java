package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import k19_EnitityManager.Pessoa;

public class TesteLazyInitialization {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("k21_entitymanager_banco");
		EntityManager manager = factory.createEntityManager();
		
		Pessoa pessoa = manager.getReference(Pessoa.class, 1L);
		
		manager.close();
		factory.close();
		
		System.out.println(pessoa.getNome());

	}

}
