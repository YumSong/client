<%@page import="com.lames.client.model.RecipeEntity"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>		
	<table align="center" border=1px>
		<tr>
			<td>ID</td>
			<td>NAME</td>
			<td>PICTURE</td>
			<td>DETAIL</td>
			<td>PRICE</td>
			<td>return</td>
		</tr>
		<c:forEach items="${recipeList}" var="recipe">
			<tr>
				<td>${recipe.reId }</td>
				<td>${recipe.reName }</td>
				<td><img alt="" src="${recipe.rePic}"></td>
				<td>${recipe.detail }</td>
				<td>${recipe.price }</td>
				<td><a href="#" onclick="javascript:history.back(-1);">返回到上一页</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>