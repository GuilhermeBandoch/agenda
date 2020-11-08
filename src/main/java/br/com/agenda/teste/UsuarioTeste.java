package br.com.agenda.teste;

import java.sql.SQLException;

import br.com.agenda.dao.UsuarioDAO;
import br.com.agenda.dao.UsuarioDAO;

public class UsuarioTeste {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		/*
		 * UsuarioDAO dao = new UsuarioDAO();
		 * 
		 * dao.inserir("Ivan");
		 */

		/*
		 * UsuarioDAO dao = new UsuarioDAO();
		 * 
		 * System.out.println(dao.listarTudo());
		 */
		
		UsuarioDAO dao = new UsuarioDAO();
		System.out.println("Lista ANtes da atualização");
		System.out.println(dao.listarTudo());

		UsuarioDAO daoUpdate = new UsuarioDAO();
		daoUpdate.alterar("Centrais Elétricas de Santa Catarina", 1L);
		
		System.out.println("Lista atualizda");
		UsuarioDAO pesq = new UsuarioDAO();
		System.out.println(pesq.listarTudo());
		
/**************************************/
		
		
		/*
		 * Metodo de exluir UsuariolDAO dao = new UsuarioDAO();
		 * System.out.println("Lista Antes da atualização");
		 * System.out.println(dao.listarTudo());
		 * 
		 * UsuarioDAO del = new UsuarioDAO(); del.excluir(5L);
		 * 
		 * System.out.println("Lista atualizda"); UsuarioDAO pesq = new UsuarioDAO();
		 * System.out.println(pesq.listarTudo());
		 */
		 		

	}

}
