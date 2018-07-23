package com.lames.client.utils;


import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

import com.jake.core.SqlSession;
import com.jake.core.SqlSessionFactory;

public class SQLSessionUtil {
	private static SqlSessionFactory factory;
	
	static {
		DataSource ds = new BasicDataSource();
		String driverClassNameProperty = PropertiesUtils.getProperty("driverClassName");
		String urlProperty = PropertiesUtils.getProperty("url");
		String usernameProperty = PropertiesUtils.getProperty("username");
		String passwordProperty = PropertiesUtils.getProperty("password");
		factory = new SqlSessionFactory(PropertiesUtils.getProperty("model.package"));
		
		
		((BasicDataSource) ds).setDriverClassName(driverClassNameProperty);
		((BasicDataSource) ds).setUrl(urlProperty);
		((BasicDataSource) ds).setUsername(usernameProperty);
		((BasicDataSource) ds).setPassword(passwordProperty);
		
		((BasicDataSource) ds).setInitialSize(20); // 初始连接数量
		((BasicDataSource) ds).setMinIdle(3); //最少保持几条空闲的连接
		((BasicDataSource) ds).setMaxTotal(1000); //最大连接数量
		((BasicDataSource) ds).setMaxWaitMillis(10000); //最大等待时间
		
        factory.setDataSource(ds);
	}
	
	public static SqlSession getSqlSession() {
		return factory.createSqlSession();
	}
}
