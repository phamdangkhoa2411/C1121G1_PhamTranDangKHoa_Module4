<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 3/31/2022
  Time: 8:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>

    <body>
    <h2>Result</h2>
    <table>
        <tr>
            <td>Language:</td>
            <td>${language}</td>
        </tr>
        <tr>
            <td>Page Size:</td>
            <td>${pageSize}</td>
        </tr>
        <tr>
            <td>Spams filter:</td>
            <td>${spamsFilter ? "Enable" : "Unable"}</td>
        </tr>
        <tr>
            <td>Signature:</td>
            <td>${signature}</td>
        </tr>
    </table>
    <a href="/home/setting">back to setting</a>
    </body>

</html>