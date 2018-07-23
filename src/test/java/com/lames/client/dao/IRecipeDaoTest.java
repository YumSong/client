package com.lames.client.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.jake.core.SqlSessionFactory;
import com.lames.client.dao.impl.RecipeDaoImpl;
import com.lames.client.model.RecipeEntity;

public class IRecipeDaoTest {
	

	private IRecipeDao recipeDao;

	@Before
	public void init() throws Exception {
		recipeDao = new RecipeDaoImpl();
	}
	
	@Test
	public void testFindAll() {
		List<RecipeEntity> list = recipeDao.findAll();
		//Assert.assertTrue(list.size()==0);
		Assert.assertEquals(list.isEmpty(),false);
		System.out.println(list);
	}
	
	@Test
	public void testFindByShopId() {
		int shopid=1;
		List<RecipeEntity> list=recipeDao.findByShopId(shopid);
		//Assert.assertTrue(list.size()==0);
		Assert.assertEquals(6,list.size());
	}

}
