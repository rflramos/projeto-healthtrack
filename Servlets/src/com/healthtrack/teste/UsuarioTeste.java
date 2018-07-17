package com.healthtrack.teste;

import java.util.Calendar;
import java.util.List;

import com.healthtrack.bean.Usuario;
import com.healthtrack.dao.UsuarioDAO;
import com.healthtrack.dao.impl.UsuarioDAOImpl;
import com.healthtrack.exception.DBException;
import com.healthtrack.factory.DAOFactory;

public class UsuarioTeste {

	public static void main(String[] args) throws DBException {
		// TODO Auto-generated method stub
		
		UsuarioDAO dao = new UsuarioDAOImpl();
		
		Usuario usuario = new Usuario();
		
		
		usuario.setNm_usuario("Rafa");
		usuario.setDs_sexo("M");
		usuario.setCd_usuario(5);
		usuario.setDs_email("rflramos@gmail.com");
		usuario.setDs_pass1("123456");
		usuario.setDs_pass2("123456");
		//usuario.setDt_nascimento(Calendar.getInstance());
		usuario.setVl_altura(1.73);
		
		

		
		dao.cadastrar(usuario);
		
		System.out.println("Cadastrado");
		
	}
}
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		UsuarioDAO dao = DAOFactory.getUsuarioDAO(); 
//		
//		Usuario usuario = new Usuario (0, "Rafael Ramos", Calendar.getInstance(), "M", 1.73, "rflramos@gmail.com", "rrosilva", "123@mudar");
//		
//					
//		try {
//			
//			dao.cadastrar(usuario);
//			System.out.println("Usuario Cadastrado");
//		} catch (DBException e) {
//			e.printStackTrace();
//		}
//	
//
//		
//		usuario = dao.buscarPorId(1);
//		usuario.setDs_login("rrosilva");
//		
//		try {
//			dao.atualizar(usuario);
//			System.out.println("Usuario Atualizado");
//		} catch (DBException e) {
//			e.printStackTrace();
//		}
//	
//	
//	List<Usuario> listaUsuario = dao.buscarTodos();
//	for (Usuario item : listaUsuario) {
//		System.out.println(item.getCd_usuario() + " " + item.getNm_usuario() + " " + item.getDs_email() + " " + item.getDs_login() + " " + item.getDt_nascimento());
//	}
//	
//	try {
//		dao.remover(1);
//		System.out.println("Usuario Removido");
//	} catch (DBException e) {
//		e.printStackTrace();
//	}
//  }
//}

	


