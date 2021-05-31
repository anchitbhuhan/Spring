<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Love Calculator</title>
<link  type="text/css" href="/resources/css/style.css" rel="stylesheet"  />
</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>
	
	<h3>Hi, ${userInfo.name}</h3>
	<form:form action="process-email" method="get"
		modelAttribute="emailDTO" >

		<div align="center">
		
			<table align="center">
				<tr>
					<p>
						<td><label for="em">Email : </label></td>
						<td><form:input id="em" path="userEmail" /></td>
						
					</p>
				</tr>
	
				<tr>
					<td></td>
					<td><input type="submit" class="button" value="Send"></td>
				</tr>
	
			</div>
		</table>
	</form:form>
</body>
</html>