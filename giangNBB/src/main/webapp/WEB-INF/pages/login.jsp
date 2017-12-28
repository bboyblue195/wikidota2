<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
	<head>
		<title>OanAb - Login</title>
		<link rel="icon" type="image/ico" href="${pageContext.request.contextPath}/resources/img/bg/VP.ico">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<script src="${pageContext.request.contextPath}/resources/js/main.js"></script>
	</head>
	<body>
		<div class="top">
			<table class="top-c">
				<tr>
					<td class="oanab-d">
						<a href="index.html">
							<div class="oanab">
								<span>OANAB</span>
							</div>
						</a>
					</td>
					<td></td>
					<td class="nav-d">
						<a href="#">
							<div class="nav">
								<span>Shop</span>
							</div>
						</a>
					</td>
					<td class="nav-d">
						<a href="#">
							<div class="nav">
								<span>Request</span>
							</div>
						</a>
					</td>
					<td class="nav-d">
						<a href="login.html">
							<div class="nav">
								<span>Account</span>
							</div>
						</a>
					</td>
					<td class="nav-d">
						<a href="#">
							<div class="nav">
								<span>Support</span>
							</div>
						</a>
					</td>
					
							<td class="nav-d-i" onclick="menuIn();">
							<div class="nav-i">
								<img src="${pageContext.request.contextPath}/resources/img/bg/nav-i-0.svg" width="30" height="30">
							</div>
						</td>
					</tr>
				</table>
				<div id="floatmenu" class="hide">
					<a href="shop">
						<div class="menu-i">
							<div class="menuimg">
								<img src="${pageContext.request.contextPath}/resources/img/bg/nav-i-1.svg" width="24" height="24">
							</div><!--
							--><div class="menuname">
								<span>Shop</span>
							</div>
						</div>
					</a>
					<a href="request">
						<div class="menu-i">
							<div class="menuimg">
								<img src="${pageContext.request.contextPath}/resources/img/bg/nav-i-2.svg" width="24" height="24">
							</div><!--
							--><div class="menuname">
								<span>Request</span>
							</div>
						</div>
					</a>
					<a href="login" id="hassub" onmouseenter="subIn();">
						<div class="menu-i">
							<div class="menuimg">
								<img src="${pageContext.request.contextPath}/resources/img/bg/nav-i-3.svg" width="24" height="24">
							</div><!--
							--><div class="menuname">
								<span>Account</span>
							</div>
						</div>
					</a>
					<a href="support">
						<div class="menu-i">
							<div class="menuimg">
								<img src="${pageContext.request.contextPath}/resources/img/bg/nav-i-4.svg" width="24" height="24">
							</div><!--
							--><div class="menuname">
								<span>Support</span>
							</div>
						</div>
					</a>
				</div>
				<div id="floatsubmenu" class="hidesub" onmouseleave="subOut();">
				
					
				</div>
			</div>
		</div>
		<div id="dark" class="hided" onclick="menuOut();"></div>
					
					
					
		<div class="banner">
			<form class="banner-c">
				<div class="slogan">
					<span>It's not just clothes, it's T-shirts.</span>
				</div>
				<table class="search-b">
					<tr>
						<td class="search-b-t">
							<input type="text" name="text" placeholder="Search through categories ...">
						</td>
						<td class="search-b-b">
							<input type="submit" name="button" value="Search">
						</td>
					</tr>
				</table>
			</form>
		</div>
		<div class="page">
			<div class="page-c">
				<div class="clear"></div>
				<div class="sec" id="login">
					<div class="sec-t">
						<div class="sec-t-l"></div>
						<div class="sec-t-m">
							LOGIN
						</div>
						<div class="sec-t-r"></div>
					</div>
					<form class="sec-c" method="post" action="handlingLogin">
						<table>
							<tr>
								<td>
									<input type="text" name="user" placeholder="Phone number">
								</td>
							</tr>
							<tr>
								<td>
									<input type="password" name="pass" placeholder="Password">
								</td>
							</tr>
							<tr>
								<td>
									<input type="submit" name="login" value="Login">
								</td>
							</tr>
							<tr>
								<td>
									<a href="forgot">Forgot password?</a>
								</td>
							</tr>
							<tr>
								<td>
									<a href="signup">Create account</a>
								</td>
							</tr>
								<tr>
								<td>
									<a href="admin">Admin login</a>
								</td>
							</tr>
						</table>
					</form>
				</div>
				<div class="clear"></div>
			</div>
		</div>
		<div class="bot">
			<table class="bot-c">
				<tr>
					<td align="left">
						For studying and internship only, not for any commercial purpose.
					</td>
					<td align="right" width="128">
						OANAB _ 2017
					</td>
				</tr>
			</table>
		</div>
	</body>
</html>