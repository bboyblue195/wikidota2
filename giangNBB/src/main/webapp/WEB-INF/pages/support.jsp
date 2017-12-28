<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE HTML>
<html>
	<head>
		<title>OanAb - Request</title>
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
						<a href="shop.html">
							<div class="nav">
								<span>Shop</span>
							</div>
						</a>
					</td>
					<td class="nav-d">
						<a href="request.html">
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
						<a href="support.html">
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
				<div class="sec" id="qa">
					<div class="sec-t">
						<div class="sec-t-l"></div>
						<div class="sec-t-m">
							CONTACT - SUPPORT
						</div>
						<div class="sec-t-r"></div>
					</div>
					<div class="sec-c">
						<form name="qa" id="qaform">
							<div class="clear"></div>
							If you want to co-operate with us, kindly let us know: <a href="mailto:contact@oanab.com">contact@oanab.com</a>.<br>
							And if you have some questions for us, please send us an email to this address <a href="mailto:support@oanab.com">support@oanab.com</a> or fill in the form below.<br>
							<div class="clear"></div>
							<table class="qaform">
								<tbody>
									<tr>
										<td>
											Your e-mail address<br>
											<input type="text" name="mail" placeholder="E.g. example@ex.xam.ple" maxlength="40">
										</td>
									</tr>
									<tr>
										<td>
											Summarize your problem<br>
											<input type="text" name="name" placeholder="E.g. Couldn't list the filtered T-shirts" maxlength="100">
										</td>
									</tr>
									<tr>
										<td>
											Describe<br>
											<textarea name="desc" form="requestform" placeholder="Please describe your problem as detailed as possible."></textarea>
										</td>
									</tr>
									<tr>
										<td align="center">
											<input type="submit" name="reqsend" value="Send">
										</td>
									</tr>
								</tbody>
							</table>
						</form>
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