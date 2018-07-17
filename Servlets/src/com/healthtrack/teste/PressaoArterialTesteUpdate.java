package com.healthtrack.teste;

import com.healthtrack.bean.PressaoArterial;
import com.healthtrack.dao.impl.PressaoArterialDAOImpl;
import com.healthtrack.exception.DBException;

public class PressaoArterialTesteUpdate {
	public static void main(String[] args) throws DBException {
		
		/*
		 * Instancia objeto na classe AlimentacaoDAOImpl (implementação)
		 */
		PressaoArterialDAOImpl dao = new PressaoArterialDAOImpl();
		/*
		 * Recuperar o Id que será removido
		 */
		PressaoArterial pressaoArterial = dao.buscarPorId(7);
		
		/*
		 * Imprime os dados referente ao ID informado
		 */
		
		System.out.println(pressaoArterial.getCd_pressao() + " " + pressaoArterial.getDs_status_pressao() + " " + pressaoArterial.getCd_usuario() + " " + pressaoArterial.getVl_sistolica() + " " + pressaoArterial.getVl_diastolica());
		/*
		 * Altera os valores da tabela
		 */
		pressaoArterial.setDs_status_pressao("Normal");
		
				
		/*
		 * Atualiza o banco de dados
		 */
		dao.atualizar(pressaoArterial);
	}

}
