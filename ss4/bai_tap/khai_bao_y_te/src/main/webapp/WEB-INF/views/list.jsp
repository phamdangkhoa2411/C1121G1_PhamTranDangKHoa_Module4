<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 01/04/2022
  Time: 11:49 CH
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 style="text-align: center; color: green">${message}</h1>
<h2>
    ${list.toString()}
</h2>
</body>
</html>
