package com.healthtrack.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.healthtrack.bean.Alimentacao;
import com.healthtrack.dao.AlimentacaoDAO;
import com.healthtrack.exception.DBException;
import com.healthtrack.factory.DAOFactory;
import com.healthtrack.dao.impl.AlimentacaoDAOImpl;

import sun.util.BuddhistCalendar;

@WebServlet("/alimentacao")
public class AlimentacaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private AlimentacaoDAO dao;
	
	@Override
	public void init() throws ServletException {
		super.init();
		dao = DAOFactory.getAlimentacaoDAO();
	}
	
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		  String acao = request.getParameter("acao");
		   
		  switch (acao) {
		  case "cadastrar":
		    cadastrar(request, response);
		    break;
		  case "editar":
		    editar(request,response);
		    break;
		  }
	}
	
		
	private void editar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			  
			  		
		try{
			int codigo = Integer.parseInt(request.getParameter("codigo"));
			String alimento = request.getParameter("alimento");
			int calorias = Integer.parseInt(request.getParameter("calorias"));
			SimpleDateFormat format = new SimpleDateFormat ("dd/MM/yyyy");
			Calendar data = Calendar.getInstance();
			data.setTime(format.parse(request.getParameter("data")));
			
			Alimentacao alimentacao = new Alimentacao(codigo, alimento, 10, calorias, data);
			dao.atualizar(alimentacao);
			
			
			request.setAttribute("msg",  "Dados Atualizados");
		} catch(DBException db) {
			db.printStackTrace();
			request.setAttribute("erro", "Erro ao Atualizar");
		} catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("erro",  "Valide seus dados");
		}
		
		
		listar(request, response);
	
	}
	
	private void cadastrar(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException { 
	 
	 try{
	 	String alimento = request.getParameter("alimento");
		int calorias = Integer.parseInt(request.getParameter("calorias"));
		SimpleDateFormat format = new SimpleDateFormat ("dd/MM/yyyy");
		Calendar data = Calendar.getInstance();
		data.setTime(format.parse(request.getParameter("data")));
		
		
	
		Alimentacao alimentacao = new Alimentacao(0, alimento, 10, calorias, data);
		dao.cadastrar(alimentacao);
		
	request.setAttribute("msg", "Alimento cadastrado!");
   } catch (DBException db) {
    db.printStackTrace();
    request.setAttribute("erro", "Erro ao cadastrar");
  } catch (Exception e) {
    e.printStackTrace();
    request.setAttribute("erro", "Por favor, valide os dados");
  }
  request.getRequestDispatcher("alimentacao.jsp").forward(request, response);
}

							
		
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  String acao = request.getParameter("acao");
	    
	  switch (acao) {
	  case "listar":
	    listar(request, response);
	    break;
	  case "abrir-form-edicao":
	    int id = Integer.parseInt(request.getParameter("codigo"));
	    Alimentacao alimentacao = dao.buscarPorId(id);
	    request.setAttribute("alimento", alimentacao);
	    request.getRequestDispatcher("editar-alimento.jsp").forward(request, response);
	  } 
	}


	private void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Alimentacao> lista = dao.buscarTodos();
	    request.setAttribute("alimentos", lista);
	    request.getRequestDispatcher("lista-alimento.jsp").forward(request, response);
	}
}



