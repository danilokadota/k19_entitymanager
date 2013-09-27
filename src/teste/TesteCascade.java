package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import k19_EnitityManager.Estado;
import k19_EnitityManager.Governador;

public class TesteCascade {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("k21_entitymanager_banco");
		EntityManager manager = factory.createEntityManager();
		
		Governador governador = new Governador();
		governador.setNome("danilo kadota");
		
		Estado estado = new Estado();
		estado.setNome("são paulo");
		
		governador.setEstado(estado);
		estado.setGovernador(governador);
		
		manager.getTransaction().begin();
		manager.persist(estado);
		manager.getTransaction().commit();
	}

}
