package com.lames.client.dao.impl1;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;
import com.jake.core.Criteria;
import com.jake.core.SqlSession;
import com.jake.core.SqlSessionFactory;
import com.lames.client.dao.IClientDao;
import com.lames.client.model1.NewClientEntity;
import com.lames.client.utils.DbPoolUtils;
import com.lames.client.utils.SQLSessionUtil;


public class NewClientDaoImpl implements IClientDao  {
	
	public NewClientEntity find(String name, String password) {
		 NewClientEntity client=new NewClientEntity();
		 client.setName(name);
		 client.setPassword(password);
		 SqlSession sqlSession = SQLSessionUtil.getSqlSession();
		 Criteria criteria = new Criteria();
		 criteria.put("name=",name);
		 criteria.put("password=",password);
		 
		 try {
			return sqlSession.find(client, criteria);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		 
//		 try {
//			NewClientEntity client1=(NewClientEntity) connection.find(client,criteria);
//			return client1;
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			sqlSession.close();
//		}
		return null;
	}

	public NewClientEntity persist(NewClientEntity client) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = SQLSessionUtil.getSqlSession();
		try {
			if(sqlSession.save(client)>0) {
				return client;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				sqlSession.close();
		}
		return null;
	}

	public NewClientEntity findByName(String name) {
		NewClientEntity client=new NewClientEntity();
		client.setName(name);
		SqlSession sqlSession = SQLSessionUtil.getSqlSession();
		Criteria criteria = new Criteria();
		criteria.put("name=",name); 
		 try {
			return sqlSession.find(client, criteria);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		 
		return null;
	}

	public NewClientEntity findByClient(NewClientEntity c) {
		// TODO Auto-generated method stub
//		NewClientEntity client1=new NewClientEntity();
//		 client1.setName(c.getName());
//		 client1.setPassword(c.getPassword());
		 SqlSession sqlSession = SQLSessionUtil.getSqlSession();
		 Criteria criteria = new Criteria();
		 criteria.put("name=",c.getName());
		 criteria.put("password=",c.getPassword());
		 
		 try {
			return sqlSession.find(c, criteria);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		 
		return null;
	}




}
