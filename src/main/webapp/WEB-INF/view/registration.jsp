<%--
  Created by IntelliJ IDEA.
  User: bhush
  Date: 18-05-2021
  Time: 07:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>
        <title>Love Calculator</title>
		<link  type="text/css" href="/resources/css/style.css" rel="stylesheet"  />

    </head>
    <body>
    
    
<jsp:include page="header.jsp"></jsp:include>
        <br>


        <div align="center">
            <h1 >Register Here</h1>
            <table align="center">

                <form:form action="process-registration" method="get" modelAttribute="user">
                    <tr>
                        <td><label for="n">Name : </label></td>
                        <td><form:input id="n" path="name"/></td>
                        <td><form:errors path="name"  cssClass="error"/></td>
                    </tr>

                    <tr>
                        <td><label for="un">UserName : </label></td>
                        <td><form:input id="un" path="username"/></td>
                        <td><form:errors path="username"  cssClass="error"/></td>
                    </tr>

                    <tr>
                        <td><label for="p">Password : </label></td>
                        <td><form:password id="p" path="password"/></td>
                    </tr>

                    <tr>
                        <td><label for="c">Country : </label></td>
                        <td><form:select id="c" path="country">
                                <form:option value="IND" label="India"></form:option>
                                <form:option value="US" label="USA"></form:option>
                                <form:option value="BRZ" label="Brazil"></form:option>
                            </form:select>
                        </td>
                    </tr>

                    <tr>
                        <td><label>Hobby</label></td>
                            <td><form:checkbox  path="hobbies" value="Cricket"/> Cricket</td>
                            <td><form:checkbox  path="hobbies" value="Gaming"/> Gaming</td>
                            <td><form:checkbox  path="hobbies" value="Programming"/> Programming</td>
                    </tr>

                    <tr>
                        <td><label>Gender</label></td>
                            <td><form:radiobutton path="gender" value="male" label="Male"/></td>
                            <td><form:radiobutton path="gender" value="female" label="Female"/></td>
                    </tr>

                    <tr>
                        <td><label for="ag">Age</label></td>
                        <td><form:input id="ag" path="age"/></td>
                        <td><form:errors cssClass="error" path="age"/></td>
                    </tr>

            </table>

            <div>
                <h3>Communication</h3>

                <label for="em" >Email</label>
                <form:input id="em" path="communication.email"/>
                <form:errors path="communication.email"  cssClass="error"/>

				<br>

                <label for="em" >Phone</label>
                <form:input id="em" path="communication.phone"/>
                <form:errors cssClass="error" path="communication.phone"/>

		

                <br>
                <br>
                <input align="center" type="submit" class="button" value="Register"/>


            </div>



        </div>
                </form:form>




    </body>
</html>
