package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import k19_EnitityManager.Estado;

public class TesteCarregamentoRelacionamento {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("k21_entitymanager_banco");
		EntityManager manager = factory.createEntityManager();
		
		Estado estado = manager.find(Estado.class, 1L);
		
		manager.close();
		factory.close();
		
		System.out.println(estado.getGovernador().getNome());
	}

}
