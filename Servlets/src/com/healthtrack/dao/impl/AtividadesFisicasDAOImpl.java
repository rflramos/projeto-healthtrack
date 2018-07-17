package com.healthtrack.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;

import com.healthtrack.jdbc.HealthTrackDbManager;
import com.healthtrack.bean.AtividadesFisicas;
import com.healthtrack.dao.AtividadesFisicasDAO;
import com.healthtrack.exception.DBException;


/**
 * Classe que irá implementar o CRUD
 * @author Rafael Ramos
 *
 */

public class AtividadesFisicasDAOImpl implements AtividadesFisicasDAO {
	
	private Connection conexao;
	
	
	/**
	 * Método Cadastrar
	 * Estabelece conexão com o banco de dados Oracle através dos metodos getInstance e getConnection da classe HealthTrackDbManager
	 * Utiliza o objeto PreparedStatement para executar o comando SQL INSERT
	 * É utilizado o bloco try catch para tratar os erros
	 * @throws DBException 
	 * @Override esta sobrescervendo o metodo gravar da classe AlimentacaoDAO utilizando novos parametros
	 */
	
	
	@Override
	public void cadastrar(AtividadesFisicas atividadesFisicas) throws DBException {
		PreparedStatement pstmt = null;
		//Executa o comando INSERT na tablela Atividades
		try {
			conexao = HealthTrackDbManager.getInstance().getConnection();
			String sql = "INSERT INTO T_HT_ATIVIDADE (CD_ATIVIDADE, DT_ATIVIDADE, DS_ATIVIDADE, CD_USUARIO) VALUES (SQ_T_HT_ATIVIDADE.NEXTVAL, ?, ?, ?)";
			java.sql.Date data = new java.sql.Date(atividadesFisicas.getDt_atividade().getTimeInMillis());
			pstmt = conexao.prepareStatement(sql);
			pstmt.setDate(1, data);
			pstmt.setString(2, atividadesFisicas.getDs_atividade());
			pstmt.setInt(3,  atividadesFisicas.getCd_usuario());
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("Erro ao cadastradar.");
		}finally {
			try {
				pstmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	@Override
	public List<AtividadesFisicas> buscarTodos() {
		/*
		 * Executa uma QUERY na tabela Atividades
		 */
		List<AtividadesFisicas> listaAtividades = new ArrayList<AtividadesFisicas>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			conexao = HealthTrackDbManager.getInstance().getConnection();
			pstmt = conexao.prepareStatement("SELECT * FROM T_HT_ATIVIDADE");
			rs = pstmt.executeQuery();
			
			/*
			 * Percorre todos os registros 
			 */
			while (rs.next()) {
				
				 int cd_atividade = rs.getInt("cd_atividade");
			     String ds_atividade = rs.getString("ds_atividade");
			     int cd_usuario = rs.getInt("cd_usuario");
			     java.sql.Date data = rs.getDate("dt_atividade");
			     Calendar dt_atividade = Calendar.getInstance();
			     dt_atividade.setTimeInMillis(data.getTime());
			        
			     AtividadesFisicas atividadesFisicas = new AtividadesFisicas(cd_atividade, ds_atividade, cd_usuario, dt_atividade);
														  
				/*
				 * Adiciona os dados da tabela Atividades à lista
				 */
				listaAtividades.add(atividadesFisicas);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conexao.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return listaAtividades;
	}
	
	@Override
	public void atualizar(AtividadesFisicas atividadesFisicas) throws DBException {
		PreparedStatement pstmt = null;
		/*
		 * Metodo atualizar que irá fazer Update na tabela Atividades
		 */
		try {
			
			conexao = HealthTrackDbManager.getInstance().getConnection();
			String sql = "UPDATE T_HT_ATIVIDADE SET CD_ATIVIDADE = ?, DS_ATIVIDADE = ?, CD_USUARIO = ? WHERE CD_ATIVIDADE = ?";
			pstmt = conexao.prepareStatement(sql);
			pstmt.setInt(1,  atividadesFisicas.getCd_atividade());
			pstmt.setString(2, atividadesFisicas.getDs_atividade());
			pstmt.setInt(3, atividadesFisicas.getCd_usuario());
			pstmt.setInt(4, atividadesFisicas.getCd_usuario());
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("Erro ao atualizar.");
		} finally {
			try {
				pstmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	@Override
	public void remover(int cd_atividade) throws DBException {
		PreparedStatement pstmt = null;
		/*
		 * Método que irá remover dados da tabela utilizando como filtro o código do alimento
		 */
		try {
			
			conexao = HealthTrackDbManager.getInstance().getConnection();
			String sql = "DELETE FROM T_HT_ATIVIDADE WHERE CD_ATIVIDADE = ?";
			pstmt = conexao.prepareStatement(sql);
			pstmt.setInt(1, cd_atividade);
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("Erro ao remover.");
		} finally {
			
			try {
				pstmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	//Este metodo irá resgatar um ID que posteriormente será utilizado como referencia para remover um item da tabela
	@Override
	public AtividadesFisicas buscarPorId(int codigoBusca){
		AtividadesFisicas atividadesFisicas = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		    
		    try {
		    	conexao = HealthTrackDbManager.getInstance().getConnection();
		    	pstmt = conexao.prepareStatement("SELECT * FROM T_HT_ATIVIDADE WHERE CD_ATIVIDADE = ?");
		    	pstmt.setInt(1, codigoBusca);
		    	rs = pstmt.executeQuery();

		      if (rs.next()){
		        int cd_atividade = rs.getInt("cd_atividade");
		        String ds_atividade = rs.getString("ds_atividade");
		        int cd_usuario = rs.getInt("cd_usuario");
		        java.sql.Date data = rs.getDate("dt_atividade");
		        Calendar dt_atividade = Calendar.getInstance();
		        dt_atividade.setTimeInMillis(data.getTime());
		        
		        atividadesFisicas = new AtividadesFisicas(cd_atividade, ds_atividade, cd_usuario, dt_atividade);
		      }
		      
		    } catch (SQLException e) {
		      e.printStackTrace();
		    }finally {
		      try {
		        pstmt.close();
		        rs.close();
		        conexao.close();
		      } catch (SQLException e) {
		        e.printStackTrace();
		      }
		    }
		    return atividadesFisicas;
		  }
	
}
	
