function func(event)
{
 document.close();
  var el = eventVal(event);
var url = "CategoryServlet?category="+el+"&subcategory=nothing";
servletfunction(url);
}
function PrintDocument(singleList)
    {   
        var saleprice=0;
   document.write('<!DOCTYPE html><html> <head>  <meta http-equiv="X-UA-Compatible" content="IE=Edge"> \n\
 <script src="slideShow.js" type="text/javascript"></script>\n\
<link rel="stylesheet" type="text/css" href="Searchstyle.css">\n\
<link rel="shortcut icon" href="rose.ico" />\n\
<script src="MenuBarItemsScript.js"></script>\n\
<script src="SingleItemScript.js"></script>\n\
 </head><body>  <!--Search Bar Code-->\n\
	<div id="tfheader">	\n\
<form id="tfnewsearch" method="post" action="ItemServlet">\n\
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
 <div id="bar">\n\
   Welcome TO Shopping\n\
 </div>\n\
<div id="discount">\n\
      <a href="#" onclick="discImageFnc(discount)"> <img src="images/sale5.jpg" alt="saleimg"></a>\n\
</div>\n\
<div id="singlebar">');
    
   for(var i=0;i<singleList.length-1;i++){
  
    var string = new String(singleList[i]);
    var list = string.split("QWER");
      
           saleprice =list[3]-list[3]*list[4]*0.01;
        
  document.write('<div id="singlebar1">\n\
   <div id="menuimage">  <a href="#" onclick="ImageClickFunc(this)" id="'+list[5]+'"><img src="'+list[0]+'" alt="'+list[2]+'"/></a> </div><br>\n\
<div id="content"><a id="mylink1" href="#" onclick="sodi(event)">');
document.write(''+list[5]+'</a>\n\
<p>Actual  Price <span id="itemprice1"> $ '+list[3]+'</span></p>\n\
 <p id="itemprice2">Sale Price $<span style="color:red">'+saleprice+'</span></p> </div><form  action="PaymentServlet" method="post">\n\
 <button type="submit" class="btn" name="shortdescription" value="'+list[5]+'">Add To Cart</button> \n\
</div></form>\n\
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
//    alert(response);
    var singleList = response.toString().split("SQQS");
     PrintDocument(singleList);
 };
 }
 function sodi(event)
 {

  var el = eventVal(event);
  //alert(el);
indiFunc(el);
 }
 function ImageClickFunc(event)
 {
  indiFunc(event.id);  
 }
function  discImageFnc(attr)
{
            document.close();
 attr = attr.id===undefined?"discount":attr.id.toString();

var url = "CategoryServlet?category="+attr+"&subcategory=nothing";
servletfunction(url);
}
function slideImageFunc(event)
{
    alert(document.getElementById(event.id).getAttribute('src') +"mmm");
}
function slideImageFunc1(event)
{
    alert("event is "+event);
    alert("event value is 1"+event.id );
        alert("event value 2 is "+eventVal(event) );
    alert("event val3 is "+document.getElementById(event.id).src);
}
function eventVal(event)
{
 var target = event.target || event.srcElement;
  return target.innerHTML;   
}
