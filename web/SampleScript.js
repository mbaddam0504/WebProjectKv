window.onload=function(){
     
          var arr = document.getElementsByTagName("td");
      for(j=0;j< arr.length;j++)
      {
           arr[j].style.display = "none";
      }
};
function display(item)
{
//    alert(item);

  var myTableRows = document.getElementsByClassName(item);
    for(i=0;i< myTableRows.length;i++) {
        
             var arr = myTableRows[i].getElementsByTagName("td");
             var arr2 = myTableRows[i].getElementsByTagName("th");
//             for(k=0;k< arr2.length;k++)
//      {
//          alert(arr2[k]);
//           arr2[k].style.backgroundcolor='red';
//
//      } 
                    myTableRows[i].style.backgroundColor = '#0095cd';

      for(j=0;j< arr.length;j++)
      {
           arr[j].style.display = "block";

      } 


}
}
function disappear(item)
{
//    alert("-----");
  var myTableRows = document.getElementsByClassName(item);
    for(i=0;i< myTableRows.length;i++) {
                         myTableRows[i].style.backgroundColor = 'transparent';
   
             var arr = myTableRows[i].getElementsByTagName("td");
      for(j=0;j< arr.length;j++)
      {
           arr[j].style.display = "none";
      }   
}
}
