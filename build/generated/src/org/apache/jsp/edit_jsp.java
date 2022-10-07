package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                <h1>Edit Passenger Accounts</h1>\r\n");
      out.write("                \r\n");
      out.write("                ");
 
                   String cusId=session.getAttribute("CID").toString();
                   int a=Integer.parseInt(cusId);
                   try
                    {
                        Class.forName("com.mysql.jdbc.Driver");
                        String url="jdbc:mysql://localhost:3306/testair";
                        Connection con=DriverManager.getConnection(url, "root","");
                        
                        Statement st= con.createStatement();
             
                        String query="Select * from client where clientId='"+a+"'";
                        ResultSet rs=st.executeQuery(query);
                        while(rs.next())
                        {
                
      out.write("\r\n");
      out.write("                \r\n");
      out.write("            <form action=\"save.jsp\" method=\"post\">\r\n");
      out.write("                <h4>Passenger ID ");
      out.print(rs.getInt("clientId"));
      out.write("</h4>\r\n");
      out.write("                ");
 session.setAttribute("CID",cusId); 
      out.write("\r\n");
      out.write("                <table border=\"0\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>First name</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"fname\" value='");
      out.print(rs.getString("cfname"));
      out.write("'></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Last name</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"lname\" value='");
      out.print(rs.getString("clname"));
      out.write("'></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Email</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"mail\" value='");
      out.print(rs.getString("clemail"));
      out.write("'></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Password</td>\r\n");
      out.write("                        <td><input type=\"password\" name=\"pwd\" value='");
      out.print(rs.getString("clpass"));
      out.write("'></td>\r\n");
      out.write("                    </tr> \r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Vaccine Card number</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"num\" value='");
      out.print(rs.getInt("clvno"));
      out.write("'></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td><center><input class=\"bttn\" type=\"submit\" value=\"save\"></center></td>\r\n");
      out.write("                        <td><center><input class=\"bttn\" type=\"reset\" value=\"clear\"></center></td>\r\n");
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
