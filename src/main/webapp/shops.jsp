<%@ page language="java" pageEncoding="utf-8"%>
<%@ page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Events</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css"
	media="all" />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<!--theme-style-->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<script type="application/x-javascript">
	
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 

</script>
<!---->
<link
	href='https://fonts.googleapis.com/css?family=Raleway:400,200,100,300,500,600,700,800,900'
	rel='stylesheet' type='text/css'>
<link
	href='https://fonts.googleapis.com/css?family=Open+Sans+Condensed:300,300italic,700'
	rel='stylesheet' type='text/css'>
<link href="css/styles.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="css/component.css" />
<!-- animation-effect -->
<link href="css/animate.min.css" rel="stylesheet">
<script src="js/wow.min.js"></script>
<script>
	new WOW().init();
</script>
<!-- //animation-effect -->

</head>
<body>
	<div class="header head">
		<div class="container">
			<div class="logo animated wow pulse" data-wow-duration="1000ms"
				data-wow-delay="500ms">
				<h1>
					<a href="index.html"><span></span><img src="images/oo.png"
						alt=""><img src="images/oo.png" alt=""></a>
				</h1>
			</div>
			<div class="clearfix"></div>
		</div>
		<!-- start search-->

	</div>
	<!--content-->
	<div class="content">
		<div class="events">
			<div class="container">
				<div class="events-top">
					<div class="col-md-4 events-left animated wow fadeInLeft"
						data-wow-duration="1000ms" data-wow-delay="500ms">
						<h3>Annex Restaurant</h3>
						<label><i class="glyphicon glyphicon-menu-up"></i></label> <span>There
							are many food</span>
					</div>
					<div class="col-md-8 events-right animated wow fadeInRight"
						data-wow-duration="1000ms" data-wow-delay="500ms">
						<p>The system is a food platform that is similar to the
							hungry, but it is hard to have the technology. Therefore, the
							food is a complete takeout platform management system for the
							takeout platform entrepreneurs. Function, meet the needs of the
							user at any time.</p>
					</div>
					<div class="clearfix"></div>
				</div>

				<div class="col-md-7 events-bottom2 animated wow fadeInDown"
					data-wow-duration="1000ms" data-wow-delay="500ms">
					<h3>Top Shop：${hotShop.shopName}</h3>
					<label><i class="glyphicon glyphicon-menu-up"></i></label>
					<p>address：${hotShop.address}<br>${hotShop.introduction}</p>
					<div class="read-more">
						<a class="link link-yaku" href="http://localhost:9090/client/RecipeListServlet?shopid=${hotShop.shopid}"> <span>R</span><span>e</span><span>a</span><span>d</span>
							<span>M</span><span>o</span><span>r</span><span>e</span>
						</a>
					</div>
				</div>
				<div class="col-md-5 events-bottom1 animated wow fadeInUp"
					data-wow-duration="1000ms" data-wow-delay="500ms">
					<a href="http://localhost:9090/client/RecipeListServlet?shopid=${hotShop.shopid}"><img src="${hotShop.shopPic}" alt=""
						class="img-responsive"></a>
				</div>
				<div class="clearfix"></div>

				<c:forEach items="${list}" var="shop">

					<div class="events-bottom">
						<div class="col-md-5 events-bottom1 animated wow fadeInRight"
							data-wow-duration="1000ms" data-wow-delay="500ms">
							<a
								href="http://localhost:9090/client/RecipeListServlet?shopid=${shop.shopid}"><img
								src="${shop.shopPic}" alt="" class="img-responsive"></a>
						</div>
						<div class="col-md-7 events-bottom2 animated wow fadeInLeft"
							data-wow-duration="1000ms" data-wow-delay="500ms">
							<h3>${shop.shopName}</h3>
							<label><i class="glyphicon glyphicon-menu-up"></i></label>
							<p>address：${hotShop.address}<br>${hotShop.introduction}</p>
							<div class="read-more">
								<a class="link link-yaku"
									href="http://localhost:9090/client/RecipeListServlet?shopid=${shop.shopid}">
									<span>R</span><span>e</span><span>a</span><span>d</span> <span>M</span><span>o</span><span>r</span><span>e</span>
								</a>
							</div>
						</div>
						<div class="clearfix"></div>
				</c:forEach>
			</div>
		</div>
	</div>
	</div>

	<!--footer-->
	<div class="footer">
		<div class="container">
			<div class="footer-head">
				<h2>Tips:</h2>
				<label><i class="glyphicon glyphicon-menu-up"></i></label>
				<div class="col-md-4 footer-bottom  animated wow fadeInLeft"
					data-wow-duration="1000ms" data-wow-delay="500ms">
					<h2>Follow Us</h2>
					<label><i class="glyphicon glyphicon-menu-up"></i></label>
					<p>The system is developed by a group of lames</p>
				</div>
				<div class="clearfix"></div>

			</div>
		</div>
	</div>
	<!--//footer-->



</body>
</html>