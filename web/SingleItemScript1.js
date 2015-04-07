function func3(ele)
{
 document.close();
var arr = ele.split("QWER");
document.writeln('<html>\n\
<head><meta http-equiv="X-UA-Compatible"\n\
 content="IE=Edge"><meta content="text/html; charset=utf-8" http-equiv="Content-Type"><script type="text/javascript" src="SingleItemScript.js"> </script><link rel="stylesheet" type="text/css" href="SingleItemStyle.css"><title>'+arr[2]+'</title></head><body><div id="imagediv" style="float: left;">  <img src="'+arr[0]+'" alt="imwe"> </div> <div id="contentdiv" style="float: left;"> <h2 id="shortdesc">'+arr[5]+'</h2> <h4>Price is - <span id="dollar">'+arr[3]+'</span>   </h4><h4>Quantity Available- <span id="dollar">1</span></h4><h4> Status  -  <span id="dollar">Available</span></h4><h3 id="specifications">Specifications</h3><ul\n\
 id="unorder"> ');
var arr2 = arr[6].split("11");
for(var i=0;i<arr2.length;i++){
    if(arr2[i]!==null || arr2[i]!=="")
    {
document.writeln('<li> '+arr2[i]+'</li>');
    }
}
document.writeln(' </ul></div><div id="checkoutdiv" style="float: left;">\n\
<form action="PaymentServlet" method="get"><p id="quantity"> Quantity:- <select name="quantity"><option>1</option><option>2</option> <option>3</option><option>4</option><option>5</option></select> </p><br><button type="submit" class="btn" name="shortdescription" value="'+arr[5]+'" >Add To Cart</button></form> </div> </body></html>');
return false;
}
function indiFunc(attr)
{
//    alert(attr);
  var url = "SingleItemScriptServlet?shortdescription="+attr;
  servletfunction2(url);
}
function indiFunc2(attr)
{
//    alert(attr);
  var url = "PaymentServlet?shortdescription="+attr;
  servletfunction2(url);
}
function servletfunction2(url)
 {
     var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function() {
  if (xhr.readyState === 4 && xhr.status===200) {
     var data = xhr.responseText;
            func3(data);
        }        
    };
    xhr.open('GET', url, true);
    xhr.send(null);
 }