package com.healthtrack.dao;

import java.util.List;
import com.healthtrack.exception.DBException;

import com.healthtrack.bean.Alimentacao;

/**
 * interface que implementara o metodo CRUD
 * @author Rafael
 *
 */
public interface AlimentacaoDAO {
	
	public void cadastrar(Alimentacao alimentacao) throws DBException;
	
	public List<Alimentacao> buscarTodos();
	
	public void atualizar(Alimentacao alimentacao) throws DBException;
	
	public void remover(int cd_alimento) throws DBException;
	
	public Alimentacao buscarPorId(int cd_alimento);

}