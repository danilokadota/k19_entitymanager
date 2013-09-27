package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import k19_EnitityManager.Pessoa;

public class TesteFindEager {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("k21_entitymanager_banco");
		EntityManager manager = factory.createEntityManager();
		
		System.out.println("--------chamando find ---------");
		Pessoa pessoa = manager.find(Pessoa.class, 1L);
		System.out.println("------------fez o select---------");
		
		manager.close();
		factory.close();
	}

}
