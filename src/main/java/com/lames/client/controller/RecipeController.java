package com.lames.client.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jake.webmvc.annotation.Controller;
import com.jake.webmvc.annotation.Mapping;
import com.lames.client.model.RecipeEntity;
import com.lames.client.services.IRecipeService;
import com.lames.client.services.impl.RecipeServiceImpl;

@Controller
public class RecipeController {

	private IRecipeService recipeService = new RecipeServiceImpl();
	
	@Mapping("/RecipeListServlet")
	public void getRecipeList(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("start RecipeListServlet");
		int shopId = Integer.parseInt(request.getParameter("shopid"));
		List<RecipeEntity> recipeList = recipeService.listRecipeByShopId(shopId);
		request.setAttribute("recipeList", recipeList);
		request.getRequestDispatcher("food.jsp").forward(request, response);
	}

}
