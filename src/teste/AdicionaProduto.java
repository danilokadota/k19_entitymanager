package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import k19_EnitityManager.Produto;

public class AdicionaProduto {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("k21_entitymanager_banco");
		EntityManager manager = factory.createEntityManager();
		
		Produto produto = new Produto();
		produto.setNome("k19- caneta");
		produto.setPreco(4.56);
		
		manager.getTransaction().begin();
		
		manager.persist(produto);
		
		manager.getTransaction().commit();
		
		factory.close();
	}

}
