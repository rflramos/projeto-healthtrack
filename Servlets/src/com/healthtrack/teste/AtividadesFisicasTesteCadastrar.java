package com.healthtrack.teste;

import java.util.Calendar;

import com.healthtrack.bean.AtividadesFisicas;
import com.healthtrack.dao.AtividadesFisicasDAO;
import com.healthtrack.dao.impl.AtividadesFisicasDAOImpl;
import com.healthtrack.exception.DBException;

public class AtividadesFisicasTesteCadastrar {

	public static void main(String[] args) throws DBException {
		
		
		/*
		 * Instancia o DAO
		 */
		AtividadesFisicasDAO dao = new AtividadesFisicasDAOImpl();
		
		/*
		 * Instancia Alimentalcao
		 */
		AtividadesFisicas atividadesFisicas = new AtividadesFisicas();
		
		
		atividadesFisicas.setDt_atividade(Calendar.getInstance());
		atividadesFisicas.setDs_atividade("Bicicleta");
		atividadesFisicas.setCd_usuario(5);
		//atividadesFisicas.setCd_usuario(1);
		
		
		
		
		
		/*
		 * Cadastrar no banco de dados
		 */
		dao.cadastrar(atividadesFisicas);
		
				
		System.out.println("Cadastrado");
			
		
	}
	
	
}


