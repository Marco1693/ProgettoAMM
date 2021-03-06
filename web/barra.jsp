<%-- 
    Document   : barra
    Created on : 26-apr-2017, 16.16.05
    Author     : Marco Brundu
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<c:choose>
    <c:when test="${page=='bacheca'}">
        <nav id="barra">
                <ul>
                    <li <c:if test="${page=='profilo'}">class="active"</c:if>><a href="Profilo">Profilo</a></li>
                    <li <c:if test="${page=='bacheca'}">class="active"</c:if>><a href="Bacheca">Bacheca</a></li>
                </ul>
            <c:if test="${empty param.user}">
                <a id="lastchild" href="Login?logout=1">log out</a>
            </c:if>
        </nav>
    </c:when>



    <c:when test="${page=='profilo'}">
        <nav id="barra">
                <ul>
                    <li <c:if test="${page=='profilo'}">class="active"</c:if>><a href="Profilo">Profilo</a></li>
                    <li <c:if test="${page=='bacheca'}">class="active"</c:if>><a href="Bacheca">Bacheca</a></li>
                </ul>
            <c:if test="${empty param.user}">
                <a id="lastchild" href="Login?logout=1">log out</a>
            </c:if>
        </nav>
    </c:when>


    <c:when test="${page=='descrizione'}">
        <nav id="barra">
            <ul>
                <li><a href="Login">Login</a></li>
            </ul>
        </nav
    </c:when>


    <c:when test="${page == 'login'}">
        <nav id="barra">
            <ul>
            </ul>
        </nav
    </c:when>
</c:choose>


