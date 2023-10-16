<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8" />
        <title>Tabuada</title>
    </head>
    <body>
        <h1>Tabuada</h1>
        <ul>
            <c:forEach var="valor" items="${tabuada}">
                <li>${valor}</li>
            </c:forEach>
        </ul>
    </body>
</html>

