<%@page import="vn.com.fsoft.model.Shirt"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
	<head>
		<title>OanAb</title>
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
						<a href="shop">
							<div class="nav">
								<span>Shop</span>
							</div>
						</a>
					</td>
					<td class="nav-d">
						<a href="request">
							<div class="nav">
								<span>Request</span>
							</div>
						</a>
					</td>
					<td class="nav-d">
						<a href="login">
							<div class="nav">
								<span>Account</span>
							</div>
						</a>
					</td>
					<td class="nav-d">
						<a href="support">
							<div class="nav">
								<span>Support</span>
							</div>
						</a>
					</td>
					
					<!-- <td class="nav-d">
					<a href="logout">
						<div class="nav">
							<span>Logout</span>
						</div>
					</a>
					</td> -->
					
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
				<div class="sec" id="hot">
					<div class="sec-t">
						<div class="sec-t-l"></div>
						<div class="sec-t-m">
							NEW!
						</div>
						<div class="sec-t-r"></div>
					</div>
				
					<div class="sec-c">
						
						<%if(session.getAttribute("giang")!=null){
						ArrayList<Shirt> hhhn = (ArrayList<Shirt>)session.getAttribute("giang");	
						for (Shirt s: hhhn){
						%>
						<a href="details?shirtId=<%=s.getID()%>">
						<div class="sec-c-i">
							<div class="sec-c-i-d" style="background: url(${pageContext.request.contextPath}/resources/img/t/m1200.png) no-repeat, url(${pageContext.request.contextPath}/resources/img/t/d/<%=s.getImagefile() %>) no-repeat, url(${pageContext.request.contextPath}/resources/img/t/c/black.png) no-repeat; background-size: cover, 80px auto, cover; background-position: center, 72px 52px, center;"></div>
							<table class="sec-c-i-t">
								<tr>
									<td  href="details" class="sec-c-i-n" colspan="2"><%=s.getName() %></td>
								</tr>
								<tr>
									<td class="sec-c-i-m"><%=s.getMaterial() %></td>
									<td class="sec-c-t-s" align="right"><%=s.getSold()%></td>
								</tr>
								<tr>
									<td class="sec-c-i-p" colspan="2"><%=s.getPrice()%></td>
								</tr>
							</table>
						</div></a>
						
						<%}}%>
					</div>
				</div>
				<div class="clear"></div>
				<div class="sec" id="trend">
					<div class="sec-t">
						<div class="sec-t-l"></div>
						<div class="sec-t-m">
							TRENDING
						</div>
						<div class="sec-t-r"></div>
					</div>
					<div class="sec-c">
						<a href="details"> 
						<div class="sec-c-i">
							<div class="sec-c-i-d" style="background: url(${pageContext.request.contextPath}/resources/img/t/m1200.png) no-repeat, url(${pageContext.request.contextPath}/resources/img/t/d/1.png) no-repeat, url(${pageContext.request.contextPath}/resources/img/t/c/black.png) no-repeat; background-size: cover, 80px auto, cover; background-position: center, 72px 52px, center;"></div>
							<table class="sec-c-i-t">
								<tr>
									<td class="sec-c-i-n" colspan="2">Cô đi ra đi</td>
								</tr>
								<tr>
									<td class="sec-c-i-m">100% cotton</td>
									<td class="sec-c-t-s" align="right">35 sold!</td>
								</tr>
								<tr>
									<td class="sec-c-i-p" colspan="2">45,000 VND</td>
								</tr>
							</table>
						</div></a><!--
						
						--><a href="details"> 
						<div class="sec-c-i">
							<div class="sec-c-i-d" style="background: url(${pageContext.request.contextPath}/resources/img/t/m1200.png) no-repeat, url(${pageContext.request.contextPath}/resources/img/t/d/2.png) no-repeat, url(${pageContext.request.contextPath}/resources/img/t/c/dblue.png) no-repeat; background-size: cover, 80px auto, cover; background-position: center, 72px 52px, center;"></div>
							<table class="sec-c-i-t">
								<tr>
									<td class="sec-c-i-n" colspan="2">Em gái mưa</td>
								</tr>
								<tr>
									<td class="sec-c-i-m">100% cotton</td>
									<td class="sec-c-t-s" align="right">60 sold!</td>
								</tr>
								<tr>
									<td class="sec-c-i-p" colspan="2">42,000 VND</td>
								</tr>
							</table>
						</div></a><!--
						
						--><a href="details"> 
						<div class="sec-c-i">
							<div class="sec-c-i-d" style="background: url(${pageContext.request.contextPath}/resources/img/t/m1200.png) no-repeat, url(${pageContext.request.contextPath}/resources/img/t/d/4.png) no-repeat, url(${pageContext.request.contextPath}/resources/img/t/c/purple.png) no-repeat; background-size: cover, 80px auto, cover; background-position: center, 72px 52px, center;"></div>
							<table class="sec-c-i-t">
								<tr>
									<td class="sec-c-i-n" colspan="2">Đã lỡ yêu em nhiều</td>
								</tr>
								<tr>
									<td class="sec-c-i-m">100% cotton</td>
									<td class="sec-c-t-s" align="right">98 sold!</td>
								</tr>
								<tr>
									<td class="sec-c-i-p" colspan="2">65,000 VND</td>
								</tr>
							</table>
						</div></a><!--
						
						--><a href="details"> 
						<div class="sec-c-i">
							<div class="sec-c-i-d" style="background: url(${pageContext.request.contextPath}/resources/img/t/m1200.png) no-repeat, url(${pageContext.request.contextPath}/resources/img/t/d/6.png) no-repeat, url(${pageContext.request.contextPath}/resources/img/t/c/white.png) no-repeat; background-size: cover, 80px auto, cover; background-position: center, 72px 52px, center;"></div>
							<table class="sec-c-i-t">
								<tr>
									<td class="sec-c-i-n" colspan="2">Huế</td>
								</tr>
								<tr>
									<td class="sec-c-i-m">100% cotton</td>
									<td class="sec-c-t-s" align="right">55 sold!</td>
								</tr>
								<tr>
									<td class="sec-c-i-p" colspan="2">55,000 VND</td>
								</tr>
							</table>
						</div></a><!--
						
						--><a href="details"> 
						<div class="sec-c-i">
							<div class="sec-c-i-d" style="background: url(${pageContext.request.contextPath}/resources/img/t/m1200.png) no-repeat, url(${pageContext.request.contextPath}/resources/img/t/d/8.png) no-repeat, url(${pageContext.request.contextPath}/resources/img/t/c/white.png) no-repeat; background-size: cover, 80px auto, cover; background-position: center, 72px 52px, center;"></div>
							<table class="sec-c-i-t">
								<tr>
									<td class="sec-c-i-n" colspan="2">Đà Nẵng</td>
								</tr>
								<tr>
									<td class="sec-c-i-m">100% cotton</td>
									<td class="sec-c-t-s" align="right">103 sold!</td>
								</tr>
								<tr>
									<td class="sec-c-i-p" colspan="2">55,000 VND</td>
								</tr>
							</table>
						</div></a><!--
						-->
					</div>
				</div>
				<div class="clear"></div>
				<div class="sec" id="fun">
					<div class="sec-t">
						<div class="sec-t-l"></div>
						<div class="sec-t-m">
							MORE FUN?
						</div>
						<div class="sec-t-r"></div>
					</div>
					<table class="sec-c">
						<form>
							<tr>
								<td>
									Want something interesting? Be our designer or submit a request for your own design.
								</td>
								<td width="92">
									<input type="button" name="join" value="Join Us!">
								</td>
								<td width="92">
									<input type="button" name="request" value="Request">
								</td>
							</tr>
						</form>
					</table>
				</div>
				<div class="clear"></div>
			</div>
		</div>
		<div class="clear"></div>
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