package com.healthtrack.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.healthtrack.bean.Usuario;
import com.healthtrack.dao.UsuarioDAO;
import com.healthtrack.exception.DBException;
import com.healthtrack.jdbc.HealthTrackDbManager;

public class UsuarioDAOImpl implements UsuarioDAO {
	private Connection conexao; //instanciando objeto conexao na classe Connection de java.sql.Connection
	
	
	//Sobrescrever o metodo cadsatrar, instanciar objeto usuario na classe Usuario. Tratamento de erro DBException
	@Override
	public void cadastrar(Usuario usuario) throws DBException {
		// TODO Auto-generated method stub
		PreparedStatement pstmt = null;
		
		try { // DT_NASCIMENTO,
			conexao = HealthTrackDbManager.getInstance().getConnection();
			String sql = "INSERT INTO T_HT_USUARIO (CD_USUARIO, NM_USUARIO, DS_SEXO, DS_APELIDO, DS_EMAIL, DS_PASS1, DS_PASS2, VL_ALTURA) VALUES (SQ_T_HT_USUARIO.NEXTVAL, ?, ?, ?, ?, ?, ?, ?)";
			pstmt = conexao.prepareStatement(sql);
			pstmt.setString(1, usuario.getNm_usuario());
			pstmt.setString(2, usuario.getDs_sexo());
			pstmt.setString(3, usuario.getDs_apelido());
			pstmt.setString(4, usuario.getDs_email());
			pstmt.setString(5, usuario.getDs_pass1());
			pstmt.setString(6, usuario.getDs_pass2());
			//java.sql.Date data = new java.sql.Date(usuario.getDt_nascimento().getTimeInMillis());
			//pstmt.setDate(8, data);
			//pstmt.setDouble(9,  usuario.getVl_altura());
			pstmt.setDouble(7,  usuario.getVl_altura());
			

			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("Erro ao cadastrar");
		} finally {
			try {
				pstmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}

	/*@Override
	public List<Usuario> buscarTodos() {
		// TODO Auto-generated method stub
		List<Usuario> ListaUsuario = new ArrayList<Usuario>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conexao = HealthTrackDbManager.getInstance().getConnection();
			pstmt = conexao.prepareStatement("SELECT * FROM T_HT_USUARIO");
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				int cd_usuario = rs.getInt("cd_usuario");
				String nm_usuario = rs.getString("nm_usuario");
				java.sql.Date data = rs.getDate("dt_nascimento");
				Calendar dt_nascimento = Calendar.getInstance();
				dt_nascimento.setTimeInMillis(data.getTime());
				int vl_altura = rs.getInt("vl_altura");
				String ds_sexo = rs.getString("ds_sexo");
				String ds_apelido = rs.getString("ds_apelido");
				String ds_email = rs.getString("ds_email");
				String ds_pass1 = rs.getString("ds_pass1");
				String ds_pass2 = rs.getString("ds_pass2");
						
						Usuario usuario = new Usuario(cd_usuario, nm_usuario, dt_nascimento, ds_sexo, vl_altura, ds_email, ds_pass1, ds_pass2, ds_apelido);
						ListaUsuario.add(usuario);
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
		
		
					
		return ListaUsuario;
	}

	@Override
	public void atualizar(Usuario usuario) throws DBException {
		// TODO Auto-generated method stub
		PreparedStatement pstmt = null;
		
		try {
			conexao = HealthTrackDbManager.getInstance().getConnection();
			String sql = "UPDATE T_HT_USUARIO SET CD_USUARIO = ?, NM_USUARIO = ?, DS_SEXO = ?, DS_APELIDO = ?, DS_EMAIL = ?, DS_PASS1 = ?, DS_PASS2 = ?, DT_NASCIMENTO = ?, VL_ALTURA = ?";
			pstmt = conexao.prepareStatement(sql);
			pstmt.setInt(1,  usuario.getCd_usuario());
			pstmt.setString(2,  usuario.getNm_usuario());
			pstmt.setString(3,  usuario.getDs_sexo());
			pstmt.setString(4, usuario.getDs_apelido());
			pstmt.setString(5, usuario.getDs_email());
			pstmt.setString(6, usuario.getDs_pass1());
			pstmt.setString(7, usuario.getDs_pass2());
			java.sql.Date data = new java.sql.Date(usuario.getDt_nascimento().getTimeInMillis());
			pstmt.setDate(8, data);
			pstmt.setDouble(9,  usuario.getVl_altura());
			
						
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
	public void remover(int cd_usuario) throws DBException {
		// TODO Auto-generated method stub
		PreparedStatement pstmt = null;
		
		try {
			conexao = HealthTrackDbManager.getInstance().getConnection();
			String sql = "DELETE FROM T_HT_USUARIO WHERE CD_USUARIO = ?";
			pstmt = conexao.prepareStatement(sql);
			pstmt.setInt(1,  cd_usuario);
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

	@Override
	public Usuario buscarPorId(int codigoBusca) {
		// TODO Auto-generated method stub
		Usuario usuario = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
	    try {
	    	conexao = HealthTrackDbManager.getInstance().getConnection();
	    	pstmt = conexao.prepareStatement("SELECT * FROM T_HT_USUARIO WHERE CD_USUARIO = ?");
	    	pstmt.setInt(1, codigoBusca);
	    	rs = pstmt.executeQuery();

	      if (rs.next()){
	    	  	int cd_usuario = rs.getInt("cd_usuario");
				String nm_usuario = rs.getString("nm_usuario");
				java.sql.Date data = rs.getDate("dt_nascimento");
				Calendar dt_nascimento = Calendar.getInstance();
				dt_nascimento.setTimeInMillis(data.getTime());
				int vl_altura = rs.getInt("vl_altura");
				String ds_sexo = rs.getString("ds_sexo");
				String ds_apelido = rs.getString("ds_apelido");
				String ds_email = rs.getString("ds_email");
				String ds_pass1 = rs.getString("ds_pass1");
				String ds_pass2 = rs.getString("ds_pass2");
	        
	        usuario = new Usuario (cd_usuario, nm_usuario, dt_nascimento, ds_sexo, vl_altura, ds_email, ds_pass1, ds_pass2, ds_apelido);
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
	    return usuario;
	  }

}
*/

