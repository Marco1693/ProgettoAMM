<%-- 
    Document   : listaUtentiJson
    Created on : 9-giu-2017, 18.16.00
    Author     : Utente
--%>

<%@page contentType="application/json" pageEncoding="UTF-8"%>
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<json:array>
    <c:forEach var="utenti" items="${listaUtenti}">
        <json:object>
            <json:property name="id" value="${utenti.id}"/>
            <json:property name="username" value="${utenti.username}"/>
            <json:property name="nome" value="${utenti.nome}"/>
            <json:property name="cognome" value="${utenti.cognome}"/> 
            <json:property name="urlFotoProfilo" value="${utenti.urlFotoProfilo}"/>
            <json:property name="fraseDiPresentazione" value="${utenti.fraseDiPresentazione}"/>
            <json:property name="dataNascita" value="${utenti.dataNascita}"/>
            <json:property name="password" value="${utenti.password}"/>
            
        </json:object>
    </c:forEach>
</json:array>

