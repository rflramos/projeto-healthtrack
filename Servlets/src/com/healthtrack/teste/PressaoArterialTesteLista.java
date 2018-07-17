package com.healthtrack.teste;

import java.util.List;

import com.healthtrack.bean.PressaoArterial;
import com.healthtrack.dao.impl.PressaoArterialDAOImpl;

public class PressaoArterialTesteLista {
	public static void main(String[] args) {
		
		PressaoArterialDAOImpl dao = new PressaoArterialDAOImpl();
		
		List<PressaoArterial> listaPressao = dao.buscarTodos();
		for (PressaoArterial item : listaPressao) {
			System.out.println(item.getCd_pressao() + " " + item.getDs_status_pressao() + " " + item.getCd_usuario() + " " + item.getVl_sistolica() + " " + item.getVl_diastolica() + " "+ item.getDt_registro_pressao().getTime());
		}
			
	}
}
