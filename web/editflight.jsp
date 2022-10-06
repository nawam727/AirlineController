<%-- 
    Document   : editflight
    Created on : Oct 6, 2022, 1:38:56 PM
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
    </head>
    <body>
        <h1>Edit Flight Details</h1>
         <% 
                  String fliId=session.getAttribute("flId").toString();
                  int f=Integer.parseInt(fliId);
                  
                   try
                    {
                        Class.forName("com.mysql.jdbc.Driver");
                        String url="jdbc:mysql://localhost:3306/testair";
                        Connection con=DriverManager.getConnection(url, "root","");
                        
                        Statement st= con.createStatement();
             
                        String query="Select * from flights where flightId='"+f+"'";
                        ResultSet rs=st.executeQuery(query);
                        while(rs.next())
                        {

                %>
                
           
                <h4>Flight ID <%=rs.getInt("flightId")%></h4>
                <% session.setAttribute("flId",fliId); %>
                 <form action="saveflight.jsp" method="post">
                <table border="0">
                    <tr>
                        <td>Captain Name</td>
                        <td><input type="text" name="cptname" value='<%=rs.getString("pilot1")%>'></td>
                    </tr>
                    
                    <tr>
                        <td>Second Officer Name</td>
                        <td><input type="text" name="txtpilot2" value='<%=rs.getString("pilot2")%>'></td>
                    </tr>
                    <tr>
                        <td>Arrival Time</td>
                        <td><input type="text" name="arrTime" value='<%=rs.getString("arriTime")%>'></td>
                    </tr>
                    <tr>
                        <td>Departure Time</td>
                        <td><input type="text" name="depTime" value='<%=rs.getString("depTime")%>'></td>
                    </tr> 
                    <tr>
                        <td>Arrival Date</td>
                        <td><input type="text" name="arrDate" value='<%=rs.getString("arriDate")%>'></td>
                    </tr>
                    <tr>
                        <td>Departure Date</td>
                        <td><input type="text" name="depDate" value='<%=rs.getString("depDate")%>'></td>
                    </tr>
                    <tr>
                        <td>Arrival Airport</td>
                        <td><input type="text" name="txtarrAir" value='<%=rs.getString("arriAirport")%>'></td>
                    </tr>
                    <tr>
                        <td>Departure Airport</td>
                        <td><input type="text" name="txtdepAir" value='<%=rs.getString("depAir")%>'></td>
                    </tr>
                    <tr>
                        <td>Number of Seats</td>
                        <td><input type="text" name="NOS" value='<%=rs.getInt("SeatCount")%>'></td>
                    </tr>
                    <tr>
                        <td>Number of Available Seats</td>
                        <td><input type="text" name="NOA" value='<%=rs.getInt("avaiSeat")%>'></td>
                    </tr>
                    <tr>
                        <td><center><input type="submit" value="save"></center></td>
                        <td><center><input type="reset" value="clear"></center></td>
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
    </body>
</html>
