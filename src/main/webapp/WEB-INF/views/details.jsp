<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>



<html lang="en">
<head>
<link rel="stylesheet" type="text/css"
	href="bootstrap/4.0.0-beta.3/css/bootstrap.min.css" />
</head>
<body>

	<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
		<div class="collapse navbar-collapse" id="navbarsExampleDefault">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link"
					href="/">Home <span class="sr-only">(current)</span></a>
				</li>
				<li class="nav-item"><a class="nav-link"
					href="../product/list">WS - List all
						products<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link"
					href="../product/by-id/8796093054971">WS -
						Get product by id <span class="sr-only">(current)</span>
				</a></li>
			</ul>
			<form class="form-inline my-2 my-lg-0"
				action="/search" method="post">
				<input class="form-control mr-sm-2" type="text" placeholder="Search"
					aria-label="Search" name="filter" value="">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			</form>
		</div>
	</nav>

	<main role="main">

	<div class="jumbotron">
		<div class="container">
			<h1 class="display-2">MyStore - Product Detail</h1>
		</div>
	</div>

	<div class="container">
		<div class="row">
			<div class="col-md-4">
				<h2>id</h2>
			</div>
			<div class="col-md-4">
				<h2>name</h2>
			</div>
			<div class="col-md-4">
				<h2>date</h2>
			</div>
		</div>
			<div class="row">
				<div class="col-md-4">
					<p>
						${detail.id }
					</p>
				</div>
				<div class="col-md-4">
					<p>
						${detail.name }
					</p>
				</div>
				<div class="col-md-4">
					<p>
						${detail.date }
					</p>
				</div>
			</div>
			<hr>

		<a class="btn btn-primary btn-lg" href="javascript:history.go(-1)"
			role="button">�� Back </a>
	</div>
	<!-- /container --> </main>
	<br />
	<footer class="container">
		<p>
			<img src="logo.jpg" class="rounded" alt="Keyrus Digital"
				width="200px"> page generated in Fri Jan 19 15:56:43 BRST 2018
		</p>
	</footer>

	<script type="text/javascript"
		src="bootstrap/4.0.0-beta.3/js/bootstrap.min.js"></script>

</body>
</html>