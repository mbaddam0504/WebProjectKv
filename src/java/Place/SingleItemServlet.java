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
@WebServlet(name = "SingleItemServlet", urlPatterns = {"/SingleItemServlet"})
public class SingleItemServlet extends HttpServlet {

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
     //   System.out.println(" you are in --- SingleItemServlet?shortdescription=\"+attr;");
        HttpSession session = request.getSession();
      String category = request.getParameter("category");
      String subcategory = request.getParameter("subcategory");
ArrayList<Item>  list  = (ArrayList<Item>)session.getAttribute("items");
      //TotalItems.totalItems();
Item item1=null;
for(Item item:list)
{
   
     //  System.out.println(category+"  "+item.getCategory()+"--"+ subcategory+" "+item.getSubcategory());
 //System.out.println(category.equals(item.getCategory())+"--"+ subcategory.equals(item.getSubcategory()));
if(category.equals(item.getCategory()) && subcategory.equals(item.getSubcategory()))
{
    item1=item;
    break;
}
}
// System.out.println("-----------===============000000000");

    request.setAttribute("title", item1.getSubcategory());
    request.setAttribute("item", item1);
   PrintWriter out = response.getWriter();
   out.println(item1.getLongDescription());
   // request.getRequestDispatcher("SingleItemObtained.jsp").forward(request, response);
//  String  contextPath = request.getContextPath();
//request.getRequestDispatcher(contextPath + "SingleItemObtained.jsp").forward(request, response);
 //  response.sendRedirect("SingleItemObtained.jsp");
    //request.getRequestDispatcher("FoundItemsInSearch.jsp").forward(request, response);
//
//  String url = request.getContextPath() + "/index.html";
//response.sendRedirect(url);      
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
