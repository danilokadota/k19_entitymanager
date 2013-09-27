package teste;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import k19_EnitityManager.Comentario;
import k19_EnitityManager.Topico;

public class AdicionaTopicoComentario {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("k21_entitymanager_banco");
		EntityManager manager = factory.createEntityManager();
		
		Topico topico = new Topico();
		topico.setTitulo("k19 - orphan removal");
		
		for (int i = 0; i < 10; i++) {
			Comentario comentario = new Comentario();
			comentario.setData(Calendar.getInstance());
			topico.getComentarios().add(comentario);
			
		}
		
		manager.getTransaction().begin();
		manager.persist(topico);
		manager.getTransaction().commit();
		factory.close();
	}

}
