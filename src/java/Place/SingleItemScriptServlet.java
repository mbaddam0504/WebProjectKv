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

        response.setContentType("text/html;charset=UTF-8");
                   PrintWriter out = response.getWriter();

       // System.out.println(" ne boondha  ra ne bondha");
      String shortdescription = request.getParameter("shortdescription");
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
    break;
}
}
 //System.out.println(item1);
//
//    request.setAttribute("title", item1.getSubcategory());
//    request.setAttribute("item", item1);

   out.println(item1);
       
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
