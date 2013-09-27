package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import k19_EnitityManager.Topico;

public class TesteOrphanRemoval {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("k21_entitymanager_banco");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		Topico topico = manager.find(Topico.class, 2L);
		topico.getComentarios().clear();
		
		manager.getTransaction().commit();
		
		factory.close();

	}

}
