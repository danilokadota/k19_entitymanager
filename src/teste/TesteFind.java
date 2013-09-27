package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import k19_EnitityManager.Pessoa;

public class TesteFind {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("k21_entitymanager_banco");
		EntityManager manager = factory.createEntityManager();
		
		Pessoa pessoa = manager.find(Pessoa.class, 1L);
		System.out.println("ID: " + pessoa.getId());
		System.out.println("Nome: "+ pessoa.getNome());
		
		manager.close();
		factory.close();

	}

}
