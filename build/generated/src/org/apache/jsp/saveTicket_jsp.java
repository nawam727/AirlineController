package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class saveTicket_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h3>data saved</h3>\r\n");
      out.write("                        ");
 
                   String tId=session.getAttribute("tick").toString();
                   int a=Integer.parseInt(tId);
                   try
                    {
                        Class.forName("com.mysql.jdbc.Driver");
                        String url="jdbc:mysql://localhost:3306/testair";
                        Connection con=DriverManager.getConnection(url, "root","");
                        
                        Statement st= con.createStatement();
                        
                        String a1=request.getParameter("txtdDate");
               
                        String sql1="UPDATE tickets SET depDate='"+a1+"' where ticketID='"+a+"'";
                        st.executeUpdate(sql1);
                        
                        String a2=request.getParameter("txtdTime");
                        
                        String sql2="UPDATE tickets SET depTime='"+a2+"' where ticketID='"+a+"'";
                        st.executeUpdate(sql2);
                        
                        String a3=request.getParameter("txtPrice");
                        String sql3="UPDATE tickets SET price='"+a3+"' where ticketID='"+a+"'";
                         st.executeUpdate(sql3);
                         
                         String a4=request.getParameter("SN");
                        String sql4="UPDATE tickets SET seatNo='"+a4+"' where ticketID='"+a+"'";
                        st.executeUpdate(sql4);
                        
                        String a5=request.getParameter("txtclass");
                        String sql5="UPDATE tickets SET class='"+a5+"' where ticketID='"+a+"'";
                        st.executeUpdate(sql5);
                        
                        int no=Integer.parseInt(request.getParameter("txtNOP"));
                        String sql6="UPDATE tickets SET NOP='"+no+"' where ticketID='"+a+"'";
                        st.executeUpdate(sql6);
                    }
                      catch(Exception e)
                    {
                        System.out.println(e.getMessage());
                    }
                      
      out.write("\r\n");
      out.write("                      <form action=\"tickets.html\">\r\n");
      out.write("                          <input type=\"submit\" value=\"home\"/>\r\n");
      out.write("                      </form>\r\n");
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
