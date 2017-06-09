<%-- 
    Document   : barlat
    Created on : 25-apr-2017, 18.56.26
    Author     : Marco Brundu
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<div id="barlat">
     <div id="searchUser">
            <input id="searchField" type="text" placeholder="Ricerca..." value="">
            <button id="searchYourUser">Search</button>
    </div>
    <h2 class="pers"> Persone </h2>
        <c:forEach var="utenti" items="${utenti}">
            <h3><a href="Bacheca?user=${utenti.id}">${utenti.nome} ${utenti.cognome}</a></h3>
        </c:forEach>

    <h2 class="grup"> Gruppi </h2>
    <c:forEach var="gruppi" items="${gruppi}">
        <h3> ${gruppi.nomeGruppo}</h3>
    </c:forEach>
</div>