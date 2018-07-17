package com.healthtrack.bean;

/**
 * @autor Rafael Ramos
 * Superclasse Saude
 * Padrão Javabean
 * Interface Serializable
 */

import java.io.Serializable;

public class Saude {
	private static final long serialVersionUID = 1L;
	
	/**
	 * declaracao de variavesis
	 * hora - registrar a hora do que foi consumido, atividade executada ou pressao coletada
	 * data - registrar data da ações 
	 * descricao - Informar o que foi executado
	 * calorias - registrar as calorias
	 */
	private String hora;
	private String data;
	private String descricao;
	private int calorias;
	
	/**
	 * 	
	 * @return hora informada
	 */
	public String getHora() {
		return hora;
	}
	/**
	 * 
	 * @param hora Registrar hora
	 */
	public void setHora(String hora) {
		this.hora = hora;
	}
	/**
	 * 
	 * @return data informada
	 */
	public String getData() {
		return data;
	}
	/**
	 * 
	 * @param data registrar data
	 */
	public void setData(String data) {
		this.data = data;
	}
	/**
	 * 
	 * @return descricao da ação executada
	 */
	public String getDescricao() {
		return descricao;
	}
	/**
	 * 
	 * @param descricao registrar ação executada
	 */
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	/**
	 * 
	 * @return calorias registradas
	 */
	public int getCalorias() {
		return calorias;
	}
	/**
	 * 
	 * @param calorias registrar calorias consumidas
	 */
	public void setCalorias(int calorias){
		this.calorias = calorias;
	}
	
	/**
	 * Construtor padrão
	 */
	
	public Saude(){	
		
	}
	
		
}
