function func(event)
{
 document.close();
 var target = event.target || event.srcElement;
  var el = target.innerHTML;
var url = "CategoryServlet?category="+el+"&subcategory=nothing";
servletfunction(url);
}
function PrintDocument(singleList)
    {   var saleprice=0;
   document.write('<!DOCTYPE html><html> <head>  <meta http-equiv="X-UA-Compatible" content="IE=Edge"> \n\
 <script src="slideShow.js" type="text/javascript"></script>\n\
<link rel="stylesheet" type="text/css" href="Searchstyle.css">\n\
<link rel="shortcut icon" href="rose.ico" />\n\
<script src="MenuBarItemsScript.js"></script>\n\
<script src="SingleItemScript.js"></script>\n\
 </head><body>  <!--Search Bar Code-->\n\
	<div id="tfheader">	\n\
<form id="tfnewsearch" method="get" action="ItemServlet">\n\
     <input type="text" class="tftextinput" name="search" size="21" maxlength="120" placeholder="Search here">\n\
    <input type="submit" value="search" class="tfbutton">\n\
</form>	</div>  <!--menu bar code-->  \n\
   <ul id="menu" onclick="func(event)">\n\
      <li id="firstl"  ><a href="#">Fashion</a> <ul>\n\
             <li><a href="#">Skirts</a></li>\n\
             <li><a href="#">Sweaters</a></li>\n\
             <li><a href="#">dresses</a></li>\n\
             <li><a href="#">outerwears</a></li>\n\
             <li><a href="#">pants</a></li>\n\
             \n\
        </ul>\n\
        \n\
    </li>\n\
    <li id="secondl"><a href="#">Sporting goods</a>\n\
       <ul>\n\
             <li><a href="#">Badminton</a></li>\n\
             <li><a href="#">basketball</a></li>\n\
             <li><a href="#">cricketbats</a></li>\n\
             <li><a href="#">golf</a></li>\n\
             <li><a href="#">tennis</a></li>\n\
        </ul>\n\
    </li>\n\
    <li id="thirdl"><a href="#">Electronic goods</a>\n\
   <ul>\n\
             <li><a href="#">Home theater</a></li>\n\
             <li><a href="#">Television</a></li>\n\
             <li><a href="#">cameras</a></li>\n\
             <li><a href="#">cellphones</a></li>\n\
             <li><a href="#">computers</a></li>\n\
        </ul>    \n\
    </li>\n\
    <li id="fourthl"><a href="#">Handbags</a>\n\
 <ul>\n\
             <li><a href="#">Buckets and sacs</a></li>\n\
             <li><a href="#">Crossbody bags</a></li>\n\
             <li><a href="#">Hobos</a></li>\n\
             <li><a href="#">Satchels</a></li>\n\
             <li><a href="#">wallets</a></li>\n\
        </ul>    \n\
    </li>\n\
    <li id="fifthl"><a href="#">shoes</a>\n\
   <ul>\n\
             <li><a href="#">boots</a></li>\n\
             <li><a href="#">flats</a></li>\n\
             <li><a href="#">outdoors</a></li>\n\
             <li><a href="#">sandals</a></li>\n\
             <li><a href="#">slippers</a></li>\n\
        </ul>\n\
    </li>\n\
\n\
</ul>\n\
<div id="singlebar">');
   for(var i=0;i<singleList.length-1;i++){
  
    var string = new String(singleList[i]);
    var list = string.split("QWER");
      
           saleprice =list[3]-list[3]*list[4]*0.01;
        
        document.write('<div id="singlebar1">\n\
   <div id="menuimage">  <a href="BillingPage.html"><img src="'+list[0]+'" alt="'+list[2]+'"/></a> </div><br>\n\
<a id="mylink1" href="#" onclick="sodi(event)">');
document.write(''+list[5]+'</a>\n\
<p>Actual  Price <span id="itemprice1"> $ '+list[3]+'</span></p>\n\
 <p id="itemprice2">Sale Price $<span style="color:red">'+saleprice+'</span></p>\n\
 <button type="submit" class="btn" onclick="takeToCheckout()">Add To Cart</button> \n\
</div>\n\
    ');
}
document.writeln('</div></body></html>'); }
function servletfunction(url)
 {
     var handleStateChange = function () {
   switch (xmlhttp.readyState) {
      case 0 : // UNINITIALIZED
      case 1 : // LOADING
      case 2 : // LOADED
      case 3 : // INTERACTIVE
      break;
      case 4 : // COMPLETED
      handleResponse(xmlhttp.status, xmlhttp.responseText);
      break;
      default: alert("error");
   }
   };
var xmlhttp=new XMLHttpRequest();
xmlhttp.onreadystatechange=handleStateChange;
xmlhttp.open("GET",url,true);
xmlhttp.send(null);
var handleResponse = function (status, response){
    var singleList = response.toString().split("SQQS");
     PrintDocument(singleList);
 };
 }
 function sodi(event)
 {
     var target = event.target || event.srcElement;
  var el = target.innerHTML;
//     alert(el);
indiFunc(el);
 }
