<%--
  Created by IntelliJ IDEA.
  User: simonpirko
  Date: 15.09.21
  Time: 7:42 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags/form"  %>
<html>
<head>
    <title>Reg</title>
</head>
<body>
<form action="/user/reg" method="post">
    <input type="text" name="name" placeholder="Name">
    <input type="text" name="username" placeholder="Username">
    <input type="password" name="password" placeholder="Password">
    <button>Submit</button>
</form>

</body>
</html>
