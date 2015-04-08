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
   <script src="slideShow.js"></script>
<link rel="stylesheet" type="text/css" href="Searchstyle.css">
<link rel="shortcut icon" href="rose.ico" />
<script src="MenuBarItemsScript.js"></script>
<script src="SingleItemScript.js"></script>
    </head>
    <body>
           <div id="logonsearch">
    <!--logo image code-->
    <div id="logo">
        <a href="index.html"> <img src="logo/logofinal.png" alt="GoNClick" /></a>
    </div>
 <!--Search Bar Code-->
	<div id="tfheader">
		<form id="tfnewsearch" method="get" action="ItemServlet">
                    <input type="text" class="tftextinput" name="search" size="21" maxlength="120" placeholder="Search here">
                        <input type="submit" value="search" class="tfbutton">
		</form>
	</div>
           </div>
  <!--menu bar code-->
<ul id="menu" >
      <li id="firstl"  ><a href="CategoryServlet?category=Fashion">Fashion</a>
   <ul>
             <li><a href="CategoryServlet?category=Skirts">Skirts</a></li>
             <li><a href="CategoryServlet?category=Sweaters">Sweaters</a></li>
             <li><a href="CategoryServlet?category=dresses">dresses</a></li>
             <li><a href="CategoryServlet?category=outerwears">outerwears</a></li>
             <li><a href="CategoryServlet?category=pants">pants</a></li>
             
        </ul>
        
    </li>
    <li id="secondl"><a href="CategoryServlet?category=Sporting goods">Sporting goods</a>
   <ul>
             <li><a href="CategoryServlet?category=Badminton">Badminton</a></li>
             <li><a href="CategoryServlet?category=basketball">basketball</a></li>
             <li><a href="CategoryServlet?category=cricketbats">cricketbats</a></li>
             <li><a href="CategoryServlet?category=golf">golf</a></li>
             <li><a href="CategoryServlet?category=tennis">tennis</a></li>
        </ul>
    </li>
    <li id="thirdl"><a href="CategoryServlet?category=Electronic goods">Electronic goods</a>
   <ul >
             <li><a href="CategoryServlet?category=Home theater">Home theater</a></li>
             <li><a href="CategoryServlet?category=Television">Television</a></li>
             <li><a href="CategoryServlet?category=cameras">cameras</a></li>
             <li><a href="CategoryServlet?category=cellphones">cellphones</a></li>
             <li><a href="CategoryServlet?category=computers">computers</a></li>
        </ul>    
    </li>
    <li id="fourthl"><a href="CategoryServlet?category=Handbags">Handbags</a>
   <ul >
             <li><a href="CategoryServlet?category=Buckets and sacs">Buckets and sacs</a></li>
             <li><a href="CategoryServlet?category=Crossbody bags">Crossbody bags</a></li>
             <li><a href="CategoryServlet?category=Hobos">Hobos</a></li>
             <li><a href="CategoryServlet?category=Satchels">Satchels</a></li>
             <li><a href="CategoryServlet?category=wallets">wallets</a></li>
        </ul>    
    </li>
    <li id="fifthl"><a href="CategoryServlet?category=shoes">shoes</a>
   <ul >
             <li><a href="CategoryServlet?category=boots">boots</a></li>
             <li><a href="CategoryServlet?category=flats">flats</a></li>
             <li><a href="CategoryServlet?category=outdoors">outdoors</a></li>
             <li><a href="CategoryServlet?category=sandals">sandals</a></li>
             <li ><a href="PaymentServlet?category=slippers" name="category">slippers</a></li>
        </ul>
    </li>

</ul>

 <div id="bar">
   Welcome TO Shopping
 </div>
  <div id="discount">
      <a href="CategoryServlet?category=discount" > <img src="images/sale5.jpg" alt="saleimg" name="category1" ></a>
  </div>
       <div id="singlebar">
 <c:forEach var="item" items="${itemsFromSearchButton}">
 <div id="singlebar1"> 
  <div id="menuimage">  <a href="SingleItemScriptServlet?shortdescription=${item.getShortDescription()}" id="${item.getShortDescription()}"><img src="${item.getImagePath()}" alt="'ll"/></a> </div><br>
<input type="hidden" id="totalvalue" value="${item}"/>
 <div id="content">
<a id="mylink1" href="SingleItemScriptServlet?shortdescription=${item.getShortDescription()}" ><c:out value="${item.getShortDescription()}"/></a>
 <br>
 <p id="itemprice">$ <c:out value="${item.getPrice()}"/></p>
 <c:set var="actualprice" scope="session" value="${item.getPrice()}"/>
    <c:set var="discount" scope="session" value="${item.getDiscount()}"/>
    <c:set var="saleprice" scope="session" value="${actualprice-discount*0.01}"/>
    <c:if test="${discount>0}">
     <p id="itemprice2">Sale Price $<span style="color:red"><c:out value="${saleprice}"/></span></p>
    </c:if>
  </div>
    <form action="PaymentServlet" method="get">
    <button type="submit" class="btn" name="shortdescription" value="${item.getShortDescription()}">Add To Cart</button> 
    </form>
 </div>
</c:forEach>
       </div>

    </body>
</html>
 <!--<a href="Place/SingleItemServlet?category=${item.getCategory()}&subcategory=${item.getSubcategory()}"> <c:out value="${item.getShortDescription()}"/></a>-->
