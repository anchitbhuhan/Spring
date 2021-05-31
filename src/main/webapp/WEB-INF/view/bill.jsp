<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
            <form:form action="bill-process" method="get" modelAttribute="bill" >
                <table>
                    <th><h2 align="center">Bill</h2></th>
                    <tr>
                        <td><label for="cn">Card Number: </label></td>
                        <td><form:input id="cn" path="creditCard"  /></td>
                        <td><form:errors path="creditCard"  cssClass="error"/></td>
                    </tr>

                    <tr>
                        <td><label for="am">Amount : </label></td>
                        <td><form:input id="am" path="amount"/></td>
                        <td><form:errors path="amount"  cssClass="error"/></td>
                        
                        
                    </tr>
                    
                     <tr>
                        <td><label for="cu">Currency : </label></td>
                        <td><form:input id="cu" path="currency"/></td>
                        <td><form:errors path="currency"  cssClass="error"/></td>
                    </tr>
                    
                     <tr>
                        <td><label for="dt">Date : </label></td>
                        <td><form:input id="dt" path="date"/></td>
                        <td><form:errors path="date"  cssClass="error"/></td>
                    </tr>

                    <tr></tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" class="button" value="Pay Bill"></td>

                    </tr>
                </table>
            </form:form>
        </div>
</body>
</html>
