package com.healthtrack.bean;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Classe AtividadesFisicas
 * @author Rafael Ramos
 * @version 1.0
 * Classe filha de Saude
 */


public class AtividadesFisicas extends Saude {
	
	/**
	 * Declaração das variáveis
	 */
	
	int cd_atividade;
	Calendar dt_atividade;
	String ds_atividade;
	int cd_usuario;
	
	/**
	 * Contrutor com parametros
	 * @param cd_atividade
	 * @param dt_atividade
	 * @param ds_atividade
	 * @param cd_usuario
	 */
	public AtividadesFisicas (int cd_atividade, String ds_atividade, int cd_usuario, Calendar dt_atividade) {
		this.cd_atividade = cd_atividade;
		this.ds_atividade = ds_atividade;
		this.cd_usuario = cd_usuario;
		this.dt_atividade = dt_atividade;
		
	}
	
	/**
	 * Construtos Padrão
	 */
	public AtividadesFisicas () {
		
	}
	
	/**
	 * Getter and setters
	 * 
	 */

	public int getCd_atividade() {
		return cd_atividade;
	}

	public void setCd_atividade(int cd_atividade) {
		this.cd_atividade = cd_atividade;
	}

	public Calendar getDt_atividade() {
		return dt_atividade;
	}

	public void setDt_atividade(Calendar dt_atividade) {
		this.dt_atividade = dt_atividade;
	}

	public String getDs_atividade() {
		return ds_atividade;
	}

	public void setDs_atividade(String ds_atividade) {
		this.ds_atividade = ds_atividade;
	}

	public int getCd_usuario() {
		return cd_usuario;
	}

	public void setCd_usuario(int cd_usuario) {
		this.cd_usuario = cd_usuario;
	}
	
	/**
	 * Metodo toString sobrecarregado para que possa ser impresso informação contida na tabela 
	 */
	@Override
	public String toString() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		return "AtividadesFisicas [cd_atividade =" + cd_atividade
												   + ", dt_atividade="
												   + sdf.format(dt_atividade.getTime()
												   + ", ds_atividade=" + ds_atividade
												   + ", cd_usuario=" + cd_usuario)
											
									+ "]";
	
	
	}
	
}

