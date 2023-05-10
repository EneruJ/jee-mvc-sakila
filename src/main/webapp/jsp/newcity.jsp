<%--
  Created by IntelliJ IDEA.
  User: Utilisateur
  Date: 10/05/2023
  Time: 11:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Création de ville</title>
</head>
<body onload="init();">
<h1>Création de ville</h1>
<form name="newCityForm" action="new" method="post">
    <label for="city">Nom</label>
    <input type="text" name="city" id="city" />
    <input type="hidden" name="country_id" id="country_id" value="10L"/>
    <input type="submit" value="Créer" />
</form>

</body>
</html>
