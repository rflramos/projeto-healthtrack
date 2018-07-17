package com.healthtrack.teste;


import com.healthtrack.dao.impl.PressaoArterialDAOImpl;
import com.healthtrack.exception.DBException;


public class PressaoArterialTesteRemover {
	public static void main(String[] args) throws DBException {
		
		/*
		 * Instancia Objeto na classe AlimentacaoDAOImpl
		 */
		PressaoArterialDAOImpl dao = new PressaoArterialDAOImpl();
		
		
		/*
		 * Remove item da tabela utilizando como filtro o códico do alimento
		 */
		
		dao.remover(5);
		
		System.out.println("Item removido");
	}

}
