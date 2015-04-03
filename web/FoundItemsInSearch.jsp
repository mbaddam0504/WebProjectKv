<%-- 
    Document   : FoundItemsInSearch
    Created on : Mar 31, 2015, 2:19:49 PM
    Author     : S519459
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Place.Item"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html>
<html>
    <head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> <c:out value="${title}"/></title>
<link rel="stylesheet" type="text/css" href="FoundItemsInSearchStyle.css">

<script src="SingleItemScript.js"></script>
    </head>
    <body>

 <c:forEach var="item" items="${itemsFromSearchButton}">
    <div id="firstdivision">
 <img src="${item.getImagePath()}"/> <br>
<input type="hidden" id="totalvalue" value="${item}"/>
<a id="mylink" href="#" onclick='func("${item}")'><c:out value="${item.getShortDescription()}"/></a>
 <br>
 <p id="itemprice">$ <c:out value="${item.getPrice()}"/></p>
 <c:out value="${longdesc}"/>
   </div>

</c:forEach>

    </body>
</html>
 <!--<a href="Place/SingleItemServlet?category=${item.getCategory()}&subcategory=${item.getSubcategory()}"> <c:out value="${item.getShortDescription()}"/></a>-->
