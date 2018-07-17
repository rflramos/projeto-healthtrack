package com.healthtrack.teste;


import com.healthtrack.dao.impl.AtividadesFisicasDAOImpl;
import com.healthtrack.exception.DBException;


public class AtividadesFisicasTesteRemover {
	public static void main(String[] args) throws DBException {
		
		/*
		 * Instancia Objeto na classe AtividadesFisicasDAOImpl
		 */
		AtividadesFisicasDAOImpl dao = new AtividadesFisicasDAOImpl();
		
		
		/*
		 * Remove item da tabela utilizando como filtro o códico da AtividadesFisicas
		 */
		
		dao.remover(2);
		
		System.out.println("Item removido");
	}

}
