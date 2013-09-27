package k19_EnitityManager;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PostPersist;
import javax.persistence.PrePersist;

@Entity
public class Produto {
	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	private Double preco;
	
	@PrePersist
	public void prePersist(){
		System.out.println("Persistindo um novo objeto com persist() ou merge()...");
	}
	
	@PostPersist
	public void postPersist(){
		System.out.println("O comando insert foi executado no banco de dados....");
		System.out.println("um rollback ainda pode desfazer o comand insert...");
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the preco
	 */
	public Double getPreco() {
		return preco;
	}

	/**
	 * @param preco the preco to set
	 */
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
}
