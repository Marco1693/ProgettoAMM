<%-- 
    Document   : header
    Created on : 25-apr-2017, 18.43.41
    Author     : Marco Brundu
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<header <c:if test="${page=='login'}"> id="headl"</c:if>
    <div id="title">
        <h1>NerdBook</h1>
    </div>
</header>
