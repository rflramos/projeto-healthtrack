package com.healthtrack.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class HealthTrackDbManager {
	
	private static HealthTrackDbManager healthTrackDbManager;
	
	private HealthTrackDbManager() {
		
	}
	
	public static HealthTrackDbManager getInstance() {
		if (healthTrackDbManager == null) {
			healthTrackDbManager = new HealthTrackDbManager();
		}
		return healthTrackDbManager;
	}
	
	
	/*
	 * Foi criado o m�todo obter conex�o statico para que esta classe n�o precise ser instanciada
	 * Ela retornara uma conex�o feita trav�s da URL "jdbc:oracle:thin:@localhost:1521:XE" o usu�rio system e a senha *****
	 */
	public Connection getConnection() {
		Connection connection = null;
		try {
			/*
			 * Procedimento para registrar o drive do Oracle
			 */
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			/*
			 * Abrir conex�o
			 */
			connection = DriverManager.getConnection(
					 "jdbc:oracle:thin:@localhost:1521:XE",
					 "USER",
					 "PASSWORD");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
}
