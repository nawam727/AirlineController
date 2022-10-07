package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class saveflight_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <h1>Date Saved</h1>\r\n");
      out.write("                                \r\n");
      out.write("                    ");

                        String flId=session.getAttribute("flId").toString();
                   int a=Integer.parseInt(flId);
                   try
                    {
                        Class.forName("com.mysql.jdbc.Driver");
                        String url="jdbc:mysql://localhost:3306/testair";
                        Connection con=DriverManager.getConnection(url, "root","");
                        
                        Statement st= con.createStatement();
                        
                        String p1=request.getParameter("cptname");
               
                        String sql1="UPDATE flights SET pilot1='"+p1+"' where flightId='"+a+"'";
                        st.executeUpdate(sql1);
                        
                        String p2=request.getParameter("txtpilot2");
                        
                        String sql2="UPDATE flights SET pilot2='"+p2+"' where flightId='"+a+"'";
                        st.executeUpdate(sql2);
                        
                        String p3=request.getParameter("arrTime");
                        String sql3="UPDATE flights SET arriTime='"+p3+"' where flightId='"+a+"'";
                         st.executeUpdate(sql3);
                         
                         String P4=request.getParameter("depTime");
                        String sql4="UPDATE flights SET depTime='"+P4+"' where flightId='"+a+"'";
                        st.executeUpdate(sql4);
                        
                        String P5=request.getParameter("arrDate");
                        String sql5="UPDATE flights SET arriDate='"+P5+"' where flightId='"+a+"'";
                        st.executeUpdate(sql5);
                        
                        String P6=request.getParameter("depDate");
                        String sql6="UPDATE flights SET depDate='"+P6+"' where flightId='"+a+"'";
                        st.executeUpdate(sql6);
                        
                        String P7=request.getParameter("txtarrAir");
                        String sql7="UPDATE flights SET arriAirport='"+P7+"' where flightId='"+a+"'";
                        st.executeUpdate(sql7);
                        
                        String P8=request.getParameter("txtdepAir");
                        String sql8="UPDATE flights SET depAir='"+P8+"' where flightId='"+a+"'";
                        st.executeUpdate(sql8);
                        
                        int p9=Integer.parseInt(request.getParameter("NOS"));
                        String sql9="UPDATE flights SET SeatCount='"+p9+"' where flightId='"+a+"'";
                         st.executeUpdate(sql9);
                         
                         int p10=Integer.parseInt(request.getParameter("NOA"));
                        String sql10="UPDATE flights SET avaiSeat='"+p10+"' where flightId='"+a+"'";
                         st.executeUpdate(sql10);
                   
                    }
                      catch(Exception e)
                    {
                        System.out.println(e.getMessage());
                    }
                      
      out.write("\r\n");
      out.write("                      <form action=\"adflights.html\">\r\n");
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
