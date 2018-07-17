package com.healthtrack.dao;

import java.util.List;

import com.healthtrack.exception.DBException;
import com.healthtrack.bean.Usuario;


public interface UsuarioDAO {
	
	public void cadastrar(Usuario usuario) throws DBException;
	 
	public List<Usuario> buscarTodos();
	 
	public void atualizar(Usuario usuario) throws DBException;
	
	public void remover (int cod_usuario) throws DBException;
	
	public Usuario buscarPorId(int cd_usuario);

}
