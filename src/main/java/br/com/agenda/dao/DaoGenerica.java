package br.com.agenda.dao;

import java.util.List;

public interface DaoGenerica {	
		
		List<?> ListarTudo();
		
		void excluir(Long id);

	}


