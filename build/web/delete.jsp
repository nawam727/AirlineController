<%-- 
    Document   : delete
    Created on : Oct 6, 2022, 2:17:51 AM
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
    <center>
    <body>
        <h1>Successfully Account Deleted</h1>
        <%
                   String cusId=session.getAttribute("CID").toString();
                   int a=Integer.parseInt(cusId);
                   try
                    {
                        Class.forName("com.mysql.jdbc.Driver");
                        String url="jdbc:mysql://localhost:3306/testair";
                        Connection con=DriverManager.getConnection(url, "root","");
                        Statement st= con.createStatement();
                        String sql="DELETE FROM client WHERE clientId='"+a+"'";
                        st.executeUpdate(sql);

                    }
                      catch(Exception e)
                    {
                        System.out.println(e.getMessage());
                    }
        %>
        <form action="StaffDash.html">
            <input class="bttn" type="submit" value="Home">
        </form>
    </body>
    </center>
</html>
