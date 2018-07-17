package com.healthtrack.bean;

/**
 * Classe do usuário
 * @author rrosilva
 * @version 1.0
 * Classe do tipo Serializable
 */
import java.io.Serializable;
import java.util.Calendar;

public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L;


	
	private int cd_usuario;
	private String nm_usuario;
	//private Calendar dt_nascimento;
	private String ds_sexo;
	private String ds_apelido;
	private String ds_email;
	private String ds_pass1;
	private String ds_pass2;
	private double vl_altura;
	
	public Usuario(int cd_usuario, String nm_usuario, String ds_sexo, String ds_apelido, String ds_email,
			String ds_pass1, String ds_pass2, double vl_altura) {
		super();
		this.cd_usuario = cd_usuario;
		this.nm_usuario = nm_usuario;
		this.ds_sexo = ds_sexo;
		this.ds_apelido = ds_apelido;
		this.ds_email = ds_email;
		this.ds_pass1 = ds_pass1;
		this.ds_pass2 = ds_pass2;
		this.vl_altura = vl_altura;
	}
	
	public Usuario() {
		super();
	}

	public int getCd_usuario() {
		return cd_usuario;
	}

	public void setCd_usuario(int cd_usuario) {
		this.cd_usuario = cd_usuario;
	}

	public String getNm_usuario() {
		return nm_usuario;
	}

	public void setNm_usuario(String nm_usuario) {
		this.nm_usuario = nm_usuario;
	}

	public String getDs_sexo() {
		return ds_sexo;
	}

	public void setDs_sexo(String ds_sexo) {
		this.ds_sexo = ds_sexo;
	}

	public String getDs_apelido() {
		return ds_apelido;
	}

	public void setDs_apelido(String ds_apelido) {
		this.ds_apelido = ds_apelido;
	}

	public String getDs_email() {
		return ds_email;
	}

	public void setDs_email(String ds_email) {
		this.ds_email = ds_email;
	}

	public String getDs_pass1() {
		return ds_pass1;
	}

	public void setDs_pass1(String ds_pass1) {
		this.ds_pass1 = ds_pass1;
	}

	public String getDs_pass2() {
		return ds_pass2;
	}

	public void setDs_pass2(String ds_pass2) {
		this.ds_pass2 = ds_pass2;
	}

	public double getVl_altura() {
		return vl_altura;
	}

	public void setVl_altura(double vl_altura) {
		this.vl_altura = vl_altura;
	}
	
	
	
}

	