package com.lames.client.services.impl;

import java.sql.SQLException;
import java.util.List;

import com.lames.client.dao.IRecipeDao;
import com.lames.client.dao.impl.RecipeDaoImpl;
import com.lames.client.dao.impl.ShopDaoImpl;
import com.lames.client.model.RecipeEntity;
import com.lames.client.model.ShopEntity;
import com.lames.client.services.IRecipeService;

public class RecipeServiceImpl implements IRecipeService{
	private IRecipeDao recipeDao;
	
	

	public RecipeServiceImpl() {
		try {
			recipeDao = new RecipeDaoImpl();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<RecipeEntity> listRecipe() {
		// TODO Auto-generated method stub
		List<RecipeEntity> recipes = recipeDao.findAll();
		if(recipes.isEmpty()) {
			return null;
		}else {
			return recipes;
		}
	
	}

	public List<RecipeEntity> listRecipeByShopId(int shopid) {
		// TODO Auto-generated method stub
		List<RecipeEntity> recipes = recipeDao.findByShopId(shopid);
		if(recipes.isEmpty()) {
			return null;
		}else {
			return recipes;
		}
		
	}

}
