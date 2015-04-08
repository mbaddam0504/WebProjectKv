window.onload=function(){
    alert("malla");
    hideTableRows();
};
function hideTableRows() {
    var myTableRows = document.getElementById("menu").getElementsByTagName("tr");
    for(i=0;i< myTableRows.length;i++) {
        myTableRows[i].style.display = "none";
    }
}