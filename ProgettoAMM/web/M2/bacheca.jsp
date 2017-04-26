<%-- 
    Document   : bacheca
    Created on : 25-apr-2017, 18.47.45
    Author     : Utente
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
        <jsp:include page="header.jsp"/>
        <!-- barra di navigazione-->
        <c:set var="page" value="bacheca" scope="request"/>
        <jsp:include page="barra.jsp"/>
        </div>
        <div id="divBody">
            <jsp:include page="barlat.jsp"/>
                <!-- posts -->
                <c:forEach var="post" items="${post}">
                    <div class="posts"> 
                        <img class="fprof" alt="Foto Profilo" src="${utente.urlFotoProfilo}">
                        <h2>${utente.nome}</h2>
                        <c:if test="${post.postType == 'TEXT'}">
                            <p>${post.content}</p>  
                        </c:if>
                        <c:if test="${post.postType == 'IMAGE'}">
                            <img class="imgp" alt="Allegato" src="${post.content}">
                        </c:if>
                        <c:if test="${post.postType == 'URL'}">
                            <a href="${post.content}">${post.content}</a>
                        </c:if>
                    </div>
                </c:forEach>
            <!-- footer -->
            <jsp:include page="footer.jsp"/>
        </div>
    </body>
</html>