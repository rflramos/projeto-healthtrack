package com.healthtrack.teste;


import com.healthtrack.dao.impl.AlimentacaoDAOImpl;
import com.healthtrack.exception.DBException;


public class AlimentacaoTesteRemover {
	public static void main(String[] args) throws DBException {
		
		/*
		 * Instancia Objeto na classe AlimentacaoDAOImpl
		 */
		AlimentacaoDAOImpl dao = new AlimentacaoDAOImpl();
		
		
		/*
		 * Remove item da tabela utilizando como filtro o códico do alimento
		 */
		
		dao.remover(3);
		
		System.out.println("Item removido");
	}

}
