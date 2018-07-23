<%@ page language="java" pageEncoding="utf-8"%>
<%@ page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>result</title>
<style>
.div1 {
	border: 1px solid #f00
}
/* .td{width:100px;overflow:hidden} */
</style>
</head>
<body>

	<table>
		<tr>
			<td width="20%">
					</td>
			<td width="70%">
				<div align="center">
					<table align="center" border=1px>
						<tr>
							<td>NAME</td>
							<td>shopPic</td>
							<td>businessPic</td>
							<td>address</td>
						</tr>
						<c:forEach items="${list}" var="shop">
							<tr>
								<td><a
									href="http://localhost:9090/client/RecipeListServlet?shopid=${shop.shopid}"><h5>${shop.shopName}</h5></a></td>
								<td><img src="${shop.shopPic}" height="200" width="400"></td>
								<td><img src="${shop.businessPic}" height="200" width="250"></td>
								<td><h5>${shop.address}</h5></td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</td>
			<td width="30%"></td>
			<td width="20%">
				<div class="div1">
					今日推薦<br> <img src="${hotShop.shopPic}" height="100"
						width="200">
					<h5>
						店名：<a href="http://localhost:9090/client/RecipeListServlet?shopid=${hotShop.shopid}">${hotShop.shopName}</a>
					</h5>
					 地址：${hotShop.address}
				</div>
			</td>
		</tr>
	</table>




</body>
</html>