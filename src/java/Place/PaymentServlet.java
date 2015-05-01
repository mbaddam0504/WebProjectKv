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

/**
 *
 * @author S519459
 */
@WebServlet(name = "PaymentServlet", urlPatterns = {"/PaymentServlet"})
public class PaymentServlet extends HttpServlet {

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
              System.out.println("payment servlet");

         String shortdescription = request.getParameter("shortdescription");
           shortdescription=  java.net.URLDecoder.decode(shortdescription, "UTF-8");
      String quantity = (String)(request.getParameter("quantity"));
if(quantity==null || quantity=="")
    quantity="1";
int totaquant = Integer.parseInt(quantity);
double totalPrice = 0;
         System.out.println("checkout short des "+shortdescription);
ArrayList<Item>  list  = TotalItems.totalItems();
      //TotalItems.totalItems();
Item item1=null;
for(Item item:list)
{
   
    //  System.out.println(category+"  "+item.getCategory()+"--"+ subcategory+" "+item.getSubcategory());
 //System.out.println(category.equals(item.getCategory())+"--"+ subcategory.equals(item.getSubcategory()));
if(shortdescription.equals(item.getShortDescription()))
{
    item1=item;
    totalPrice=item.getPrice()*(1-item.getDiscount()*0.01)*totaquant;
    break;
}
}
request.setAttribute("quantity", totaquant);
request.setAttribute("totalPrice", totalPrice);
request.setAttribute("ITEM", item1);
request.getRequestDispatcher("PaymentPage.jsp").forward(request, response);
//response.sendRedirect("/PaymentPage.jsp");
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
