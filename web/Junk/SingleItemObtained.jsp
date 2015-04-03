<%-- 
    Document   : SingleItemObtained
    Created on : Mar 31, 2015, 7:00:14 PM
    Author     : S519459
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><c:out value="${title}"/></title>
  <link rel="stylesheet" type="text/css" href="SingleItemStyle.css">
  <link rel="shortcut icon" href="rose.ico" />

    </head>
    <body>
        <img src="${item.getImagePath()}"/>
   <img src="images/slide1.jpg"/>
 
    </body>
</html>