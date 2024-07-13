<%-- 
    Document   : index
    Created on : Jul 13, 2024, 2:17:57 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>\
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quan ly ban hang</title>
    </head>
    <body>
        <ul>
            <c:forEach items="${cates}" var="c">
                <li>${c.name}</li>
            </c:forEach>
        </ul>
         <ul>
            <c:forEach items="${prods}" var="p">
                <li>${p.name}</li>
            </c:forEach>
        </ul>
    </body>
</html>
