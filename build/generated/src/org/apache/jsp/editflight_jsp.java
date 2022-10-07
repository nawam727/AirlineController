package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class editflight_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("    <center>\r\n");
      out.write("        <h1>Edit Flight Details</h1>\r\n");
      out.write("         ");
 
                  String fliId=session.getAttribute("flId").toString();
                  int f=Integer.parseInt(fliId);
                  
                   try
                    {
                        Class.forName("com.mysql.jdbc.Driver");
                        String url="jdbc:mysql://localhost:3306/testair";
                        Connection con=DriverManager.getConnection(url, "root","");
                        
                        Statement st= con.createStatement();
             
                        String query="Select * from flights where flightId='"+f+"'";
                        ResultSet rs=st.executeQuery(query);
                        while(rs.next())
                        {

                
      out.write("\r\n");
      out.write("                \r\n");
      out.write("           \r\n");
      out.write("                <h4>Flight ID ");
      out.print(rs.getInt("flightId"));
      out.write("</h4>\r\n");
      out.write("                ");
 session.setAttribute("flId",fliId); 
      out.write("\r\n");
      out.write("                 <form action=\"saveflight.jsp\" method=\"post\">\r\n");
      out.write("                <table border=\"0\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Captain Name</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"cptname\" value='");
      out.print(rs.getString("pilot1"));
      out.write("'></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Second Officer Name</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"txtpilot2\" value='");
      out.print(rs.getString("pilot2"));
      out.write("'></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Arrival Time</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"arrTime\" value='");
      out.print(rs.getString("arriTime"));
      out.write("'></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Departure Time</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"depTime\" value='");
      out.print(rs.getString("depTime"));
      out.write("'></td>\r\n");
      out.write("                    </tr> \r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Arrival Date</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"arrDate\" value='");
      out.print(rs.getString("arriDate"));
      out.write("'></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Departure Date</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"depDate\" value='");
      out.print(rs.getString("depDate"));
      out.write("'></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Arrival Airport</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"txtarrAir\" value='");
      out.print(rs.getString("arriAirport"));
      out.write("'></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Departure Airport</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"txtdepAir\" value='");
      out.print(rs.getString("depAir"));
      out.write("'></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Number of Seats</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"NOS\" value='");
      out.print(rs.getInt("SeatCount"));
      out.write("'></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Number of Available Seats</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"NOA\" value='");
      out.print(rs.getInt("avaiSeat"));
      out.write("'></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td><center><input class=\"bttn\" type=\"submit\" value=\"Save\"></center></td>\r\n");
      out.write("                        <td><center><input class=\"bttn\" type=\"reset\" value=\"Clear\"></center></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                      ");
 }
                  }
                      catch(Exception e)
                    {
                    System.out.println(e.getMessage());
                }
                      
      out.write("\r\n");
      out.write("        \r\n");
      out.write("                </table>\r\n");
      out.write("                 </form>\r\n");
      out.write("    </center>\r\n");
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
