package com.jake.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import com.jake.webmvc.annotation.Controller;
import com.jake.webmvc.annotation.Mapping;

@Controller
public class TestController {

	@Mapping("/test")
	public void test(HttpServletResponse response) throws IOException {
		response.getWriter().write("Hello test");
	}
	
}
