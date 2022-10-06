<%-- 
    Document   : flightInfo
    Created on : Oct 2, 2022, 12:15:19 PM
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
    </head>
    <body>
        <div>
           
                
                <%
                    
                    String DepAir=request.getParameter("txtDeptAir");
                    String ArrAir=request.getParameter("txtArrAir");
                    String DepDate=request.getParameter("DDate");
                    String ArrDate=request.getParameter("ADate");
                    try{
                Class.forName("com.mysql.jdbc.Driver");
                        String url="jdbc:mysql://localhost:3306/testair";
                        Connection con=DriverManager.getConnection(url, "root","");
                Statement st= con.createStatement();
                String sql="SELECT flightId,arriTime,arriDate,arriAirport,depTime,depDate,depAir,avaiSeat FROM flights where depAir='"+DepAir+"' && arriAirport='"+ArrAir+"' && depDate='"+DepDate+"' || arriDate='"+ArrDate+"'";
                ResultSet rs=st.executeQuery(sql);
                while(rs.next())
                {
                %>
                
                <form action="Booking.jsp" method="post">
                <table border="0">
                    <th><center>take off from <%=request.getParameter("txtDeptAir")%></center></th>
                    <th> to <%=request.getParameter("txtArrAir")%></th>
                <tr>
                    <td>Flight ID</td>
                    <td><%=rs.getInt("flightId")%></td>
                </tr>
                <tr>
                    <td>Departure Airport</td>
                    <td><%=rs.getString("depAir")%></td>
                </tr>
                <tr>
                <td>Arrival Airport</td>
                <td><%=rs.getString("arriAirport")%></td>
                </tr>
                <tr>
                    <td>Departure Date</td>
                    <td><%=rs.getString("depDate")%></td>
                </tr>
                <tr>
                    <td>Arrival Date</td>
                    <td><%=rs.getString("arriDate")%></td>
                </tr>
                <tr>
                    <td>Departure Time</td>
                    <td><%=rs.getString("depTime")%></td>
                </tr>
                <tr>
                    <td>Arrival time</td>
                    <td><%=rs.getString("arriTime")%></td>
                </tr>
                <tr>
                    <td>Available Seat</td>
                    <td><%=rs.getString("avaiSeat")%></td>
                </tr>

                <tr>
                    <td>
                        <input type="submit" value="book" /> 
                        </td>
                    <td> 
                    </td>
                </tr>
                </table>
                </form>
                <p><font color="red">*</font>Please remember the flight Id</p>
                <p><font color="red">*</font>You need to log into the your account before booking</p>
                <br/>
                <% }
                    }
                      catch(Exception e)
                    {
                        System.out.println(e.getMessage());
                    }
%>
            </div>
        
    </body>
</html>