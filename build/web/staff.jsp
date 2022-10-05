<%-- 
    Document   : staff
    Created on : Oct 5, 2022, 4:25:10 PM
    Author     : DELL
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
                <a href="staff.html">Staff</a>
                </div> 
            </center>
    <br>
        <br>
        <br>
        <center>
            <table border="0">
                    <tr>
                        <th>
                            Results for client Id :
                        <%=request.getParameter("txtsfId")%>
                        </th>
                    </tr>
                    <%
                    try
                    {
                        Class.forName("com.mysql.jdbc.Driver");
                        String url="jdbc:mysql://localhost:3306/testair";
                        Connection con=DriverManager.getConnection(url, "root","");
                        
                        Statement st= con.createStatement();
                        
                        int sfId= Integer.parseInt(request.getParameter("txtsfId"));
                        String query="Select * from client where stId='"+sfId+"'";
                        ResultSet rs=st.executeQuery(query);
                        while(rs.next())
                        {
                        %>
                    <tr>
                        <td>Staff ID</td>
                        <td><%=rs.getInt("stId")%></td>
                    </tr>
                    <tr>
                        <td>First Name</td>
                        <td><%=rs.getString("stfname")%></td>
                    </tr>
                    <tr>
                        <td>Last Name</td>
                        <td><%=rs.getString("stlname")%></td>
                    </tr>
                    <tr>
                        <td>Email</td>
                        <td><%=rs.getString("stemail")%></td>
                    </tr>
                    <tr>
                        <td>Date Of Birth</td>
                        <td><%=rs.getString("stdob")%></td>
                    </tr>
                    <tr>
                        <td>Residence</td>
                        <td><%=rs.getString("stpr")%></td>
                    </tr>
                    <tr>
                        <td>Country Code</td>
                        <td><%=rs.getInt("stccode")%></td>
                    </tr>
                    <tr>
                        <td>Mobile Number</td>
                        <td><%=rs.getInt("stmno")%></td>
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
    </body>
</html>
