package br.com.agenda.teste;
 
import java.sql.SQLException;

import br.com.agenda.dao.LocalDAO;
 
 
public class LocalTeste {
 	
public static void main(String[] args) throws ClassNotFoundException, SQLException  {
 		
		/*
		 * LocalDAO dao = new LocalDAO();
		 * 
		 * dao.inserir("Loja");
		 */
	
		/*
		 * LocalDAO dao = new LocalDAO();
		 * 
		 * System.out.println(dao.listarTudo());
		 */
		
		LocalDAO dao = new LocalDAO();
		System.out.println("Lista ANtes da atualização");
		System.out.println(dao.listarTudo());

		LocalDAO daoUpdate = new LocalDAO();
		daoUpdate.alterar("Centrais Elétricas de Santa Catarina", 1L);
		
		System.out.println("Lista atualizda");
		LocalDAO pesq = new LocalDAO();
		System.out.println(pesq.listarTudo());

		/**************************************/
		
		/*
		 * Metodo de exluir
		 * LocalDAO dao = new LocalDAO();
		 * System.out.println("Lista ANtes da atualização");
		 * System.out.println(dao.listarTudo());
		 * 
		 * LocalDAO del = new LocalDAO(); del.excluir(5L);
		 * 
		 * System.out.println("Lista atualizda"); LocalDAO pesq = new LocalDAO();
		 * System.out.println(pesq.listarTudo());
		 */		
 	} 


}
