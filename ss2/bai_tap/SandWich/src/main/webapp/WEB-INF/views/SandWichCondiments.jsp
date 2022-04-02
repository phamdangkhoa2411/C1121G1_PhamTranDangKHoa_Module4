<%--@declare id="mustard"--%>
<%--Created by IntelliJ IDEA.
User: PC
Date: 3/30/2022
Time: 1:48 PM
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Sandwich Condiment</h1>
<form action="/add" method="get">
<span>
    <div>
        <label for="lettuce">Lettuce</label>
        <input name="condiment" id="lettuce" type="checkbox" value="lettuce">
    </div>

    <div>
        <label for="tomato">Tomato</label>
        <input name="condiment" id="tomato" type="checkbox" value="tomato">
    </div>

    <div>
        <label for="mustard">Mustard</label>
        <input name="condiment" id=mustard" type="checkbox" value="mustard">
    </div>

    <div>
        <label for="sprouts">Sprouts</label>
        <input name="condiment" id="sprouts" type="checkbox" value="sprouts">
    </div>

        <br>
    <input type="submit" value=" add">
</span>
</form>
</body>
</html>
