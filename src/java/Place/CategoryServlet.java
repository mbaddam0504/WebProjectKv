/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Place;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
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
@WebServlet(name = "CategoryServlet", urlPatterns = {"/CategoryServlet"})
public class CategoryServlet extends HttpServlet {
public static final String REALTIVE_PATH ="/";
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
     // System.out.println("MAMAMA");
        
    String category = request.getParameter("category");
  //String   subcategory = request.getParameter("subcategory");
        response.setContentType("text/html;charset=UTF-8");

    System.out.println(category+"--");
        ArrayList<Item> al = TotalItems.totalItems();
        String result = "";
        int count=0;
        for(Item it :al)
        {
       if(it!=null)
       {
        if(it.getCategory().equalsIgnoreCase(category))
        {
            
            result+= it.toString()+"SQQS";
        }
        else if(it.getSubcategory().split("-")[0].equalsIgnoreCase(category))
                {
                    count++;
             System.out.println(count+"matched image "+it);    
              result+= it.toString()+"SQQS";                  
                }
        else if(category.equals("discount"))
        {
        if(it.getDiscount()>0)
        {
       //     System.out.println(it.getImagePath()+it.getShortDescription());
                     result+= it.toString()+"SQQS";                   
        }
        }
        }
        }
        String[] singleList = result.split("SQQS");
       System.out.println("88 length of singlist"+singleList.length);
    try (//        if(!category.equals("discount")){
//   out.println(result);
//    }
            PrintWriter out = response.getWriter()) {
        out.print("<!DOCTYPE html><html> <head>  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\">\n" +
                "<link rel=\"stylesheet\" type=\"text/css\" href=\"Searchstyle.css\">\n" +
                "<link rel=\"stylesheet\" type=\"text/css\" href=\"Group6Css.css\">\n" +
                "<link rel=\"shortcut icon\" href=\"rose.ico\" />\n" +
                " </head><body>    <div id=\"logonsearch\">\n" +
"    <!--logo image code-->\n" +
"    <div id=\"logo\">\n" +
"        <a href=\"index.html\"> <img src=\"logo/logofinal.png\" alt=\"GoNClick\" /></a>\n" +
"    </div> <!--Search Bar Code-->\n" +
                "	<div id=\"tfheader\">\n" +
                "<form id=\"tfnewsearch\" method=\"post\" action=\"ItemServlet\">\n" +
                "     <input type=\"text\" class=\"tftextinput\" name=\"search\" size=\"21\" maxlength=\"120\" placeholder=\"Search here\">\n" +
                "    <input type=\"submit\" value=\"search\" class=\"tfbutton\">\n" +
                "</form>	</div></div>  <!--menu bar code-->  \n" +
                "   <ul id=\"menu\""
//                + " onclick=\"func(event)\""
                + ">\n" +
                "  <div class=\"nav\">  <li id=\"firstl\"  ><a href=\"CategoryServlet?category=Home\">Home</a> <ul>\n" +
               
                "             \n" +
                "        </ul>\n" +
                "        \n" +
                "    </li>\n" +
                "    <li id=\"secondl\"><a href=\"CategoryServlet?category=Sporting goods\">Products</a>\n" +
                "       <ul>\n" +
                "             <li><a href=\"CategoryServlet?category=All in ones\">All in ones</a></li>\n" +
                "             <li><a href=\"CategoryServlet?category=Desktops\">Desktops</a></li>\n" +
                "             <li><a href=\"CategoryServlet?category=Laptops\">Laptops</a></li>\n" +

                "        </ul>\n" +
                "    </li>\n" +
                "    <li id=\"thirdl\"><a href=\"CategoryServlet?category=Deals\">Deals</a>\n" +
                "   <ul>\n" +
                "             <li><a href=\"CategoryServlet?category=20-30\">20-30%</a></li>\n" +
                "             <li><a href=\"CategoryServlet?category=40-60\">40-60%</a></li>\n" +
                "             <li><a href=\"CategoryServlet?category=Upto 50\">Upto 50</a></li>\n" +
              
                "        </ul>    \n" +
                "    </li>\n" +
                  "    <li id=\"thirdl\"><a href=\"CategoryServlet?category=Support\">Support</a></li>\n" +
             
                "</ul> </div>\n" +
                " <div id=\"bar\">\n" +
                "   Welcome TO Shopping\n" +
                " </div>\n" +
                "<div id=\"discount\">\n" +
                "  <a href=\"CategoryServlet?category=discount\" > <img src=\"images/sale5.jpg\" alt=\"saleimg\" name=\"category\" ></a>\n" +
                "</div> <div id=\"singlebar\">");
        for (String singleList1 : singleList) {
            String[] list = singleList1.split("QWER");
            double price=Double.parseDouble(list[3]);
            double disc= Double.parseDouble(list[4]);
            double  saleprice =price*(1-disc*0.01);
            //         out.print("<h1>"+list[5]+"</h1>");
            out.print("<div id=\"singlebar1\">\n" +
                    "   <div id=\"menuimage\">  <a href=\"SingleItemScriptServlet?shortdescription="+list[5]+"\" id="+list[5]+"><img src=\""+list[0]+"\" alt="+list[2]+"/></a> </div><br>\n" +
                    "<div id=\"content\"><a id=\"mylink1\" href=\"SingleItemScriptServlet?shortdescription="+list[5]+"\" >");

            out.print(""+list[5]+"</a>\n" +
                    "<p>Actual  Price <span id=\"itemprice1\"> $ "+list[3]+"</span></p>\n" +
                    " <p id=\"itemprice2\">Sale Price $<span style=\"color:red\">"+String.format( "%.2f", saleprice )+"</span></p> </div><form  action=\"PaymentServlet\" method=\"get\">\n" +
                    " <button type=\"submit\" class=\"btn\" name=\"shortdescription\" value="+URLEncoder.encode(list[5])+">Add To Cart</button> \n" +
                    "</div></form>");
        }
        
        out.print("</div></body></html>");
    }
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
