package com.lames.client.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jake.webmvc.annotation.Controller;
import com.jake.webmvc.annotation.Mapping;
import com.lames.client.model.RecipeEntity;
import com.lames.client.model1.NewClientEntity;
import com.lames.client.services.IClientService;
import com.lames.client.services.impl1.NewClientServiceImpl;
import com.lames.client.validator.IValidator;
import com.lames.client.validator.PasswordValidator;
import com.lames.client.validator.UsernameValidator;



@Controller
public class ClientController {
	private IClientService clientService=new NewClientServiceImpl();
	private IValidator uv=new UsernameValidator();
	private IValidator pv=new PasswordValidator();
	
	@Mapping("/login")
	public void Login(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 请求参数的接收
		request.setCharacterEncoding("UTF-8");
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		PrintWriter out=response.getWriter();
		//校验
		List<String> err1=uv.validate(name);
		List<String> err2=pv.validate(password);
		err1.addAll(err2);
		if(err1.size()!=0) {
			request.setAttribute("errMsg", err1);
		}else {
		NewClientEntity c=clientService.login(name, password);
		System.out.println(c);
		if(c==null) {
			//out.print("用户名或密码不正确");
			out.print(403);
		}else {
			//out.print("登陆成功");
			Cookie cookie = new Cookie("cname", c.getName());
			cookie.setMaxAge(6000);
			response.addCookie(cookie);
			out.print(200);
		}
		out.flush();
		out.close();
		}
		
	}
	
	@Mapping("/checkName")
	public void checkName(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 请求参数的接收
		request.setCharacterEncoding("UTF-8");
		String name=request.getParameter("name");
		NewClientEntity ce = new NewClientEntity();
		ce.setName(name);
		NewClientEntity checkRs = clientService.checkName(ce);
		
		PrintWriter writer = response.getWriter();
	    if(checkRs != null){
	    	// the registe request is deny, send state code 403
	    	writer.print(403);
//	    	request.setAttribute("data", false);
	    }else {
	    	// pass the check
	    	writer.print(200);
	    }
	    writer.flush();
	    writer.close();
	}
	
	@Mapping("/register")
	public void register(NewClientEntity client,HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 请求参数的接收
		request.setCharacterEncoding("UTF-8");
		String cname=request.getParameter("name");
		String password=request.getParameter("password");
		// 这里可以再次校验用户名，或者插入时数据库校验
		//NewClientEntity client = new NewClientEntity(null,cname, password);
		NewClientEntity regRs = clientService.register(client);
		System.out.println(client);
		PrintWriter writer = response.getWriter();
		if(regRs != null) {
			// registe success
			writer.print(200);
		} else {
			// registe handle failed
			writer.print(403);
		}
		writer.flush();
		writer.close();
		
	}
	
	@Mapping("/loginbyclient")
	public void loginByClient(NewClientEntity client,HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 请求参数的接收
		request.setCharacterEncoding("UTF-8");
		String cname=request.getParameter("name");
		String password=request.getParameter("password");
		// 这里可以再次校验用户名，或者插入时数据库校验
		//NewClientEntity client = new NewClientEntity(null,cname, password);
		NewClientEntity regRs = clientService.loginByClient(client);
		System.out.println(client);
		PrintWriter writer = response.getWriter();
		if(regRs != null) {
			// registe success
			writer.print(200);
		} else {
			// registe handle failed
			writer.print(403);
		}
		writer.flush();
		writer.close();
		
	}
	
	
	

}
