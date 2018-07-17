package com.healthtrack.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;

import com.healthtrack.bean.Alimentacao;
import com.healthtrack.dao.AlimentacaoDAO;
import com.healthtrack.exception.DBException;
import com.healthtrack.jdbc.HealthTrackDbManager;

public class AlimentacaoDAOImpl implements AlimentacaoDAO {
	
	private Connection conexao;
	PreparedStatement pstmt = null;
	
	/**
	 * Metodo gravar
	 * Estabelece conexão com o banco de dados Oracle através do metodo obterconexão da classe HealthTrackDbManager
	 * Utiliza o objeto PreparedStatement para executar o comando SQL INSERT
	 * É utilizado o bloco try catch para tratar os erros
	 * @Override esta sobrescrevendo o metodo gravar da classe AlimentacaoDAO utilizando novos parametros
	 */
	@Override
	public void cadastrar(Alimentacao alimentacao) throws DBException {
		PreparedStatement pstmt = null;
		//Executa o comando INSERT na tablela Alimentação
		try {
			
			conexao = HealthTrackDbManager.getInstance().getConnection();
			String sql = "INSERT INTO T_HT_ALIMENTACAO (CD_ALIMENTO, DS_ALIMENTO, CD_USUARIO, VL_CALORIAS_GANHAS, DT_REGISTRO) VALUES (SQ_T_HT_ALIMENTACAO.NEXTVAL, ?, ?, ?, ?)";
			pstmt = conexao.prepareStatement(sql);
			pstmt.setString(1, alimentacao.getDs_alimento());
			pstmt.setInt(2,  alimentacao.getCd_usuario());
			pstmt.setDouble(3,  alimentacao.getVl_calorias_ganhas());
			java.sql.Date data = new java.sql.Date(alimentacao.getDt_registro().getTimeInMillis());
			pstmt.setDate(4, data);
			pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("Erro ao cadastrar.");
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
	public List<Alimentacao> buscarTodos() {
		/*
		 * Executa uma QUERY na tabela Alimentação
		 */
		List<Alimentacao> listaAlimentos = new ArrayList<Alimentacao>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			conexao = HealthTrackDbManager.getInstance().getConnection();
			pstmt = conexao.prepareStatement("SELECT * FROM T_HT_ALIMENTACAO");
			rs = pstmt.executeQuery();
			
			/*
			 * Percorre todos os registros 
			 */
			while (rs.next()) {
				int cd_alimento = rs.getInt("cd_alimento");
				String ds_alimento = rs.getString("ds_alimento");
				int cd_usuario = rs.getInt("cd_usuario");
				int vl_calorias_ganhas = rs.getInt("vl_calorias_ganhas");
				java.sql.Date data = rs.getDate("dt_registro");
				Calendar dt_registro = Calendar.getInstance();
				dt_registro.setTimeInMillis(data.getTime());
				
				/*
				 * Adiciona os dados da tabela à lista
				 */
				Alimentacao alimentacao = new Alimentacao(cd_alimento, ds_alimento, cd_usuario, vl_calorias_ganhas, dt_registro);
				listaAlimentos.add(alimentacao);
				
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
		return listaAlimentos;
	}
	
	@Override
	public void atualizar (Alimentacao alimentacao) throws DBException {
		PreparedStatement pstmt = null;
		/*
		 * Metodo atualizar que irá fazer Update na tabela Alimentacao
		 */
		try {
			
			conexao = HealthTrackDbManager.getInstance().getConnection();
			String sql = "UPDATE T_HT_ALIMENTACAO SET CD_ALIMENTO = ?, DS_ALIMENTO = ?, CD_USUARIO = ?, VL_CALORIAS_GANHAS = ?, DT_REGISTRO = ? WHERE CD_ALIMENTO = ?";
			pstmt = conexao.prepareStatement(sql);
			pstmt.setInt(1,  alimentacao.getCd_alimento());
			pstmt.setString(2, alimentacao.getDs_alimento());
			pstmt.setInt(3, alimentacao.getCd_usuario());
			pstmt.setInt(4, alimentacao.getVl_calorias_ganhas());
			java.sql.Date data = new java.sql.Date(alimentacao.getDt_registro().getTimeInMillis());
			pstmt.setDate(5, data);
			pstmt.setInt(6, alimentacao.getCd_alimento());
			
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
	public void remover (int cd_alimento) throws DBException {
		PreparedStatement pstmt = null;
		/*
		 * Método que irá remover dados da tabela utilizando como filtro o código do alimento
		 */
		try {
			
			conexao = HealthTrackDbManager.getInstance().getConnection();
			String sql = "DELETE FROM T_HT_ALIMENTACAO WHERE CD_ALIMENTO = ?";
			pstmt = conexao.prepareStatement(sql);
			pstmt.setInt(1,  cd_alimento);
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
	
	// Este método irá fazer uma busca por ID e será utilizado no momento de efetuar um update na tabela
	  public Alimentacao buscarPorId(int codigoBusca) {
		  Alimentacao alimentacao = null;
		  PreparedStatement pstmt = null;
		  ResultSet rs = null;
		    
		    try {
		      conexao = HealthTrackDbManager.getInstance().getConnection();
		      
		      pstmt = conexao.prepareStatement("SELECT * FROM T_HT_ALIMENTACAO WHERE CD_ALIMENTO = ?");
		      pstmt.setInt(1, codigoBusca);
		      rs = pstmt.executeQuery();

		      if (rs.next()){
		        int cd_alimento = rs.getInt("cd_alimento");
		        String ds_alimento = rs.getString("ds_alimento");
		        int cd_usuario = rs.getInt("cd_usuario");
		        int vl_calorias_ganhas = rs.getInt("vl_calorias_ganhas");
		        java.sql.Date data = rs.getDate("dt_registro");
		        Calendar dt_registro = Calendar.getInstance();
		        dt_registro.setTimeInMillis(data.getTime());
		        
		        alimentacao = new Alimentacao(cd_alimento, ds_alimento, cd_usuario, vl_calorias_ganhas, dt_registro);
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
		    return alimentacao;
		  }
	
}