package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class flightInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div>\r\n");
      out.write("           \r\n");
      out.write("                \r\n");
      out.write("                ");

                    
                    String DepAir=request.getParameter("txtDeptAir");
                    String ArrAir=request.getParameter("txtArrAir");
                    String DepDate=request.getParameter("DDate");
                    String ArrDate=request.getParameter("ADate");
                    try{
                Class.forName("com.mysql.jdbc.Driver");
                        String url="jdbc:mysql://localhost:3306/testair";
                        Connection con=DriverManager.getConnection(url, "root","");
                Statement st= con.createStatement();
                String sql="SELECT flightId,arriTime,arriDate,arriAirport,depTime,depDate,depAir,avaiSeat,price FROM flights where depAir='"+DepAir+"' && arriAirport='"+ArrAir+"' && depDate='"+DepDate+"' || arriDate='"+ArrDate+"'";
                ResultSet rs=st.executeQuery(sql);
                while(rs.next())
                {
                
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                <form action=\"Booking.jsp\" method=\"post\">\r\n");
      out.write("                <table border=\"0\">\r\n");
      out.write("                    <th><center>take off from ");
      out.print(request.getParameter("txtDeptAir"));
      out.write("</center></th>\r\n");
      out.write("                    <th> to ");
      out.print(request.getParameter("txtArrAir"));
      out.write("</th>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Flight ID</td>\r\n");
      out.write("                    <td>");
      out.print(rs.getInt("flightId"));
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Departure Airport</td>\r\n");
      out.write("                    <td>");
      out.print(rs.getString("depAir"));
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                <td>Arrival Airport</td>\r\n");
      out.write("                <td>");
      out.print(rs.getString("arriAirport"));
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Departure Date</td>\r\n");
      out.write("                    <td>");
      out.print(rs.getString("depDate"));
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Arrival Date</td>\r\n");
      out.write("                    <td>");
      out.print(rs.getString("arriDate"));
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Departure Time</td>\r\n");
      out.write("                    <td>");
      out.print(rs.getString("depTime"));
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Arrival time</td>\r\n");
      out.write("                    <td>");
      out.print(rs.getString("arriTime"));
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Available Seat</td>\r\n");
      out.write("                    <td>");
      out.print(rs.getString("avaiSeat"));
      out.write("</td>\r\n");
      out.write("                </tr>       \r\n");
      out.write("               \r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <input type=\"submit\" value=\"book\" /> \r\n");
      out.write("                        </td>\r\n");
      out.write("                    <td> \r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("                </form>\r\n");
      out.write("                <p><font color=\"red\">*</font>Please remember the flight Id</p>\r\n");
      out.write("                <p><font color=\"red\">*</font>You need to log into the your account before booking</p>\r\n");
      out.write("                <br/>\r\n");
      out.write("                ");
 }
                    }
                      catch(Exception e)
                    {
                        System.out.println(e.getMessage());
                    }

      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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
