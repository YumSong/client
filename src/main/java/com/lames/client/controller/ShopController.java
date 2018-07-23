package com.lames.client.controller;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jake.webmvc.annotation.Controller;
import com.jake.webmvc.annotation.Mapping;
import com.lames.client.model.ShopEntity;
import com.lames.client.services.IShopService;
import com.lames.client.services.impl.ShopServiceImpl;

@Controller
public class ShopController {
	private IShopService shopService = new ShopServiceImpl();
	
	@Mapping("/ShopListServlet")
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<ShopEntity> shopList = shopService.listShop();
		ShopEntity hotShop = null;
		if(shopList!=null&&shopList.size()!=0) {
			Random random = new Random();
			hotShop = shopList.get((random.nextInt(shopList.size())));
		}
		request.setAttribute("list", shopList);
		request.setAttribute("hotShop", hotShop);
		request.getRequestDispatcher("shops.jsp").forward(request,response);
	}

}
