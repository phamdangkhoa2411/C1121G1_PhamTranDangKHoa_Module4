<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 3/30/2022
  Time: 3:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Canculator</h1>
<div>
    <form method="post">
        <input type="text" name="number1" placeholder="number1">
        <input type="text" name="number2" placeholder="number2">
        <br>
        <input type="submit" value="(+)Addition" name="result">
        <input type="submit" value="(-)Sudtraction" name="result">
        <input type="submit" value="(x)Multiplication" name="result">
        <input type="submit" value="(/)Division" name="result">
        <h2>Result  : ${total} </h2>
    </form>
</div>
</body>
</html>
