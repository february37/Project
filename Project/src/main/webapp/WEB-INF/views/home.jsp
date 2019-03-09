<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="include/header.jsp" %>
	<section class = "content">
		<div class="row">
			<div class="col-md-12">
				<div class="box">
					<div class="box-header with-border">
						<h3 class="box-title">HOME PAGE</h3>
					</div>
				</div>
			</div>
		</div>
	</section>
<%@ include file="include/footer.jsp" %>

<%-- <html>
<head>
	<title>Home</title>
	<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
	<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<p id = "a"></p>

<form role="form" action="login" method="post">
	<table border="1">
		<tr>
			<th>
				<label>
					ID
				</label>
			</th>
			<td>
				<input type ="text" id = "userID" name = "userId">	
			</td>
		</tr>
		<tr>
			<th>
				<label>
						PassWord
				</label>
			</th>
			<td>
				<input type ="password" id = "userPw" name = "userPw">	
			</td>
		</tr>
	</table>
	<input type="submit" value="로그인" ser>
	<br>
</form>
</body>
</html>
 --%>