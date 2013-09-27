package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import k19_EnitityManager.Cidade;

public class InsereCidades {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("k21_entitymanager_banco");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		Cidade saoPaulo = new Cidade();
		saoPaulo.setNomeCidade("são paulo");
		saoPaulo.setNomeEstado("são paulo");
		
		Cidade rioDeJaneiro = new Cidade();
		rioDeJaneiro.setNomeCidade("Rio de Janeiro");
		rioDeJaneiro.setNomeEstado("Rio de Janeiro");
		
		Cidade natal = new Cidade();
		natal.setNomeCidade("Natal");
		natal.setNomeEstado("Rio Grande do Norte");
		
		manager.persist(saoPaulo);
		manager.persist(rioDeJaneiro);
		manager.persist(natal);
		
		manager.getTransaction().commit();
		manager.close();
		factory.close();
		
	}

}
