package com.lames.client.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

public class DbUtil {
	public static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String username = "system";
	public static final String password = "123456";
	public static final String driverClassName = "oracle.jdbc.OracleDriver";
	public static BasicDataSource ds;

	static {
		ds = new BasicDataSource();
		String driverClassNameProperty = PropertiesUtils.getProperty("driverClassName");
		String urlProperty = PropertiesUtils.getProperty("url");
		String usernameProperty = PropertiesUtils.getProperty("username");
		String passwordProperty = PropertiesUtils.getProperty("password");
		if (driverClassNameProperty != null) {
			ds.setDriverClassName(driverClassNameProperty);
		}else {
			ds.setDriverClassName(driverClassName);
		}
		if (urlProperty != null) {
			ds.setUrl(urlProperty);
		}else {
			ds.setUrl(url);
		}
		if (usernameProperty != null) {
			ds.setUsername(usernameProperty);
		}else {
			ds.setUsername(username);
		}
		if (driverClassNameProperty != null) {
			ds.setPassword(passwordProperty);
		}else {
			ds.setPassword(password);
		}
		
		
		ds.setInitialSize(20);
		ds.setMinIdle(30);
		ds.setMaxIdle(1000);
		ds.setMaxWaitMillis(10000);
	}

	public static Connection getConnection() {
		try {
			return ds.getConnection();
		} catch (SQLException e) {
			System.out.println("fail");
			e.printStackTrace();
			return null;
		}
	}
	
	public static DataSource getDataSource() {
		return ds;
	}

}
