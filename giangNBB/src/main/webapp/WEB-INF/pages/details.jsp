<%@page import="vn.com.fsoft.model.Shirt"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <!DOCTYPE HTML>
<html>
	<head>
		<title>OanAb - Product details</title>
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
					<a href="admin-account">
						<div class="menu-i">
							<div class="menuimg">
								<img src="${pageContext.request.contextPath}/resources/img/bg/nav-i-5.svg" width="24" height="24">
							</div><!--
							--><div class="menuname">
								<span>Personal info</span>
							</div>
						</div>
					</a>
					<a href="history">
						<div class="menu-i">
							<div class="menuimg">
								<img src="${pageContext.request.contextPath}/resources/img/bg/nav-i-6.svg" width="24" height="24">
							</div><!--
							--><div class="menuname">
								<span>History</span>
							</div>
						</div>
					</a>
					<a href="admin-admins">
						<div class="menu-i">
							<div class="menuimg">
								<img src="${pageContext.request.contextPath}/resources/img/bg/nav-i-7.svg" width="24" height="24">
							</div><!--
							--><div class="menuname">
								<span>Manage admins</span>
							</div>
						</div>
					</a>
					<a href="admin-users">
						<div class="menu-i">
							<div class="menuimg">
								<img src="${pageContext.request.contextPath}/resources/img/bg/nav-i-8.svg" width="24" height="24">
							</div><!--
							--><div class="menuname">
								<span>Manage users</span>
							</div>
						</div>
					</a>
					<a href="admin-shirts">
						<div class="menu-i">
							<div class="menuimg">
								<img src="${pageContext.request.contextPath}/resources/img/bg/nav-i-9.svg" width="24" height="24">
							</div><!--
							--><div class="menuname">
								<span>Manage T-shirts</span>
							</div>
						</div>
					</a>
					<a href="logout">
						<div class="menu-i">
							<div class="menuimg">
								<img src="${pageContext.request.contextPath}/resources/img/bg/nav-i-10.svg" width="24" height="24">
							</div><!--
							--><div class="menuname">
								<span>Logout</span>
							</div>
						</div>
					</a>
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
				<div class="sec" id="details">
					<div class="sec-t">
						<div class="sec-t-l"></div>
						<div class="sec-t-m">
							T-SHIRT DETAILS
						</div>
						<div class="sec-t-r"></div>
					</div>
					<div class="sec-c">
						<div class="clear"></div>
							<%if(session.getAttribute("giang")!=null){
						ArrayList<Shirt>list = (ArrayList<Shirt>)session.getAttribute("giang");
						String sid =(String)session.getAttribute("sid");
						Shirt see = new Shirt();
						for(Shirt s: list){
							if (s.getID().equals(sid)) {
								see = s;
							}
						}
						%>
						
						<div class="view">
							<div id="color"></div>
							<div id="shirt" style="background: url(${pageContext.request.contextPath}/resources/img/t/m430.png) no-repeat, url(${pageContext.request.contextPath}/resources/img/t/d/<%=see.getImagefile() %>) no-repeat; background-size: cover, 156px auto; background-position: center, 141px 102px;"></div>
						</div>
						<form name="decide" id="decide" class="detail" method="post">
							<table>
								<tr>
									<td class="choose" colspan="2">
										Available colors
										<div class="colors">
									
										</div>
										
										<div class="clear"></div>
									</td>
								</tr>
								<tr>
									<td class="rh">Name</td>
									<td class="rd"><%=see.getName()%></td>
								</tr>
								<tr>
									<td class="rh">Category</td>
									<td class="rd"><%=see.getCatid()%></td>
								</tr>
								<tr>
									<td class="rh">Gender</td>
									<td class="rd"><%=see.getGender()%></td>
								</tr>
								<tr>
									<td class="rh">Material</td>
									<td class="rd"><%=see.getMaterial()%></td>
								</tr>
								<tr>
									<td class="rh">Designed date</td>
									<td class="rd"><%=see.getDate()%></td>
								</tr>
								<tr>
									<td class="rh">Sold out</td>
									<td class="rd"><%=see.getSold()%></td>
								</tr>
								<tr>
									<td class="rh">Select size</td>
									<td class="rd">
										<select name="size" form="decide">
											<option value="1">S</option>
											<option value="2">M</option>
											<option value="3">L</option>
											<option value="4">XL</option>
											<option value="5">XXL</option>
										</select>
									</td>
								</tr>
								<tr>
									<td class="rh">Select color</td>
									<td class="rd">
										<select name="color" form="decide">
										
										</select>
									</td>
								</tr>
								<tr>
									<td class="rh">Amount</td>
									<td class="rd">
										<input type="number" name="amount" value="1" min="1">
									</td>
								</tr>
								<tr>
									<td class="choose" colspan="2">
										<br><input type="submit" name="buy" value="Add to cart">
									</td>
								</tr>
							</table>
						</form>
						
						<script>
							colorButtonsRendering("<%=see.getColors() %>");
							sizeSelectRendering("<%=see.getSizes() %>");
						</script>
						<%} %>
						
						
					</div>
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
		<script>color('purple');</script>
	</body>
</html>