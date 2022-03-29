<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 3/29/2022
  Time: 3:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<form action="/currency" method="post">
    <div class="container">
        <div class="row">
            <div class="col-lg-6 m-lg-auto">
                <div class="mb-3">
                    <label for="dola" class="form-label">DOLA</label>
                    <input type="text" class="form-control" id="dola" name="dola" required>
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </div>
        </div>
    </div>
</form>
</body>
</html>
