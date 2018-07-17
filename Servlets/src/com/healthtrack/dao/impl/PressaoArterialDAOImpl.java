package com.healthtrack.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;

import com.healthtrack.jdbc.HealthTrackDbManager;
import com.healthtrack.bean.PressaoArterial;
import com.healthtrack.dao.PressaoArterialDAO;
import com.healthtrack.exception.DBException;


/**
 * Classe que irá implementar o CRUD
 * @author Rafael Ramos
 *
 */

public class PressaoArterialDAOImpl implements PressaoArterialDAO {
	
	private Connection conexao;
	
	
	/**
	 * Método Cadastrar
	 * Estabelece conexão com o banco de dados Oracle através do metodo obterconexão da classe HealthTrackDbManager
	 * Utiliza o objeto PreparedStatement para executar o comando SQL INSERT
	 * É utilizado o bloco try catch para tratar os erros
	 * @throws DBException 
	 * @Override esta sobrescervendo o metodo gravar da classe AlimentacaoDAO utilizando novos parametros
	 */
	
	@Override
	public void cadastrar(PressaoArterial pressaoArterial) throws DBException {
		PreparedStatement pstmt = null;
		//Executa o comando INSERT na tablela parterial
		try {
			
			conexao = HealthTrackDbManager.getInstance().getConnection();
			String sql = "INSERT INTO T_HT_PARTERIAL (CD_PRESSAO, DS_STATUS_PRESSAO, DT_REGISTRO_PRESSAO, CD_USUARIO, VL_SISTOLICA, VL_DIASTOLICA) VALUES (SQ_T_HT_PARTERIAL.NEXTVAL, ?, ?, ?, ?, ?)";
			pstmt = conexao.prepareStatement(sql);
			pstmt.setString(1, pressaoArterial.getDs_status_pressao());
			java.sql.Date data = new java.sql.Date(pressaoArterial.getDt_registro_pressao().getTimeInMillis());
			pstmt.setDate(2, data);
			pstmt.setInt(3,  pressaoArterial.getCd_usuario());
			pstmt.setFloat(4, pressaoArterial.getVl_sistolica());
			pstmt.setFloat(5, pressaoArterial.getVl_diastolica());
			
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
	public List<PressaoArterial> buscarTodos() {
		/*
		 * Executa uma QUERY na tabela parterial
		 */
		List<PressaoArterial> ListaPressao = new ArrayList<PressaoArterial>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			conexao = HealthTrackDbManager.getInstance().getConnection();
			pstmt = conexao.prepareStatement("SELECT * FROM T_HT_PARTERIAL");
			rs = pstmt.executeQuery();
			
			/*
			 * Percorre todos os registros 
			 */
			while (rs.next()) {
				
				java.sql.Date data = rs.getDate("dt_registro_pressao");
				Calendar dt_registro_pressao = Calendar.getInstance();
				dt_registro_pressao.setTimeInMillis(data.getTime());
				
		        int cd_pressao = rs.getInt("cd_pressao");
		        String ds_status_pressao = rs.getString("ds_status_pressao");
		        int cd_usuario = rs.getInt("cd_usuario");
		        float vl_sistolica = rs.getFloat("vl_sistolica");
		        float vl_diastolica = rs.getFloat("vl_diastolica");

		        
		        PressaoArterial pressaoArterial = new PressaoArterial(cd_pressao, ds_status_pressao, cd_usuario, vl_sistolica, vl_diastolica, dt_registro_pressao);
														  
				/*
				 * Adiciona os dados da tabela parterial à lista
				 */
				ListaPressao.add(pressaoArterial);
				
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
		return ListaPressao;
	}
	
	@Override
	public void atualizar(PressaoArterial pressaoArterial) throws DBException {
		PreparedStatement pstmt = null;
		/*
		 * Metodo atualizar que irá fazer Update na tabela
		 */
		try {
			
			conexao = HealthTrackDbManager.getInstance().getConnection();
			String sql ="UPDATE T_HT_PARTERIAL SET CD_PRESSAO = ?, DS_STATUS_PRESSAO = ?, CD_USUARIO = ?, VL_SISTOLICA = ?, VL_DIASTOLICA = ?  WHERE CD_PRESSAO = ?";
			pstmt = conexao.prepareStatement(sql);
			pstmt.setInt(1,  pressaoArterial.getCd_pressao());
			pstmt.setString(2, pressaoArterial.getDs_status_pressao());
			pstmt.setInt(3, pressaoArterial.getCd_usuario());
			pstmt.setFloat(4, pressaoArterial.getVl_sistolica());
			pstmt.setFloat(5, pressaoArterial.getVl_diastolica());
			pstmt.setInt(6,  pressaoArterial.getCd_pressao());
			
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
	public void remover(int cd_pressao) throws DBException {
		PreparedStatement pstmt = null;
		/*
		 * Método que irá remover dados da tabela utilizando como filtro o cd_pressao
		 */
		try {
			
			conexao = HealthTrackDbManager.getInstance().getConnection();
			String sql = "DELETE FROM T_HT_PARTERIAL WHERE CD_PRESSAO = ?";
			pstmt = conexao.prepareStatement(sql);
			pstmt.setInt(1, cd_pressao);
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
	
	//Este metodo irá resgatar um ID e posteriormente será utilizado para remover um item da tabela.
	@Override
	public PressaoArterial buscarPorId(int codigoBusca){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		PressaoArterial pressaoArterial = null;
		
		    try {
		    	conexao = HealthTrackDbManager.getInstance().getConnection();
		      pstmt = conexao.prepareStatement("SELECT * FROM T_HT_PARTERIAL WHERE CD_PRESSAO = ?");
		      pstmt.setInt(1, codigoBusca);
		      rs = pstmt.executeQuery();

		      if (rs.next()){
		        int cd_pressao = rs.getInt("cd_pressao");
		        String ds_status_pressao = rs.getString("ds_status_pressao");
		        java.sql.Date data = rs.getDate("dt_registro_pressao");
		        int cd_usuario = rs.getInt("cd_usuario");
		        float vl_sistolica = rs.getFloat("vl_sistolica");
		        float vl_diastolica = rs.getFloat("vl_diastolica");
		        Calendar dt_registro_pressao = Calendar.getInstance();
		        dt_registro_pressao.setTimeInMillis(data.getTime());
		        
		        pressaoArterial = new PressaoArterial(cd_pressao, ds_status_pressao, cd_usuario, vl_sistolica, vl_diastolica, dt_registro_pressao);
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
		    return pressaoArterial;
		  }
	
}
	
