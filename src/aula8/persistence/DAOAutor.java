package aula8.persistence;

import aula8.model.Autor;

public class DAOAutor extends DAO{

	public DAOAutor() {
		super(); // Inicializa o EntityManager
	}
	
	public void cadastrar(Autor a) {
		entityManager.getTransaction().begin(); // inicia uma transação
		entityManager.persist(a); // objeto a ser cadastrado
		entityManager.getTransaction().commit(); // executa o cadastro
		entityManager.close(); // fecha conexão
	}
}
