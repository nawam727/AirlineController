package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class flightsdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/flight.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/navbar.css\">\r\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css\"> <!-- social media icons link-->\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <center>\r\n");
      out.write("                <div class=\"topnav\">\r\n");
      out.write("                <a class=\"active\" href=\"StaffDash.html\">Home</a>\r\n");
      out.write("                <a href=\"tickets.html\">Tickets</a>\r\n");
      out.write("                <a href=\"flights.html\">Flights</a>\r\n");
      out.write("                <a href=\"#about\">Sign In</a>\r\n");
      out.write("                <a href=\"#about\">Sign Up</a>\r\n");
      out.write("                </div> \r\n");
      out.write("            </center>\r\n");
      out.write("    \r\n");
      out.write("      <!-- header section -->  \r\n");
      out.write("    <header class=\"hero-section\">\r\n");
      out.write("\r\n");
      out.write("    <h3>\r\n");
      out.write("            <center>\r\n");
      out.write("                <form action=\"editflight.jsp\">\r\n");
      out.write("                <table border=\"0\">\r\n");
      out.write("                    <th>\r\n");
      out.write("                       Results for Flight Id : \r\n");
      out.write("                        ");
      out.print(request.getParameter("txtflId"));
      out.write("\r\n");
      out.write("                    </th>\r\n");
      out.write("                   \r\n");
      out.write("                ");

                    try
                    {
                        Class.forName("com.mysql.jdbc.Driver");
                        String url="jdbc:mysql://localhost:3306/testair";
                        Connection con=DriverManager.getConnection(url, "root","");
                        
                        Statement st= con.createStatement();
                        
                        int fliId= Integer.parseInt(request.getParameter("txtflId"));
                        session.setAttribute("flId", fliId);
                        String query="Select * from flights where flightId='"+fliId+"'";
                        ResultSet rs=st.executeQuery(query);
                        while(rs.next())
                        {
                
      out.write("\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>Flight ID</td>\r\n");
      out.write("                            <td>");
      out.print(rs.getInt("flightId"));
      out.write("</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>Captain Name</td>\r\n");
      out.write("                            <td>");
      out.print(rs.getString("pilot1"));
      out.write("</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>Second Officer Name</td>\r\n");
      out.write("                            <td>");
      out.print(rs.getString("pilot2"));
      out.write("</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>Arrival Time</td>\r\n");
      out.write("                            <td>");
      out.print(rs.getString("arriTime"));
      out.write("</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>Departure Time</td>\r\n");
      out.write("                            <td>");
      out.print(rs.getString("depTime"));
      out.write("</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>Arrival Date</td>\r\n");
      out.write("                            <td>");
      out.print(rs.getString("arriDate"));
      out.write("</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>Departure Date</td>\r\n");
      out.write("                            <td>");
      out.print(rs.getString("depDate"));
      out.write("</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>Arrival Airport</td>\r\n");
      out.write("                            <td>");
      out.print(rs.getString("arriAirport"));
      out.write("</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>Departure Airport</td>\r\n");
      out.write("                            <td>");
      out.print(rs.getString("depAir"));
      out.write("</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>Number of Seats</td>\r\n");
      out.write("                            <td>");
      out.print(rs.getInt("SeatCount"));
      out.write("</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>Number of Available Seats</td>\r\n");
      out.write("                            <td>");
      out.print(rs.getInt("avaiSeat"));
      out.write("</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("\r\n");
      out.write("                            <td><input class=\"bttn\" type=\"submit\" value=\"Edit\"/> </td>\r\n");
      out.write("                            <td><input class=\"bttn\" type=\"submit\" value=\"Back\"></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                           ");
 }
                    }
                      catch(Exception e)
                    {
                        System.out.println(e.getMessage());
                    }
                      
      out.write("\r\n");
      out.write("                </table>\r\n");
      out.write("               </form>\r\n");
      out.write("                <form action=\"deleteflight.jsp\">\r\n");
      out.write("                    <input class=\"bttn\" type=\"submit\" value=\"delete\" />\r\n");
      out.write("                </form>\r\n");
      out.write("            </center>\r\n");
      out.write("        </h3>\r\n");
      out.write("    </header>\r\n");
      out.write("                \r\n");
      out.write("         <!-- footer  -->\r\n");
      out.write("                 \r\n");
      out.write("          <div class=\"footer\">            \r\n");
      out.write("            <div class=\"footer-clean\">\r\n");
      out.write("                <footer>\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <div class=\"row justify-content-center\">\r\n");
      out.write("\r\n");
      out.write("                            \r\n");
      out.write("                                <div class=\"col-sm-4 col-md-3 item\">\r\n");
      out.write("                                    <h3>About Us</h3>\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                       <li><a href=\"#\">About phoenix Airlines</a></li>\r\n");
      out.write("                                       <li><a href=\"#\">Media Center</a></li>\r\n");
      out.write("                                       <li><a href=\"#\">Advertise with us</a></li>\r\n");
      out.write("                                       <li><a href=\"#\">Careers</a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            \r\n");
      out.write("                           \r\n");
      out.write("\r\n");
      out.write("                         \r\n");
      out.write("                            <div class=\"col-sm-4 col-md-3 item\">\r\n");
      out.write("                                <h3>Help</h3>\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li><a href=\"#\">24 Hours Contact Center</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Online Chat Support</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">FAQs</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            \r\n");
      out.write("                            \r\n");
      out.write("                             <div class=\"col-sm-4 col-md-3 item\">\r\n");
      out.write("                                    <h3>Services</h3>\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                       <li><a href=\"#\">Cargo</a></li>\r\n");
      out.write("                                       <li><a href=\"#\">Ground Handling</a></li>\r\n");
      out.write("                                       <li><a href=\"#\">Holidays</a></li>\r\n");
      out.write("                                       <li><a href=\"#\">Catering</a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                         \r\n");
      out.write("                            \r\n");
      out.write("                         \r\n");
      out.write("                            <div class=\"col-sm-4 col-md-3 item\">\r\n");
      out.write("                                <h3>Terms & Conditions</h3>\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li><a href=\"#\">Online Booking Terms of Use</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Conditions of Carriage</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Permission Center</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Service Fees at Ticket Office</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                         \r\n");
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("                            <div class=\"col-lg-3 item social\">\r\n");
      out.write("                                <center><h3>Follow Us</h3></center>\r\n");
      out.write("                                <a href=\"#\"><i class=\"icon ion-social-facebook\"></i></a>\r\n");
      out.write("                                <a href=\"#\"><i class=\"icon ion-social-twitter\"></i></a>\r\n");
      out.write("                                <a href=\"#\"><i class=\"icon ion-social-snapchat\"></i></a> \r\n");
      out.write("                                <a href=\"#\"><i class=\"icon ion-social-instagram\"></i></a>\r\n");
      out.write("                                <p class=\"copyright\">Copyright © 2022 All Rights Reserved</p>\r\n");
      out.write("                            </div>      \r\n");
      out.write("                        </div>\r\n");
      out.write("                     </div>\r\n");
      out.write("                </footer>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div> \r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
