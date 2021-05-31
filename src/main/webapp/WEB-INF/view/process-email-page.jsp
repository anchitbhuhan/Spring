<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Love Calculator</title>
<link  type="text/css" href="/resources/css/style.css" rel="stylesheet"  />
</head>
<body>

<jsp:include page="header.jsp"></jsp:include>

<h2>Hi, ${userInfo.name},  Email successfully sent to ${emailDTO.userEmail}</h2>

</body>
</html>