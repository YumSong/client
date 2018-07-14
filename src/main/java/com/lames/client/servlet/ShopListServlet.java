package com.lames.client.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lames.client.model.ShopEntity;
import com.lames.client.services.IShopService;
import com.lames.client.services.impl.ShopServiceImpl;

/**
 * Servlet implementation class ShopListServlet
 */
public class ShopListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private IShopService shopService = new ShopServiceImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShopListServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("start ShopListServlet");
		List<ShopEntity> shopList = shopService.listShop();
		request.setAttribute("list", shopList);
		request.getRequestDispatcher("result.jsp").forward(request,response);
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}