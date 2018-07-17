package com.healthtrack.bean;


import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Classe de alimentação
 * @author Rafael Ramos
 * @version 1.0
 * Classe segue o modelo JavaBean
 * Classe filha de Saude
 */

public class Alimentacao extends Saude {
	

	/**
	 * declaracao de variaveis
	 * tipoAlimento - registrar o tipo de alimento consumido
	 */
	private int cd_alimento;
	private String ds_alimento;
	private int cd_usuario;
	private int vl_calorias_ganhas;
	private Calendar dt_registro;
	private String ds_refeicao;
	
	/**
	 * Contrutor com parametros
	 * @param cd_alimento
	 * @param ds_alimento
	 * @param cd_usuario
	 * @param vl_calorias_ganhas
	 * @param dt_registro
	 */
	public Alimentacao (int cd_alimento, String ds_alimento, int cd_usuario,int vl_calorias_ganhas, Calendar dt_registro) {
		this.cd_alimento = cd_alimento;
		this.ds_alimento = ds_alimento;
		this.cd_usuario = cd_usuario;
		this.vl_calorias_ganhas = vl_calorias_ganhas;
		this.dt_registro = dt_registro;
	}

	/**
	 * Construtor Padrão
	 */
	public Alimentacao(){
		
	}
	
	//Getters and Setters
	
	public Calendar getDt_registro() {
		return dt_registro;
	}

	public void setDt_registro(Calendar dt_registro) {
		this.dt_registro = dt_registro;
	}
	
			
	public int getCd_alimento() {
		return cd_alimento;
	}

	public void setCd_alimento(int cd_alimento) {
		this.cd_alimento = cd_alimento;
	}

	public String getDs_alimento() {
		return ds_alimento;
	}

	public void setDs_alimento(String ds_alimento) {
		this.ds_alimento = ds_alimento;
	}

	public int getCd_usuario() {
		return cd_usuario;
	}

	public void setCd_usuario(int cd_usuario) {
		this.cd_usuario = cd_usuario;
	}

	public int getVl_calorias_ganhas() {
		return vl_calorias_ganhas;
	}

	public void setVl_calorias_ganhas(int vl_calorias_ganhas) {
		this.vl_calorias_ganhas = vl_calorias_ganhas;
	}
	
	

	public String getDs_refeicao() {
		return ds_refeicao;
	}

	public void setDs_refeicao(String ds_refeicao) {
		this.ds_refeicao = ds_refeicao;
	}

	/**
	 * Metodo toString sobrecarregado para que possa ser impresso informação contida na tabela 
	 */
	@Override
	public String toString() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return "Alimentacao [cd_alimento =" + cd_alimento
											+ ", ds_alimento=" + ds_alimento
											+ ", cd_usuario=" + cd_usuario
											+ ", vl_calorias_ganhas=" + vl_calorias_ganhas
											+ ", dt_registro="
											+ sdf.format(dt_registro.getTime())
									+ "]";
	}
	
}
