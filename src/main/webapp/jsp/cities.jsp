<%--
  Created by IntelliJ IDEA.
  User: Utilisateur
  Date: 10/05/2023
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <link rel="stylesheet" href="<c:url value="css/w3.css" />" />
    <title>Cities JSP</title>
</head>
<body onload="init();">

<div class="w3-container">
    <h2 style="text-align: center">Sakila - cities</h2>
    <br>
    <a href="<c:url value="/"/>" class="w3-button w3-black">Retour</a>
    Recherche : <input type="text" id="search" onkeyup="search()" placeholder="Search for countries..">
    <a href="/jee-mvc/new" class="w3-button w3-black">New</a>
    <table id="countriesTable" class="w3-centered w3-table-all">
        <thead>
        <tr class="w3-light-grey">
            <th>Id</th>
            <th>City</th>
            <th>Country Id</th>
            <th>Country</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${cities}" var="elem">
            <tr>
                <th scope="row">${elem.id}</th>
                <td>${elem.city}</td>
                <td>${elem.country.id}</td>
                <td>${elem.country.country}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>
