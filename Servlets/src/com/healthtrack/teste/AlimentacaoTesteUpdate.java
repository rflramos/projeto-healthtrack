package com.healthtrack.teste;

import com.healthtrack.bean.Alimentacao;
import com.healthtrack.dao.impl.AlimentacaoDAOImpl;
import com.healthtrack.exception.DBException;

public class AlimentacaoTesteUpdate {
	public static void main(String[] args) throws DBException {
		
		/*
		 * Instancia objeto na classe AlimentacaoDAOImpl (implementação)
		 */
		AlimentacaoDAOImpl dao = new AlimentacaoDAOImpl();
		/*
		 * Recuperar o Id que será removido
		 */
		Alimentacao alimentacao = dao.buscarPorId(6);
		
		/*
		 * Imprime os dados referente ao ID informado
		 */
		
		System.out.println(alimentacao.getCd_usuario() + " " + alimentacao.getCd_alimento() + " " + alimentacao.getDs_alimento() + " " + alimentacao.getVl_calorias_ganhas() + " " + alimentacao.getDt_registro().getTime());
		/*
		 * Altera os valores da tabela
		 */
		alimentacao.setDs_alimento("Macarrão");
		
				
		/*
		 * Atualiza o banco de dados
		 */
		dao.atualizar(alimentacao);
	}

}
