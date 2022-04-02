<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 3/30/2022
  Time: 2:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<%--<h1> list Condiment</h1>--%>
<%--<p>${lettuce}</p>--%>
<%--<p>${tomato}</p>--%>
<%--<p>${mustard}</p>--%>
<%--<p>${sprouts}</p>--%>


<h1>List Menu</h1>

<p>Your order : </p>

<c:forEach var="list" items="${SandWichCondiments}">
    ${list}
</c:forEach>

</body>
</html>
