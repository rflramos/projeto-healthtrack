package com.healthtrack.dao;

import java.util.List;

import com.healthtrack.bean.PressaoArterial;
import com.healthtrack.exception.DBException;

	/**
	 * interface que implementara o metodo CRUD
	 * @author Rafael
	 *
	 */
	public interface PressaoArterialDAO {
		
		public void cadastrar(PressaoArterial pressaoArterial) throws DBException;
		
		public List<PressaoArterial> buscarTodos();
		
		public void atualizar(PressaoArterial pressaoArterial) throws DBException;
		
		public void remover(int cd_pressao) throws DBException;
		
		public PressaoArterial buscarPorId(int cd_pressao);

	}
