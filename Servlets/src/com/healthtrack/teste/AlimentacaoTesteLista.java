package com.healthtrack.teste;

import java.util.List;

import com.healthtrack.bean.Alimentacao;
import com.healthtrack.dao.impl.AlimentacaoDAOImpl;

public class AlimentacaoTesteLista {
	public static void main(String[] args) {
		
		AlimentacaoDAOImpl dao = new AlimentacaoDAOImpl();
		
		List<Alimentacao> listaAlimentacao = dao.buscarTodos();
		for (Alimentacao item : listaAlimentacao) {
			System.out.println(item.getCd_usuario() + " " + item.getCd_alimento() + " " + item.getDs_alimento() + " " + item.getVl_calorias_ganhas() + " " + item.getDt_registro().getTime());
		}
			
	}
}
