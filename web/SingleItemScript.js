function func(ele)
{
//var val = document.getElementById("totalvalue").value;
//var val2 =document.getElementById(this).;
//alert(ele);
var arr = ele.split("QWER");
document.writeln('<!DOCTYPE html><html><head><meta http-equiv="X-UA-Compatible" content="IE=Edge"><meta content="text/html; charset=utf-8" http-equiv="Content-Type"><script type="text/javascript" src="SingleItemScript.js"> </script><link rel="stylesheet" type="text/css" href="SingleItemStyle.css"><title>'+arr[2]+'</title></head><body><form action="BillingPage.html" method="post"><div id="imagediv" style="float: left;">  <img src="'+arr[0]+'" alt="imwe"> </div> <div id="contentdiv" style="float: left;"> <h2 id="shortdesc">'+arr[5]+'</h2> <h4>Price is - <span id="dollar">'+arr[3]+'</span>   </h4><h4>Quantity Available- <span id="dollar">1</span></h4><h4> Status  -  <span id="dollar">Available</span></h4><h3 id="specifications">Specifications</h3><ul id="unorder"> ');
var arr2 = arr[6].split("-");
for(var i=0;i<arr2.length;i++){
document.writeln('<li> '+arr2[i]+'</li>');
}
document.writeln(' </ul></div><div id="checkoutdiv" style="float: left;">\n\
<p id="quantity"> Quantity:- <select name="quantity"><option>1</option><option>2</option> <option>3</option><option>4</option><option>5</option></select> </p><br><button type="submit" class="btn" >Add To Cart</button> </div> </form></body></html>');
return false;
}