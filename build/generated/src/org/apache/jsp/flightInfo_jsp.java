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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("           <!-- <center>\n");
      out.write("                <h2>Outbound ");
      out.print(request.getParameter("txtDeptAir"));
      out.write(" to ");
      out.print(request.getParameter("txtArrAir"));
      out.write(" </h2>\n");
      out.write("            </center> \n");
      out.write("                Departure Date ");
      out.print(request.getParameter("DDate"));
      out.write("\n");
      out.write("                Arrival Date");
      out.print(request.getParameter("ADate"));
      out.write("\n");
      out.write("           -->\n");
      out.write("                \n");
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
                String sql="SELECT flightId,arriTime,arriDate,arriAirport,depTime,depDate,depAir,avaiSeat FROM flights where depAir='"+DepAir+"' && arriAirport='"+ArrAir+"' && depDate='"+DepDate+"' || arriDate='"+ArrDate+"'";
                ResultSet rs=st.executeQuery(sql);
                while(rs.next())
                {
                
      out.write("\n");
      out.write("                \n");
      out.write("                <form action=\"Booking.jsp\" method=\"post\">\n");
      out.write("                <table border=\"0\">\n");
      out.write("                    <th><center>take off from ");
      out.print(request.getParameter("txtDeptAir"));
      out.write("</center></th>\n");
      out.write("                    <th> to ");
      out.print(request.getParameter("txtArrAir"));
      out.write("</th>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Flight ID</td>\n");
      out.write("                    <td>");
      out.print(rs.getInt("flightId"));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Departure Airport</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("depAir"));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                <td>Arrival Airport</td>\n");
      out.write("                <td>");
      out.print(rs.getString("arriAirport"));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Departure Date</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("depDate"));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Arrival Date</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("arriDate"));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Departure Time</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("depTime"));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Arrival time</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("arriTime"));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Available Seat</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("avaiSeat"));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"submit\" value=\"book\" /> \n");
      out.write("                        </td>\n");
      out.write("                    <td> \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                </table>\n");
      out.write("                </form>\n");
      out.write("                <p><font color=\"red\">*</font>Please remember the flight Id</p>\n");
      out.write("                <p><font color=\"red\">*</font>You need to log into the your account before booking</p>\n");
      out.write("                <br/>\n");
      out.write("                ");
 }
                    }
                      catch(Exception e)
                    {
                        System.out.println(e.getMessage());
                    }

      out.write("\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
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
