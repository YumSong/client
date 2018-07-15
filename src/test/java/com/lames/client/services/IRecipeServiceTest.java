package com.lames.client.services;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lames.client.model.RecipeEntity;
import com.lames.client.services.impl.RecipeServiceImpl;

public class IRecipeServiceTest {
	private IRecipeService recipeService;

	@Before
	public void init() {
		recipeService=new RecipeServiceImpl();
		
	}

	@Test
	public void testRecipeList() {
		List<RecipeEntity> recipeList=recipeService.listRecipe();
		for(RecipeEntity r:recipeList) {
			System.out.println(r.toString());
		}
		//Assert.assertTrue(recipeList.size()==4);
		Assert.assertEquals(10,recipeList.size());
	}
	
	@Test
	public void testRecipeByShopId() {
		int shopid=1;
		List<RecipeEntity> recipeList=recipeService.listRecipeByShopId(shopid);
		for(RecipeEntity r:recipeList) {
			System.out.println(r.toString());
		}
		Assert.assertTrue(recipeList.size()==6);
			
	}

}
