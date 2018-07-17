package com.healthtrack.factory;

import com.healthtrack.dao.*;
import com.healthtrack.dao.impl.*;

public class DAOFactory {
	
	//metodo estatico para criação dos objetos DAO
	
	public static AlimentacaoDAO getAlimentacaoDAO() {
		return new AlimentacaoDAOImpl();
		
	}
	
	public static AtividadesFisicasDAO getAtividadesFisicasDAO() {
		return new AtividadesFisicasDAOImpl();
	}
	
	public static PressaoArterialDAO getPressaoArterialDAO() {
		return new PressaoArterialDAOImpl();
		
	}
	
	public static UsuarioDAO getUsuarioDAO() {
		return new UsuarioDAOImpl();
	}

}
