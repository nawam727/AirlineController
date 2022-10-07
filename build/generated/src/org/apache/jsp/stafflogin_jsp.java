package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class stafflogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/navbar.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/flight.css\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        <center>\r\n");
      out.write("                <div class=\"topnav\">\r\n");
      out.write("                <a class=\"active\" href=\"index.html\">Home</a>\r\n");
      out.write("                <a href=\"#news\">Tickets</a>\r\n");
      out.write("                <a href=\"\">Flights</a>\r\n");
      out.write("                <a href=\"stafflogin.jsp\">Sign In</a>\r\n");
      out.write("                <a href=\"logstaff.html\">Sign Up</a>\r\n");
      out.write("                </div> \r\n");
      out.write("            </center>\r\n");
      out.write("        <br><br><br><br>\r\n");
      out.write("        \r\n");
      out.write("        <center>\r\n");
      out.write("          <h1>Login</h1>\r\n");
      out.write("           <form action=\"StloginServlet\" method=\"POST\">\r\n");
      out.write("              <table border=\"0\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td><input type=\"text\" name=\"suname\" placeholder=\"User Name\" /></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td><br><input type=\"password\" name=\"supass\"  placeholder=\"Password\"/></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                \r\n");
      out.write("                    <tr> \r\n");
      out.write("                        <td><br><center><input class=\"bttn\" type=\"submit\" value=\"Log In\" /></center></td>  \r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("               </table>\r\n");
      out.write("           </form>\r\n");
      out.write("          </center>\r\n");
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
