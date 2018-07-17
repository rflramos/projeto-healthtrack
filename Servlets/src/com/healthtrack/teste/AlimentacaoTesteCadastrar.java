package com.healthtrack.teste;



import java.util.Calendar;

import com.healthtrack.bean.Alimentacao;
import com.healthtrack.dao.AlimentacaoDAO;
import com.healthtrack.dao.impl.AlimentacaoDAOImpl;
import com.healthtrack.exception.DBException;

public class AlimentacaoTesteCadastrar {
	
	public static void main(String[] args) throws DBException {
	
		/*
		 * Instancia o DAO
		 */
		AlimentacaoDAO dao = new AlimentacaoDAOImpl();
		
		/*
		 * Instancia Alimentalcao
		 */
		Alimentacao alimentacao = new Alimentacao();
		
		alimentacao.setDs_alimento("PIPOCA");
		alimentacao.setCd_usuario(5);
		alimentacao.setVl_calorias_ganhas(354);
		alimentacao.setDt_registro(Calendar.getInstance());
		
		
		
		
		/*
		 * Cadastrar no banco de dados
		 */
		dao.cadastrar(alimentacao);
		
				
		System.out.println("Cadastrado");
			
		
	}
	
	
}
