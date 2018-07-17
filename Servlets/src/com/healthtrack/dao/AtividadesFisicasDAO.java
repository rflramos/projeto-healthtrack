package com.healthtrack.dao;

import java.util.List;

import com.healthtrack.bean.AtividadesFisicas;
import com.healthtrack.exception.DBException;

	/**
	 * interface que implementara o metodo CRUD
	 * @author Rafael
	 *
	 */
	public interface AtividadesFisicasDAO {
		
		public void cadastrar(AtividadesFisicas atividadesFisicas) throws DBException;
		
		public List<AtividadesFisicas> buscarTodos();
		
		public void atualizar(AtividadesFisicas atividadesFisicas) throws DBException;
		
		public void remover(int cd_atividade) throws DBException ;
		
		public AtividadesFisicas buscarPorId(int cd_atividade);

	}
