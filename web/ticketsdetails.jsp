<%-- 
    Document   : ticketsdetails
    Created on : Oct 3, 2022, 8:58:37 PM
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
                <a href="#about">Sign In</a>
                <a href="#about">Sign Up</a>
                </div> 
            </center>
            
                        
                            
                    <center> <h3> Results for Flight Id :<%=request.getParameter("txttkId")%></h3></center>
                            
                            <%
                    try
                    {
                        Class.forName("com.mysql.jdbc.Driver");
                        String url="jdbc:mysql://localhost:3306/testair";
                        Connection con=DriverManager.getConnection(url, "root","");
                        
                        Statement st= con.createStatement();
                        
                        int tkId= Integer.parseInt(request.getParameter("txttkId"));
                        session.setAttribute("tic", tkId);
                        String query="Select * from tickets where ticketID='"+tkId+"'";
                        ResultSet rs=st.executeQuery(query);
                        while(rs.next())
                        {
                %>
                <form action="editTicket.jsp">
                <center>
                <table border="0">
                        <tr>
                            <td>Ticket ID</td>
                            <td><%=rs.getInt("ticketID")%></td>
                        </tr>
                        <tr>
                            <td>Departure Date</td>
                            <td><%=rs.getString("depDate")%></td>
                        </tr>
                        <tr>
                            <td>Departure Time</td>
                            <td><%=rs.getString("depTime")%></td>
                        </tr>
                        <tr>
                            <td>Price</td>
                            <td><%=rs.getInt("price")%></td>
                        </tr>
                        <tr>
                            <td>Seat No</td>
                            <td><%=rs.getInt("seatNo")%></td>
                        </tr>
                        <tr>
                            <td>Class</td>
                            <td><%=rs.getString("class")%></td>
                        </tr>
                        <tr>
                            <td>Number of Passengers</td>
                            <td><%=rs.getInt("NOP")%></td>
                        </tr>
                        <tr>
                            <td><input class="bttn" type="submit" value="Edit"</td>
                            <td><input class="bttn" type="reset" value="Back"/></td>
                        </tr> 
                               <% }
                    }
                      catch(Exception e)
                    {
                        System.out.println(e.getMessage());
                    }
                      %>
                </table>
                </form>
                <form action="deleteTicket.jsp"><input class="bttn" type="submit" value="Delete"/></form>
            </center>
                
        </h3>
    </body>
</html>
