package com.lames.client.utils;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author HONGTO
 * @date 7/11/2018 9:28 AM
 */
public class DbPoolUtils {

	public static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String username = "system";
	public static final String password = "123456";
	public static final String driverClassName = "oracle.jdbc.OracleDriver";
	public static BasicDataSource ds;

	static {
		ds = new BasicDataSource();
		ds.setDriverClassName(driverClassName);
		ds.setUrl(url);
		ds.setUsername(username);
		ds.setPassword(password);

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
}
