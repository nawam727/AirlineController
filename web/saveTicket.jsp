<%-- 
    Document   : save
    Created on : Oct 6, 2022, 12:44:49 AM
    Author     : navee
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>data saved</h3>
                        <% 
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
                      %>
                      <form action="tickets.html">
                          <input type="submit" value="home"/>
                      </form>
    </body>
</html>
