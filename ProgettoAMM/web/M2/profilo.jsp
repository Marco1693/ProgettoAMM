<%-- 
    Document   : profilo
    Created on : 30-apr-2017, 13.13.05
    Author     : Marco
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
        <meta name="keywords" content="Nerdbook amici descrizione social network">
   
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
            <!-- barra laterale -->
            <jsp:include page="barlat.jsp"/>
            
            <img id="fprofilo" alt="Foto Profilo" src="img/user3.jpeg" width="150" height="150">
            
            <div id="dati">
                <form class="prof" action="profilo.php" method="get">
                    <div>
                        <label for="nome">Nome</label>
                        <input type="text" name="nome" id="nome">
                    </div>
                    <div>
                        <label for="cognome">Cognome</label>
                        <input type="text" name="cognome" id="cognome">
                    </div>
                    <div>
                        <label for="immagine">Immagine profilo</label>
                        <input type="url" name="immagine" id="immagine">
                    </div>
                    <div>
                        <label for="stato">Frase di presentazione</label>
                        <textarea rows="4" cols="40" name="stato" id="stato"></textarea>
                    </div>
                    <div>
                        <label for="data">Data di nascità</label>
                        <input type="date" name="data" id="data">
                    </div>
                    <div>
                        <label for="psw">Password  </label>
                        <input type="password" name="psw" id="psw"/>
                    </div>
                    <div>
                        <label for="cpsw">Conferma Password  </label>
                        <input type="password" name="cpsw" id="cpsw"/>
                    </div>
                    
                    <button type="submit">Salva Modifiche</button>
                </form>
            </div>   
            
            <!-- footer -->
            <jsp:include page="footer.jsp"/>
        </div>
    </body>
</html>
