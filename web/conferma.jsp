<%-- 
    Document   : conferma
    Created on : 5-mag-2017, 17.33.56
    Author     : Utente
--%>

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
        <div id="divBody">
            
            <div id="conferm">
                <form id="newPosts" action="Bacheca" method="get">
                    <label for="content">Nuovo Post</label><br>
                    <textarea rows="4" cols="40" name="conferm" id="content">${content}</textarea>
                    <br />
                    <button type="submit">Conferma nuovo post</button>
                </form>
            </div>
        </div>
    </body>
</html>
