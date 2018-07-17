package com.healthtrack.teste;

import com.healthtrack.bean.AtividadesFisicas;
import com.healthtrack.dao.impl.AtividadesFisicasDAOImpl;
import com.healthtrack.exception.DBException;

public class AtividadesFisicasTesteUpdate {
	public static void main(String[] args) throws DBException {
		
		/*
		 * Instancia objeto na classe AtividadesFisicasDAOImpl (implementação)
		 */
		AtividadesFisicasDAOImpl dao = new AtividadesFisicasDAOImpl();
		/*
		 * Recuperar o Id que será removido
		 */
		AtividadesFisicas atividadesFisicas = dao.buscarPorId(16);
		
		/*
		 * Imprime os dados referente ao ID informado
		 */
		
		System.out.println(atividadesFisicas.getCd_usuario() + " " + atividadesFisicas.getCd_atividade() + " " + atividadesFisicas.getDs_atividade() + " " + atividadesFisicas.getDt_atividade().getTime());
		/*
		 * Altera os valores da tabela
		 */
		atividadesFisicas.setDs_atividade("Banana");
		
				
		/*
		 * Atualiza o banco de dados
		 */
		dao.atualizar(atividadesFisicas);
	}

}
