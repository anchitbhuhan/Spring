<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Love Calculator</title>
<link  type="text/css" href="/resources/css/style.css" rel="stylesheet"  />
<script src="/resources/js/validator.js"></script>
</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>


	<form:form action="process-homepage" method="get"
		modelAttribute="userInfo" onsubmit="return validateUserDetails()">

		<div align="center">
		
			<table align="center">
				<tr>
					<p>
						<td><label for="yn">Your Name Branch lcv2 +++++++: </label></td>

						<td><form:input id="yn" path="name.firstname" /></td>
						<td><form:errors cssClass="error" path="name" /></td>
					</p>
				</tr>
				<tr>
					<p>
						<td><label for="cn">Crush Name : </label></td>
						<td><form:input id="cn" path="crushname" /></td>
						<td><form:errors cssClass="error" path="crushname" /><td>
					</p>
				</tr>
				<tr></tr>
				<tr></tr>
				<tr>
					<p>
						
						<td><form:checkbox id="ch" path="TOI" />
						<label for="ch">I am Agreeing that this is for Fun.</label>
						<form:errors cssClass="error" path="TOI" /></td>
					</p>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" class="button" value="calculate"></td>
				</tr>
	
			</div>
		</table>
	</form:form>


</body>
</html>
