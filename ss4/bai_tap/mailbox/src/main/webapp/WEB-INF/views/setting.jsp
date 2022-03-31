<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Settings</title>
</head>

    <body>
    <h1>Settings</h1>
    <form:form method="post" action="result" modelAttribute="mailbox">
        <table>
            <tr>
                <td> <label>Language</label></td>
                <td>
                    <form:select path="languages">
                        <form:option value="English">English</form:option>
                        <form:option value="Vietnamese">Vietnamese</form:option>
                        <form:option value="Japanese">Japanese</form:option>
                        <form:option value="Chinese">Chinese</form:option>
                    </form:select>
                </td>
            </tr>
            <tr>
                <td><label>Page Size</label></td>
                <td>
                    Show <form:select path="pageSize">
                    <form:option value="5">5</form:option>
                    <form:option value="10">10</form:option>
                    <form:option value="15">15</form:option>
                    <form:option value="25">25</form:option>
                    <form:option value="50">50</form:option>
                    <form:option value="100">100</form:option>
                </form:select> emails per page
                </td>
            </tr>
            <tr>
                <td><label>Spams fillter:</label></td>
                <td><form:checkbox path="spmasFillter" />Enable spams fillter</td>
            </tr>
            <tr>
                <td><label>Signature</label></td>
                <td><form:textarea path="singnature" /></td>
            </tr>
            <tr>
                <td><input type="submit" value="Update"></td>
                <td><input type="reset" value="Cancel"></td>
            </tr>
        </table>
    </form:form>
    </body>

</html>