<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: bhush
  Date: 20-05-2021
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Love Calculator</title>
	<link  type="text/css" href="/resources/css/style.css" rel="stylesheet"  />
</head>
<body>


<jsp:include page="header.jsp"></jsp:include>
        <br>

        <div align="center">
         	<h1>BILL</h1><br>

		<h3>Bill Against the credit card number ${bill.creditCard} for an amount of 
			${bill.amount} ${bill.currency.getSymbol()} on ${bill.date} has been generated.</h3>		
        </div>
</body>
</html>
