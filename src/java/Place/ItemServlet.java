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
@WebServlet(name = "ItemServlet", urlPatterns = {"/ItemServlet"})
public class ItemServlet extends HttpServlet {

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
HttpSession session = request.getSession();
ArrayList<Item> itemsObtainedFromSearch = new ArrayList<Item>();
String nameFromSearch = request.getParameter("search");
ArrayList<Item> totalItems = TotalItems.totalItems();
session.setAttribute("items", totalItems);
for(Item item :totalItems)
{
String[] arr = item.getShortDescription().split(" ");
int count=0;
for(String el :arr)
{
 //  System.out.println(nameFromSearch+" short desc element is "+el+"****"+nameFromSearch.equalsIgnoreCase(el));
if(nameFromSearch.equalsIgnoreCase(el))
    count++;
}
if(count>0)
{

    itemsObtainedFromSearch.add(item);//Item sorted 
 String[] longdesc = item.getLongDescription().split("-");
 
  request.setAttribute("title", item.getCategory()+" "+item.getSubcategory());
  request.setAttribute("longdesc", longdesc[0]+longdesc[1]+".......");

}
 }
  //    System.out.println(" size "+itemsObtainedFromSearch.size());
request.setAttribute("itemsFromSearchButton", itemsObtainedFromSearch);
request.getRequestDispatcher("FoundItemsInSearch.jsp").forward(request, response);
  
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
