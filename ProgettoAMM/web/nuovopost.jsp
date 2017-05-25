<%-- 
    Document   : nuovopost
    Created on : 25-mag-2017, 16.06.10
    Author     : Marco Brundu
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<div id="nuovoPost">
     
            <c:choose>
                <c:when test="${empty newpost}">
                    <div id="formNewPost">
                        <form action="NuovoPost" method="post">
                            <div id="postType">
                                <div>
                                    <label for="textType">Testo</label>
                                    <input type="radio" name="postType" value="textType" id="textType" checked="checked">
                                </div>
                                <div>
                                    <label for="imgType">Foto</label>
                                    <input type="radio" name="postType" value="imgType" id="imgType">
                                </div>
                                <div>
                                    <label for="urlType">Url</label>
                                    <input type="radio" name="postType" value="urlType" id="urlType">
                                </div>
                            </div>
                            <div id="postContent">
                                <div>
                                    <label for="textPost">Contenuto</label>
                                    <input name="textPost" id="textPost">
                                    <label for="testo">Testo</label>
                                    <textarea name="testoType" id="testo"></textarea>
                                </div>
                            </div>
                            <button type="submit" name="thereIsPost" value="needConfirm">Invia</button>
                        </form>     
                    </div>
                </c:when>
                <c:otherwise>
                    <div id="formNewPost">
                        <form action="NuovoPost" method="post">
                            <c:if test="${typePost == 'textType'}">
                                <p>${text}</p>
                            </c:if>
                            <c:if test="${typePost == 'imgType'}">
                                <img src="${content}" alt="downloadedImage">
                                <p>${text}</p>
                            </c:if>
                            <c:if test="${typePost == 'urlType'}">
                                <a href="${content}">${content}</a>
                                <p>${text}</p>
                            </c:if>    
                            <input type="text" hidden name="textPost" value="${content}">
                            <input type="text" hidden name="postType" value="${typePost}">
                            <input type="text" hidden name="testoType" value="${text}">
                            <button type="submit" name="thereIsPost" value="Confirmed">Conferma</button>
                        </form>
                    </div>
                </c:otherwise>
            </c:choose>
       
</div>