<%-- 
    Document   : customer
    Created on : Oct 1, 2022, 6:54:34 PM
    Author     : navee
--%>

<%@page import="java.sql.ResultSet"%>
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
                <div class="topnav">
                <a class="active" href="StaffDash.html">Home</a>
                <a href="tickets.html">Tickets</a>
                <a href="flights.html">Flights</a>
                <a href="#about">Sign In</a>
                <a href="#about">Sign Up</a>
                </div> 
            </center>
        <br>
        <br>
        <br>
            <h3> 
                <center>
                <table boder="0">
                    <th>
                        Results for client Id :
                        <%=request.getParameter("txtcusId")%> 
                    </th>
                    <tr></tr>
                    <tr></tr>
                <%
                    try
                    {
                        Class.forName("com.mysql.jdbc.Driver");
                        String url="jdbc:mysql://localhost:3306/testair";
                        Connection con=DriverManager.getConnection(url, "root","");
                        
                        Statement st= con.createStatement();
                        
                        int cusId= Integer.parseInt(request.getParameter("txtcusId"));
                        String query="Select * from client where clientId='"+cusId+"'";
                        ResultSet rs=st.executeQuery(query);
                        while(rs.next())
                        {
                        %>
                    
                        <tr>
                            <td>User Id</td>
                            <td><%=rs.getInt("clientId")%></td>
                        </tr>
                        <tr>
                            <td>First Name</td>
                            <td><%=rs.getString("cfname")%></td>
                        </tr>
                        <tr>
                            <td>Last Name</td>
                            <td><%=rs.getString("clname")%></td>
                        </tr>
                        <tr>
                            <td>Email</td>
                            <td><%=rs.getString("clemail")%></td>
                        </tr>
                        <tr>
                            <td>Password</td>
                            <td><%=rs.getString("clpass")%></td>
                        </tr>
                        <tr>
                            <td>Vaccine Card number</td>
                            <td><%=rs.getInt("clvno")%></td>
                        </tr>
                        <tr>
                            <td><input class="bttn" type="submit" value="edit"/></td>
                            <td><form action="StaffDash.html" method="POST">
                                    <input class="bttn" type="submit" value="Back">
                                </form></td>
                        </tr>
                        <% }
                    }
                      catch(Exception e)
                    {
                        System.out.println(e.getMessage());
                    }
                      %>
                </table>
        </center>
        </h3>
    </body>
</html>
