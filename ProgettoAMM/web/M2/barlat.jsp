<%-- 
    Document   : barlat
    Created on : 25-apr-2017, 18.56.26
    Author     : Marco Brundu
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<div id="barlat">
    <h2 class="pers"> Persone </h2>
        <h3> ${user1.nome}</h3>
        <h3> ${user2.nome}</h3>
        <h3> &{user3.nome}</h3>
    <h2 class="grup"> Gruppi </h2>
        <h3> &{group1.nome}</h3>
        <h3> &{group2.nome}</h3>
</div>