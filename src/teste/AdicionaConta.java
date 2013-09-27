package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import k19_EnitityManager.Conta;

public class AdicionaConta {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("k21_entitymanager_banco");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		Conta conta = new Conta();
		conta.setSaldo(2000.);
		manager.persist(conta);
		manager.getTransaction().commit();
		manager.close();
		factory.close();

	}

}
