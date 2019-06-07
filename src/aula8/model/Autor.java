package aula8.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Autor implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigoAutor;
	private String nome;
	
	
	
	public Autor() {
	}
	
	
	

	public Integer getCodigoAutor() {
		return codigoAutor;
	}




	public void setCodigoAutor(Integer codigoAutor) {
		this.codigoAutor = codigoAutor;
	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}







	@Override
	public String toString() {
		return "Autor [codigoAutor=" + codigoAutor + ", nome=" + nome + "]";
	}
	
	
}
