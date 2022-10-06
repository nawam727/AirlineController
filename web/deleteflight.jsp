<%-- 
    Document   : delete
    Created on : Oct 6, 2022, 5:06:44 PM
    Author     : Expert Book
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
        <h1>Successfully Account Deleted</h1>
        <%
                   String FID=session.getAttribute("flId").toString();
                   int a=Integer.parseInt(FID);
                   try
                    {
                        Class.forName("com.mysql.jdbc.Driver");
                        String url="jdbc:mysql://localhost:3306/testair";
                        Connection con=DriverManager.getConnection(url, "root","");
                        Statement st= con.createStatement();
                        String sql="DELETE FROM flights WHERE flightId='"+a+"'";
                        st.executeUpdate(sql);

                    }
                      catch(Exception e)
                    {
                        System.out.println(e.getMessage());
                    }
        %>
        <form action="adflights.html">
            <input type="submit" value="home">
        </form>
    </body>
</html>
