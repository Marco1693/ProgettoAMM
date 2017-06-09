<%-- 
    Document   : login
    Created on : 30-apr-2017, 12.49.43
    Author     : Marco Brundu
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Nerdbook: il social network che ti tiene in contatto con i tuoi amici</title>
        
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Marco Brundu">
        <meta name="keywords" content="Nerdbook amici descrizione social network login registrazione">
    
        <link rel="stylesheet" type="text/css" href="style.css" media="screen">
    </head>
    <body>
        <div id="barnav">
            
        <!--header contenente in titolo della pagina-->
        <c:set var="page" value="login" scope="request"/>
        <jsp:include page="header.jsp"/>
        <!-- barra di navigazione-->
        <c:set var="page" value="login" scope="request"/>
        <jsp:include page="barra.jsp"/>
        </div>
        
        <div id="divBody">
            <div id="log">
                
                <c:if test="${invalidData == true}">
                    <div id="invalidDataWarning">I dati inseriti non sono corretti</div>
                </c:if>
                    
                <form action="Login" method="post">
                    <div id="divLabel">
                        <label for="nickname">Nome Utente</label><br>
                        <input type="text" name="nickname" id="nickname"/>
                        <br />
                        <label for="psw">Password  </label><br>
                        <input type="password" name="password" id="psw"/><br>
                        <button type="submit">Accedi</button>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
