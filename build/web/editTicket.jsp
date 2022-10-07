<%-- 
    Document   : edit
    Created on : Oct 5, 2022, 11:41:17 AM
    Author     : Expert Book
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
        <div>
            <center>
                <h1>Edit Ticket Details</h1>
                
                <% 
                   String tickId=session.getAttribute("tic").toString();
                   int t=Integer.parseInt(tickId);
                   try
                    {
                        Class.forName("com.mysql.jdbc.Driver");
                        String url="jdbc:mysql://localhost:3306/testair";
                        Connection con=DriverManager.getConnection(url, "root","");
                        
                        Statement st= con.createStatement();
             
                        String query="Select * from tickets where ticketID='"+t+"'";
                        session.setAttribute("tick",t);
                        ResultSet rs=st.executeQuery(query);
                        while(rs.next())
                        {
                %>
                
            <form action="saveTicket.jsp" method="post">
                <h4>Ticket ID <%=rs.getInt("ticketID")%></h4>
                
                <table border="0">
                    <tr>
                        <td>Departure Date</td>
                        <td><input type="text" name="txtdDate" value='<%=rs.getString("depDate")%>'/></td>
                    </tr>
                    
                    <tr>
                        <td>Departure Time</td>
                        <td><input type="text" name="txtdTime" value='<%=rs.getString("depTime")%>'/></td>
                    </tr>
                    <tr>
                        <td>Price</td>
                        <td><input type="text" name="txtPrice" value='<%=rs.getInt("price")%>'/></td>
                    </tr>
                    <tr>
                        <td>Seat Number</td>
                        <td><input type="text" name="SN" value='<%=rs.getInt("seatNo")%>'/></td>
                    </tr> 
                    <tr>
                        <td>Class</td>
                        <td><input type="text" name="txtclass" value='<%=rs.getString("class")%>'/></td>
                    </tr>
                    <tr>
                        <td>Number of passengers</td>
                        <td><input type="text" name="txtNOP" value='<%=rs.getInt("NOP")%>'/></td>
                    </tr>
                    <tr>
                        <td><center><input class="bttn" type="submit" value="Save"></center></td>
                <td><center><input class="bttn" type="reset" value="Clear"></center></td>
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
                </center>
        </div>
    </body>
</html>