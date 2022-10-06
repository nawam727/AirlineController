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
        <link rel="stylesheet" href="css/flight.css">
        <link rel="stylesheet" href="css/navbar.css">
    </head>
    <body>
    <center>
        <h3>Data Saved</h3>
                        <% 
                   String cusId=session.getAttribute("CID").toString();
                   int a=Integer.parseInt(cusId);
                   try
                    {
                        Class.forName("com.mysql.jdbc.Driver");
                        String url="jdbc:mysql://localhost:3306/testair";
                        Connection con=DriverManager.getConnection(url, "root","");
                        
                        Statement st= con.createStatement();
                        
                        String Fname=request.getParameter("fname");
               
                        String sql1="UPDATE client SET cfname='"+Fname+"' where clientId='"+a+"'";
                        st.executeUpdate(sql1);
                        
                        String Lname=request.getParameter("lname");
                        
                        String sql2="UPDATE client SET clname='"+Lname+"' where clientId='"+a+"'";
                        st.executeUpdate(sql2);
                        
                        String Email=request.getParameter("mail");
                        String sql3="UPDATE client SET clemail='"+Email+"' where clientId='"+a+"'";
                         st.executeUpdate(sql3);
                         
                         String Pass=request.getParameter("pwd");
                        String sql4="UPDATE client SET clpass='"+Pass+"' where clientId='"+a+"'";
                        st.executeUpdate(sql4);
                        
                        int VNo=Integer.parseInt(request.getParameter("num"));
                        String sql5="UPDATE client SET clvno='"+VNo+"' where clientId='"+a+"'";
                         st.executeUpdate(sql5);
                   
                    }
                      catch(Exception e)
                    {
                        System.out.println(e.getMessage());
                    }
                      %>
                      <form action="StaffDash.html">
                          <input class="bttn" type="submit" value="Home"/>
                      </form>
    </center>
    </body>
</html>
