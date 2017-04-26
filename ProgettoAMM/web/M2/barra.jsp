<%-- 
    Document   : barra
    Created on : 26-apr-2017, 16.16.05
    Author     : Marco Brundu
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<c:if test="${page =='bacheca'}">
    <nav id="barra">
            <ul>
                <li <c:if test="${page=='profilo'}">class="active"</c:if>><a href="profilo.html">Login</a></li>
                <li <c:if test="${page=='bacheca'}">class="active"</c:if>><a href="Bacheca">Bacheca</a></li>
            </ul>
        <a id="lastchild" href="login.html">log out</a>
    </nav>
</c:if>
<c:if test="${page =='profilo'}">
    <nav id="barra">
            <ul>
                <li <c:if test="${page=='profilo'}">class="active"</c:if>><a href="profilo.html">Login</a></li>
                <li <c:if test="${page=='bacheca'}">class="active"</c:if>><a href="Bacheca">Bacheca</a></li>
            </ul>
        <a id="lastchild" href="login.html">log out</a>
    </nav>
</c:if>
<c:if test="${page =='descrizione'}">
    <nav id="barra">
            <ul>
                <li><a href="login.html">Login</a>
            </ul>
        <a id="lastchild" href="login.html">log out</a>
    </nav>
</c:if>
<c:if test="${page =='login'}">
    <nav id="barra">
            <ul>
            </ul>
    </nav>
</c:if>
