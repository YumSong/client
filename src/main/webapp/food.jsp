<%@ page language="java" pageEncoding="utf-8"%>
<%@ page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Menu</title>
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
	<div class="menu">
		<div class="container">
			<div class="menu-top">
				<div class="col-md-4 menu-left animated wow fadeInLeft"
					data-wow-duration="1000ms" data-wow-delay="500ms">
					<h3>RECIPE</h3>
					<label><i class="glyphicon glyphicon-menu-up"></i></label> <span>There
						are many Delicious food</span>
				</div>
				<div class="col-md-8 menu-right animated wow fadeInRight"
					data-wow-duration="1000ms" data-wow-delay="500ms">
					<p>Delicious food, as the name suggests, is delicious food,
						expensive and delicacies, cheap street snacks. As a matter of
						fact, delicacies are neither equal nor inferior, but as long as
						they are fond of them, they can be called delicacies. China has a
						good reputation as "the kingdom of cooking". In this big family of
						China, we have fifty-six small families, each family has its own
						special food. Having delicious food before eating and having
						aftertaste, it is not only a simple sense of taste, but also a
						spiritual enjoyment. Enjoying food also depends on occasions, good
						food and delicious food. Food culture in all parts of the world is
						extensive and profound, with different nutrients, tastes more
						delicious food, enjoys more health, and makes people happier.</p>
				</div>
				<div class="clearfix"></div>
			</div>

			<div class="menu-bottom animated wow fadeInUp"
				data-wow-duration="1000ms" data-wow-delay="500ms">
				<c:forEach items="${recipeList}" var="recipe">
					<div class="col-md-4 menu-bottom1">
						<div class="btm-right">
							<img src="${recipe.rePic}" alt="" class="img-responsive">
							<div class="captn">
								<h4>${recipe.reName }</h4>
								<p>$${recipe.price }</p>
							</div>
						</div>
					</div>
				</c:forEach>
			</div>

			<div class="clearfix"></div>
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