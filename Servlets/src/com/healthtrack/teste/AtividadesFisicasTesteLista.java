package com.healthtrack.teste;

import java.util.List;

import com.healthtrack.bean.AtividadesFisicas;
import com.healthtrack.dao.impl.AtividadesFisicasDAOImpl;

public class AtividadesFisicasTesteLista {
	public static void main(String[] args) {
		
		AtividadesFisicasDAOImpl dao = new AtividadesFisicasDAOImpl();
		
		List<AtividadesFisicas> listaAtividades = dao.buscarTodos();
		for (AtividadesFisicas item : listaAtividades) {
			System.out.println(item.getCd_usuario() + " " + item.getCd_atividade() + " " + item.getDs_atividade() + " " + item.getDt_atividade().getTime());
		}
			
	}
}
