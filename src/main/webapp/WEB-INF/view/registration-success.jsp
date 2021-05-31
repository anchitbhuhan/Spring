<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Love Calculator</title>
	<link  type="text/css" href="/resources/css/style.css" rel="stylesheet"  />
</head>
<body>

<h1 color="red" align="center">Love Calculator</h1>

<jsp:include page="header.jsp"></jsp:include>

    <h1>User Registration Successful for ${user.name}</h1><br>
    <h2>User Name : ${user.username}</h2><br>
    <h2>User Country : ${user.country}</h2><br>
    Hobbies:
        <c:forEach var="temp" items="${user.hobbies}">
                ${temp}<br>
        </c:forEach>
    <h2>User Gender : ${user.gender}</h2>
    <h2>User Age : ${user.age}</h2>
    <h2>User Email : ${user.communication.email}</h2><br>
    <h2>User Phone : ${user.communication.phone}</h2><br>


<br>
</body>
</html>
