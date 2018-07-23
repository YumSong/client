package com.lames.client.dao1;

import static org.junit.Assert.*;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.junit.Before;
import org.junit.Test;

import com.jake.core.Criteria;
import com.jake.core.SqlSession;
import com.jake.core.SqlSessionFactory;
import com.lames.client.dao.IClientDao;
import com.lames.client.dao.impl1.NewClientDaoImpl;
import com.lames.client.model1.NewClientEntity;

import junit.framework.Assert;

public class INewClientDaoTest {
	SqlSessionFactory factory = new SqlSessionFactory("com.jake.model");
	private IClientDao clientDao;
	
	@Before
	  public void init() throws Exception{
		clientDao=new NewClientDaoImpl();
    
    }

	@Test
	public void testFindClient() throws SQLException {
		String name="hahaha";
		String password="123456";
		NewClientEntity client=clientDao.find(name,password);
		Assert.assertNotNull(client);
		
	}
	
	@Test
	public void testFindByName() {
		String name1="hahaha";
		NewClientEntity client=clientDao.findByName(name1);
		Assert.assertNotNull(client);
		
	}
	
	@Test
	public void testPersistClient() throws SQLException{
		NewClientEntity client=new NewClientEntity(3,"HAHAHA","123456"); 
		NewClientEntity c=clientDao.persist(client);
		Assert.assertNotNull(c);
	}
	
	@Test
	public void testFindByClient() {
		NewClientEntity client1=new NewClientEntity(1,"hahaha","123456"); 
		NewClientEntity c1=clientDao.findByClient(client1);
		Assert.assertNotNull(c1);
	}
}
