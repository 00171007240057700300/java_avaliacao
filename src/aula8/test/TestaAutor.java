package aula8.test;

import aula8.model.Autor;
import aula8.persistence.DAO;
import aula8.persistence.DAOAutor;

public class TestaAutor extends DAO{
	
	
	public static void main(String args[]) {
		Autor autor = new Autor();
		autor.setNome("Monteiro Lobato");
		
		try{
			DAOAutor dao = new DAOAutor();
			dao.cadastrar(autor);
			System.out.println("Cadastrado com sucesso");
		}catch(Exception e) {
			System.out.println("Erro");
			e.printStackTrace();
		}
		
		
	}

}
