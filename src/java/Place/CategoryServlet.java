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
                " <script src=\"slideShow.js\" type=\"text/javascript\"></script>\n" +
                "<link rel=\"stylesheet\" type=\"text/css\" href=\"Searchstyle.css\">\n" +
                "<link rel=\"shortcut icon\" href=\"rose.ico\" />\n" +
                "<script src=\"MenuBarItemsScript.js\"></script>\n" +
                "<script src=\"SingleItemScript.js\"></script>\n" +
                " </head><body>  <!--Search Bar Code-->\n" +
                "	<div id=\"tfheader\">\n" +
                "<form id=\"tfnewsearch\" method=\"post\" action=\"ItemServlet\">\n" +
                "     <input type=\"text\" class=\"tftextinput\" name=\"search\" size=\"21\" maxlength=\"120\" placeholder=\"Search here\">\n" +
                "    <input type=\"submit\" value=\"search\" class=\"tfbutton\">\n" +
                "</form>	</div>  <!--menu bar code-->  \n" +
                "   <ul id=\"menu\""
//                + " onclick=\"func(event)\""
                + ">\n" +
                "      <li id=\"firstl\"  ><a href=\"CategoryServlet?category=Fashion\">Fashion</a> <ul>\n" +
                "             <li><a href=\"CategoryServlet?category=Skirts\">Skirts</a></li>\n" +
                "             <li><a href=\"CategoryServlet?category=Sweaters\">Sweaters</a></li>\n" +
                "             <li><a href=\"CategoryServlet?category=dresses\">dresses</a></li>\n" +
                "             <li><a href=\"CategoryServlet?category=outerwears\">outerwears</a></li>\n" +
                "             <li><a href=\"CategoryServlet?category=pants\">pants</a></li>\n" +
                "             \n" +
                "        </ul>\n" +
                "        \n" +
                "    </li>\n" +
                "    <li id=\"secondl\"><a href=\"CategoryServlet?category=Sporting goods\">Sporting goods</a>\n" +
                "       <ul>\n" +
                "             <li><a href=\"CategoryServlet?category=Badminton\">Badminton</a></li>\n" +
                "             <li><a href=\"CategoryServlet?category=basketball\">basketball</a></li>\n" +
                "             <li><a href=\"CategoryServlet?category=cricketbats\">cricketbats</a></li>\n" +
                "             <li><a href=\"CategoryServlet?category=golf\">golf</a></li>\n" +
                "             <li><a href=\"CategoryServlet?category=tennis\">tennis</a></li>\n" +
                "        </ul>\n" +
                "    </li>\n" +
                "    <li id=\"thirdl\"><a href=\"CategoryServlet?category=Electronic goods\">Electronic goods</a>\n" +
                "   <ul>\n" +
                "             <li><a href=\"CategoryServlet?category=Home theater\">Home theater</a></li>\n" +
                "             <li><a href=\"CategoryServlet?category=Television\">Television</a></li>\n" +
                "             <li><a href=\"CategoryServlet?category=cameras\">cameras</a></li>\n" +
                "             <li><a href=\"CategoryServlet?category=cellphones\">cellphones</a></li>\n" +
                "             <li><a href=\"CategoryServlet?category=computers\">computers</a></li>\n" +
                "        </ul>    \n" +
                "    </li>\n" +
                "    <li id=\"fourthl\"><a href=\"CategoryServlet?category=Handbags\">Handbags</a>\n" +
                " <ul>\n" +
                "             <li><a href=\"CategoryServlet?category=Buckets and sacs\">Buckets and sacs</a></li>\n" +
                "             <li><a href=\"CategoryServlet?category=Crossbody bags\">Crossbody bags</a></li>\n" +
                "             <li><a href=\"CategoryServlet?category=Hobos\">Hobos</a></li>\n" +
                "             <li><a href=\"CategoryServlet?category=Satchels\">Satchels</a></li>\n" +
                "             <li><a href=\"CategoryServlet?category=wallets\">wallets</a></li>\n" +
                "        </ul>\n" +
                "    </li>\n" +
                "    <li id=\"fifthl\"><a href=\"CategoryServlet?category=shoes\">shoes</a>\n" +
                "   <ul>\n" +
                "             <li><a href=\"CategoryServlet?category=boots\">boots</a></li>\n" +
                "             <li><a href=\"CategoryServlet?category=flats\">flats</a></li>\n" +
                "             <li><a href=\"CategoryServlet?category=outdoors\">outdoors</a></li>\n" +
                "             <li><a href=\"CategoryServlet?category=sandals\">sandals</a></li>\n" +
                "             <li><a href=\"CategoryServlet?category=slippers\">slippers</a></li>\n" +
                "        </ul>\n" +
                "    </li>\n" +
                "</ul>\n" +
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
                    " <p id=\"itemprice2\">Sale Price $<span style=\"color:red\">"+String.format( "%.2f", saleprice )+"</span></p> </div><form  action=\"PaymentServlet\" method=\"post\">\n" +
                    " <button type=\"submit\" class=\"btn\" name=\"shortdescription\" value="+list[5]+">Add To Cart</button> \n" +
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
