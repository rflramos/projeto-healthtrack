
package com.healthtrack.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.healthtrack.bean.Usuario;
import com.healthtrack.dao.UsuarioDAO;
import com.healthtrack.exception.DBException;
import com.healthtrack.factory.DAOFactory;

/**
 * Servlet implementation class CadastroServlet
 */
@WebServlet("/cadastro")
public class CadastroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	private UsuarioDAO dao;
   	
   	@Override
   	public void init() throws ServletException {
   		super.init();
   		dao = DAOFactory.getUsuarioDAO();
   	}
   	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			String nome = request.getParameter("nome");
			String sexo = request.getParameter("sexo");
			String apelido = request.getParameter("apelido");
			String email = request.getParameter("email");
			String pswd1 = request.getParameter("pswd1");
			String pswd2 = request.getParameter("pswd2");
			//SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			//Calendar data = Calendar.getInstance();
			//data.setTime(format.parse(request.getParameter("data")));
			
			double altura = Double.parseDouble(request.getParameter("altura"));
			//data
			Usuario usuario = new Usuario(0, nome, sexo, apelido, email, pswd1, pswd2, altura);
			dao.cadastrar(usuario);
			
			request.setAttribute("msg",  "Usuario Cadastrado");
		} catch(DBException db) {
			db.printStackTrace();
			request.setAttribute("erro", "Erro ao Cadastrar");
		} catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("erro",  "Valide seus dados");
		}
		request.getRequestDispatcher("cadastro.jsp").forward(request, response);
	
		
	}

}
