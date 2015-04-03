var list;
var count=0;
function func(el)
{

var url = "CategoryServlet?category="+el;
    var myRequest = new XMLHttpRequest();
    myRequest.open('get', url, false);
    myRequest.onreadystatechange = function(){
        if ((myRequest.readyState === 4) || (myRequest.status === 200))
        {
            list=myRequest.responseText;
        }
        var arr =list.split("QWER");
        document.writeln("<p>"+arr[0]+"</p>");
    };

    myRequest.send(null);
}; 
//function func(el)
//{
//    var url="CategoryServlet?category=" + el;
//    var xmlRequest = new XMLHttpRequest();
//    xmlRequest.o
//}
