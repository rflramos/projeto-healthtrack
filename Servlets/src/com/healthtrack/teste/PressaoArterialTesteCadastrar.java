package com.healthtrack.teste;



import java.util.Calendar;

import com.healthtrack.bean.PressaoArterial;
import com.healthtrack.dao.PressaoArterialDAO;
import com.healthtrack.dao.impl.PressaoArterialDAOImpl;
import com.healthtrack.exception.DBException;

public class PressaoArterialTesteCadastrar {
	
	public static void main(String[] args) throws DBException {
	
		/*
		 * Instancia o DAO
		 */
		PressaoArterialDAO dao = new PressaoArterialDAOImpl();
		
		/*
		 * Instancia Alimentalcao
		 */
		PressaoArterial pressaoArterial = new PressaoArterial();
		
		pressaoArterial.setCd_pressao(15);
		pressaoArterial.setCd_usuario(3);
		pressaoArterial.setDt_registro_pressao(Calendar.getInstance());
		pressaoArterial.setVl_sistolica(120);
		pressaoArterial.setVl_diastolica(80);
		pressaoArterial.setDs_status_pressao("Normal");
		
	
		/*
		 * Cadastrar no banco de dados
		 */
		dao.cadastrar(pressaoArterial);
		
				
		System.out.println("Cadastrado");
			
		
	}
	
	
}
