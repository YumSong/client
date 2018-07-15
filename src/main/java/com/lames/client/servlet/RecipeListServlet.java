package com.lames.client.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lames.client.model.RecipeEntity;
import com.lames.client.services.IRecipeService;
import com.lames.client.services.impl.RecipeServiceImpl;


/**
 * Servlet implementation class RecipeListServlet
 */
public class RecipeListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private IRecipeService recipeService = new RecipeServiceImpl();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RecipeListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("start RecipeListServlet");
		int shopId=Integer.parseInt(request.getParameter("shopid"));
		List<RecipeEntity> recipeList = recipeService.listRecipeByShopId(shopId);
		request.setAttribute("recipeList", recipeList);
		request.getRequestDispatcher("recipe.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
