package com.lames.client.dao;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.lames.client.dao.impl.ShopDaoImpl;
import com.lames.client.model.ShopEntity;

import junit.framework.Assert;

public class IShopDaoTest {

	private IShopDao shopDao;

	@Before
	public void init() throws SQLException {
		shopDao = new ShopDaoImpl();
	}
	
	@Test
	public void testFindAll() {
		List<ShopEntity> list = shopDao.findAll();
		Assert.assertTrue(list.size()!=0);;
	}

}
