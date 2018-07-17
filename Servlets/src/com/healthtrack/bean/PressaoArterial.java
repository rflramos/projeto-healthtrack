package com.healthtrack.bean;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Classe PressaoArterial
 * @author rrosilva
 * @version 1.0
 */



public class PressaoArterial extends Saude {

	/**
	 * declaração das variaveis
	 * sistolico - registro do volume sistolico
	 * diastolico - registro do volume diastolico
	 * situacao - registro da situação da medição
	 */
	int cd_pressao;
	String ds_status_pressao;
	Calendar dt_registro_pressao;
	int cd_usuario;
	float vl_sistolica;
	float vl_diastolica;
	
	/**
	 * Contrutor com parametros
	 * @param cd_pressao
	 * @param ds_status_pressao
	 * @param cd_usuario
	 * @param vl_sistolica
	 * @param vl_diastolica
	 * @param dt_registro_pressao
	 */
	public PressaoArterial (int cd_pressao, String ds_status_pressao, int cd_usuario, float vl_sistolica, float vl_diastolica, Calendar dt_registro_pressao) {
		this.cd_pressao = cd_pressao;
		this.ds_status_pressao = ds_status_pressao;
		this.cd_usuario = cd_usuario;
		this.vl_sistolica = vl_sistolica;
		this.vl_diastolica = vl_diastolica;
		this.dt_registro_pressao = dt_registro_pressao;
	}
	
	/**
	 * Contrutor Padrão
	 */
	
	public PressaoArterial(){
		
	}
	
	//Getters and Setters

	public int getCd_pressao() {
		return cd_pressao;
	}

	public void setCd_pressao(int cd_pressao) {
		this.cd_pressao = cd_pressao;
	}

	public String getDs_status_pressao() {
		return ds_status_pressao;
	}

	public void setDs_status_pressao(String ds_status_pressao) {
		this.ds_status_pressao = ds_status_pressao;
	}

	public Calendar getDt_registro_pressao() {
		return dt_registro_pressao;
	}

	public void setDt_registro_pressao(Calendar dt_registro_pressao) {
		this.dt_registro_pressao = dt_registro_pressao;
	}

	public int getCd_usuario() {
		return cd_usuario;
	}

	public void setCd_usuario(int cd_usuario) {
		this.cd_usuario = cd_usuario;
	}

	public float getVl_sistolica() {
		return vl_sistolica;
	}

	public void setVl_sistolica(float vl_sistolica) {
		this.vl_sistolica = vl_sistolica;
	}

	public float getVl_diastolica() {
		return vl_diastolica;
	}

	public void setVl_diastolica(float vl_diastolica) {
		this.vl_diastolica = vl_diastolica;
	}

	/**
	 * Metodo toString sobrecarregado para que possa ser impresso informação contida na tabela
	 */
	@Override
	public String toString() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		return "PressaoArterial [cd_pressao =" + cd_pressao
											+ ", ds_status_pressao=" + ds_status_pressao
											+ ", cd_usuario=" + cd_usuario
											+ ", vl_sistolica=" + vl_sistolica
											+ ", vl_diastolica" + vl_diastolica
											+ ", dt_registro_pressao="
											+ sdf.format(dt_registro_pressao.getTime())
									+ "]";
	}
	
	
	
}



























