/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Place;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author S519459
 */
@WebServlet(name = "SingleItemScriptServlet", urlPatterns = {"/SingleItemScriptServlet"})
public class SingleItemScriptServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      System.out.println("SingleItemscriptServlet ");

        response.setContentType("text/html;charset=UTF-8");
                   PrintWriter out = response.getWriter();

       // System.out.println(" ne boondha  ra ne bondha");
      String shortdescription = request.getParameter("shortdescription");
        System.out.println(shortdescription);
ArrayList<Item>  list  = TotalItems.totalItems();
      //TotalItems.totalItems();
Item item1=null;
for(Item item:list)
{
   
    //  System.out.println(category+"  "+item.getCategory()+"--"+ subcategory+" "+item.getSubcategory());
 //System.out.println(category.equals(item.getCategory())+"--"+ subcategory.equals(item.getSubcategory()));
if(shortdescription.equals(item.getShortDescription()))
{
    System.out.println(item);
    item1=item;
    break;
}
}
 //System.out.println(item1);
//
//    request.setAttribute("title", item1.getSubcategory());
//    request.setAttribute("item", item1);

 String[]  arr = item1.toString().split("QWER");
   out.print("<html>\n"+
"<head><meta http-equiv=\"X-UA-Compatible\"\n"+
 "content=\"IE=Edge\"><meta content=\"text/html; charset=utf-8\" http-equiv=\"Content-Type\"><script type=\"text/javascript\" src=\"SingleItemScript.js\"> </script>"
           + "<link rel=\"stylesheet\" type=\"text/css\" href=\"SingleItemStyle.css\"><title>"+arr[2]+"</title></head><body><div id=\"imagediv\" style=\"float: left;\">  <img src=\""+arr[0]+"\" alt=\"imwe\"> </div> <div id=\"contentdiv\" style=\"float: left;\"> <h2 id=\"shortdesc\">"+arr[5]+"</h2> <h4>Price is - <span id=\"dollar\">"+arr[3]+"</span>   </h4><h4>Quantity Available- <span id=\"dollar\">1</span></h4><h4> Status  -  <span id=\"dollar\">Available</span></h4><h3 id=\"specifications\">Specifications</h3><ul\n"+
 "id=\"unorder\">");
String[] arr2 = arr[6].split("11");
        for (String arr21 : arr2) {
            System.out.println(arr21);
            if (arr21 != null || !arr21.equals("")) {
                out.print("<li> "+arr21+"</li>");
            }
        }
out.print(" </ul></div><div id=\"checkoutdiv\" style=\"float: left;\">\n"+
"<form action=\"PaymentServlet\" method=\"get\"><p id=\"quantity\"> Quantity:- <select name=\"quantity\"><option>1</option><option>2</option> <option>3</option><option>4</option><option>5</option></select> </p><br><button type=\"submit\" class=\"btn\" name=\"shortdescription\" value=\""+arr[5]+"\" >Add To Cart</button></form> </div> "
        + " <div id=\"footer\">\n" +
"      Contact Us At +15467324567\n" +
"                        @GoNClick. All rights reserved\n" +
"\n" +
"  </div></body></html>");

       
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
