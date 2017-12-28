<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE HTML>
<html>
	<head>
		<title>OanAb - Shop</title>
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
				<div class="sec" id="shop">
					<div class="sec-t">
						<div class="sec-t-l"></div>
						<div class="sec-t-m">
							CHOOSE YOUR T-SHIRTS!
						</div>
						<div class="sec-t-r"></div>
					</div>
					<div class="sec-f">
						<form name="filter" id="filter">
							<div class="field">
								Category<br>
								<select name="cat" form="filter">
									<option value="0">All categories</option>
									<option value="1">Danh mục có id la 1</option>
									<option value="2">Danh muc co id la 2</option>
									<option value="3">Danh mục có id la 3</option>
								</select>
							</div>
							<div class="field">
								Gender<br>
								<select name="gen" form="filter">
									<option value="0">Unisex</option>
									<option value="1">Male</option>
									<option value="2">Female</option>
								</select>
							</div>
							<div class="field">
								Material<br>
								<select name="mat" form="filter">
									<option value="0">All materials</option>
									<option value="1">Chất liệu có id là 1</option>
									<option value="2">Chất liệu có id là 2</option>
									<option value="3">Chất liệu có id là 3</option>
								</select>
							</div>
							<div class="field">
								Prefered size<br>
								<select name="size" form="filter">
									<option value="0">All sizes</option>
									<option value="S">S</option>
									<option value="M">M</option>
									<option value="L">L</option>
									<option value="XL">XL</option>
									<option value="XXL">XXL</option>
								</select>
							</div>
							<br>
							<div class="field">
								Sort by<br>
								<select name="sort" form="filter">
									<option value="1">Newest first (default)</option>
									<option value="2">Oldest first</option>
									<option value="3">Most popular</option>
									<option value="4">Least popular</option>
								</select>
							</div>
							<br>
							<div class="field" style="width: 100%;">
								<input type="submit" name="filter" value="Filter">
							</div>
						</form>
					</div>
					<div class="clear"></div>
					<div class="sec-c">
						<a href="details.html">
							<div class="sec-c-i">
								<div class="sec-c-i-d" style="background: url(${pageContext.request.contextPath}/resources/img/t/m224.png) no-repeat, url(${pageContext.request.contextPath}/resources/img/t/d/1.png) no-repeat, url(${pageContext.request.contextPath}/resources/img/t/c/black.png) no-repeat; background-size: cover, 80px auto, cover; background-position: center, 72px 52px, center;"></div>
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
							</div>
						</a><!--
						--><a href="details.html">
							<div class="sec-c-i">
								<div class="sec-c-i-d" style="background: url(${pageContext.request.contextPath}/resources/img/t/m224.png) no-repeat, url(${pageContext.request.contextPath}/resources/img/t/d/2.png) no-repeat, url(${pageContext.request.contextPath}/resources/img/t/c/dblue.png) no-repeat; background-size: cover, 80px auto, cover; background-position: center, 72px 52px, center;"></div>
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
							</div>
						</a><!--
						--><a href="details.html">
							<div class="sec-c-i">
								<div class="sec-c-i-d" style="background: url(${pageContext.request.contextPath}/resources/img/t/m224.png) no-repeat, url(${pageContext.request.contextPath}/resources/img/t/d/3.png) no-repeat, url(${pageContext.request.contextPath}/resources/img/t/c/white.png) no-repeat; background-size: cover, 80px auto, cover; background-position: center, 72px 52px, center;"></div>
								<table class="sec-c-i-t">
									<tr>
										<td class="sec-c-i-n" colspan="2">Typo Thanh Xuân</td>
									</tr>
									<tr>
										<td class="sec-c-i-m">100% cotton</td>
										<td class="sec-c-t-s" align="right">101 sold!</td>
									</tr>
									<tr>
										<td class="sec-c-i-p" colspan="2">60,000 VND</td>
									</tr>
								</table>
							</div>
						</a><!--
						--><a href="details.html">
							<div class="sec-c-i">
								<div class="sec-c-i-d" style="background: url(${pageContext.request.contextPath}/resources/img/t/m224.png) no-repeat, url(${pageContext.request.contextPath}/resources/img/t/d/4.png) no-repeat, url(${pageContext.request.contextPath}/resources/img/t/c/purple.png) no-repeat; background-size: cover, 80px auto, cover; background-position: center, 72px 52px, center;"></div>
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
							</div>
						</a><!--
						--><a href="details.html">
							<div class="sec-c-i">
								<div class="sec-c-i-d" style="background: url(${pageContext.request.contextPath}/resources/img/t/m224.png) no-repeat, url(${pageContext.request.contextPath}/resources/img/t/d/5.png) no-repeat, url(${pageContext.request.contextPath}/resources/img/t/c/lgray.png) no-repeat; background-size: cover, 80px auto, cover; background-position: center, 72px 52px, center;"></div>
								<table class="sec-c-i-t">
									<tr>
										<td class="sec-c-i-n" colspan="2">Túy quyền</td>
									</tr>
									<tr>
										<td class="sec-c-i-m">100% cotton</td>
										<td class="sec-c-t-s" align="right">15 sold!</td>
									</tr>
									<tr>
										<td class="sec-c-i-p" colspan="2">42,000 VND</td>
									</tr>
								</table>
							</div>
						</a><!--
						--><a href="details.html">
							<div class="sec-c-i">
								<div class="sec-c-i-d" style="background: url(${pageContext.request.contextPath}/resources/img/t/m224.png) no-repeat, url(${pageContext.request.contextPath}/resources/img/t/d/6.png) no-repeat, url(${pageContext.request.contextPath}/resources/img/t/c/white.png) no-repeat; background-size: cover, 80px auto, cover; background-position: center, 72px 52px, center;"></div>
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
							</div>
						</a><!--
						--><a href="details.html">
							<div class="sec-c-i">
								<div class="sec-c-i-d" style="background: url(${pageContext.request.contextPath}/resources/img/t/m224.png) no-repeat, url(${pageContext.request.contextPath}/resources/img/t/d/7.png) no-repeat, url(${pageContext.request.contextPath}/resources/img/t/c/white.png) no-repeat; background-size: cover, 80px auto, cover; background-position: center, 72px 52px, center;"></div>
								<table class="sec-c-i-t">
									<tr>
										<td class="sec-c-i-n" colspan="2">Hội An</td>
									</tr>
									<tr>
										<td class="sec-c-i-m">100% cotton</td>
										<td class="sec-c-t-s" align="right">89 sold!</td>
									</tr>
									<tr>
										<td class="sec-c-i-p" colspan="2">55,000 VND</td>
									</tr>
								</table>
							</div>
						</a><!--
						--><a href="details.html">
							<div class="sec-c-i">
								<div class="sec-c-i-d" style="background: url(${pageContext.request.contextPath}/resources/img/t/m224.png) no-repeat, url(${pageContext.request.contextPath}/resources/img/t/d/8.png) no-repeat, url(${pageContext.request.contextPath}/resources/img/t/c/white.png) no-repeat; background-size: cover, 80px auto, cover; background-position: center, 72px 52px, center;"></div>
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
							</div>
						</a><!--
						-->							
					</div>
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