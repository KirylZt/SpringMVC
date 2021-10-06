<%--
  Created by IntelliJ IDEA.
  User: Home
  Date: 20.09.2021
  Time: 19:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/calc" method="post">
    <input type="number" placeholder="Num1" name="num1">
    <input type="number" placeholder="Num2" name="num2">
    <select name="type">
        <option selected>Choose operation</option>
        <option value="1">Sum</option>
        <option value="2">Difference</option>
        <option value="3">Multiply</option>
        <option value="4">Divide</option>
    </select>
    <button>Submit</button>
</form>
<p>${result}</p>
</body>
</html>
