package com.lames.client.dao;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.lames.client.dao.impl.RecipeDaoImpl;
import com.lames.client.model.RecipeEntity;

import junit.framework.Assert;

public class IRecipeDaoTest {

	private IRecipeDao recipeDao;

	@Before
	public void init() throws SQLException {
		recipeDao = new RecipeDaoImpl();
	}
	
	@Test
	public void testFindAll() {
		List<RecipeEntity> list = recipeDao.findAll();
		Assert.assertTrue(list.size()==0);;
	}

}
