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
	 * Foi criado o método obter conexão statico para que esta classe não precise ser instanciada
	 * Ela retornara uma conexão feita través da URL "jdbc:oracle:thin:@localhost:1521:XE" o usuário system e a senha *****
	 */
	public Connection getConnection() {
		Connection connection = null;
		try {
			/*
			 * Procedimento para registrar o drive do Oracle
			 */
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			/*
			 * Abrir conexão
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
