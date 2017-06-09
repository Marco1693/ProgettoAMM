<%-- 
    Document   : barlat
    Created on : 25-apr-2017, 18.56.26
    Author     : Marco Brunduqswza<
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<div id="barlat">
     <div id="searchUser">
            <input id="searchField" type="text" placeholder="Ricerca..." value="">
            <button id="searchYourUser">Search</button>
    </div>
    <h2 class="pers"> Persone </h2>
    <div id="userList">
        <%--<c:forEach var="utenti" items="${utenti}">
                <h3><a href="Bacheca?user=${utenti.id}">${utenti.nome} ${utenti.cognome}</a></h3>
            </c:forEach>--%>
            <c:forEach var="utente" items="${utenti}">
                    <div class="user">
                        <div class="userData">
                            <h3><a href="Bacheca?user=${utente.id}">${utente.nome} ${utente.cognome}</a></h3>
                        </div>
                    </div>
            </c:forEach>    
                
    </div>

    <h2 class="grup"> Gruppi </h2>
    <c:forEach var="gruppi" items="${gruppi}">
        <h3> ${gruppi.nomeGruppo}</h3>
    </c:forEach>
</div>