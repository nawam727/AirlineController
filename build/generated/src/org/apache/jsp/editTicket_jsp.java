package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class editTicket_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <div>\r\n");
      out.write("            <center>\r\n");
      out.write("                <h1>Edit Ticket Details</h1>\r\n");
      out.write("                \r\n");
      out.write("                ");
 
                   String tickId=session.getAttribute("tic").toString();
                   int t=Integer.parseInt(tickId);
                   try
                    {
                        Class.forName("com.mysql.jdbc.Driver");
                        String url="jdbc:mysql://localhost:3306/testair";
                        Connection con=DriverManager.getConnection(url, "root","");
                        
                        Statement st= con.createStatement();
             
                        String query="Select * from tickets where ticketID='"+t+"'";
                        session.setAttribute("tick",t);
                        ResultSet rs=st.executeQuery(query);
                        while(rs.next())
                        {
                
      out.write("\r\n");
      out.write("                \r\n");
      out.write("            <form action=\"saveTicket.jsp\" method=\"post\">\r\n");
      out.write("                <h4>Ticket ID ");
      out.print(rs.getInt("ticketID"));
      out.write("</h4>\r\n");
      out.write("                \r\n");
      out.write("                <table border=\"0\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Departure Date</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"txtdDate\" value='");
      out.print(rs.getString("depDate"));
      out.write("'/></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Departure Time</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"txtdTime\" value='");
      out.print(rs.getString("depTime"));
      out.write("'/></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Price</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"txtPrice\" value='");
      out.print(rs.getInt("price"));
      out.write("'/></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Seat Number</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"SN\" value='");
      out.print(rs.getInt("seatNo"));
      out.write("'/></td>\r\n");
      out.write("                    </tr> \r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Class</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"txtclass\" value='");
      out.print(rs.getString("class"));
      out.write("'/></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Number of passengers</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"txtNOP\" value='");
      out.print(rs.getInt("NOP"));
      out.write("'/></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td><center><input class=\"bttn\" type=\"submit\" value=\"Save\"></center></td>\r\n");
      out.write("                <td><center><input class=\"bttn\" type=\"reset\" value=\"Clear\"></center></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                      ");
 }
                    }
                      catch(Exception e)
                    {
                        System.out.println(e.getMessage());
                    }
                      
      out.write("\r\n");
      out.write("                </table>\r\n");
      out.write("            </form>\r\n");
      out.write("                </center>\r\n");
      out.write("        </div>\r\n");
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
