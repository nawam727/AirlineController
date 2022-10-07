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
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css"> <!-- social media icons link-->
 <link rel="stylesheet" href="css/navbar.css">    <!-- nav bar css link -->
 <link rel="stylesheet" href="css/flight.css">     <!-- css link --> 
        <title>JSP Page</title>
    </head>
    <body>
        <div class="topnav">
                <a class="active" href="StaffDash.html">Home</a>
                <a href="tickets.html">Tickets</a>
                <a href="flights.html">Flights</a>
                <a href="stafflogin.jsp">Sign In</a>
                <a href="logstaff.html">Sign Up</a>
                </div> 
        
         <!-- header section -->  
    <header class="hero-section">
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
                String sql="SELECT flightId,arriTime,arriDate,arriAirport,depTime,depDate,depAir,avaiSeat,price FROM flights where depAir='"+DepAir+"' && arriAirport='"+ArrAir+"' && depDate='"+DepDate+"' || arriDate='"+ArrDate+"'";
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
    </header> 
            
      
       <!-- footer  -->
                 
          <div class="footer">            
            <div class="footer-clean">
                <footer>
                    <div class="container">
                        <div class="row justify-content-center">

                            
                                <div class="col-sm-4 col-md-3 item">
                                    <h3>About Us</h3>
                                    <ul>
                                       <li><a href="#">About phoenix Airlines</a></li>
                                       <li><a href="#">Media Center</a></li>
                                       <li><a href="#">Advertise with us</a></li>
                                       <li><a href="#">Careers</a></li>
                                    </ul>
                                </div>
                            
                           

                         
                            <div class="col-sm-4 col-md-3 item">
                                <h3>Help</h3>
                                <ul>
                                    <li><a href="#">24 Hours Contact Center</a></li>
                                    <li><a href="#">Online Chat Support</a></li>
                                    <li><a href="#">FAQs</a></li>
                                </ul>
                            </div>
                            
                            
                             <div class="col-sm-4 col-md-3 item">
                                    <h3>Services</h3>
                                    <ul>
                                       <li><a href="#">Cargo</a></li>
                                       <li><a href="#">Ground Handling</a></li>
                                       <li><a href="#">Holidays</a></li>
                                       <li><a href="#">Catering</a></li>
                                    </ul>
                                </div>
                         
                            
                         
                            <div class="col-sm-4 col-md-3 item">
                                <h3>Terms & Conditions</h3>
                                <ul>
                                    <li><a href="#">Online Booking Terms of Use</a></li>
                                    <li><a href="#">Conditions of Carriage</a></li>
                                    <li><a href="#">Permission Center</a></li>
                                    <li><a href="#">Service Fees at Ticket Office</a></li>
                                </ul>
                            </div>
                         

                        
                            <div class="col-lg-3 item social">
                                <center><h3>Follow Us</h3></center>
                                <a href="#"><i class="icon ion-social-facebook"></i></a>
                                <a href="#"><i class="icon ion-social-twitter"></i></a>
                                <a href="#"><i class="icon ion-social-snapchat"></i></a> 
                                <a href="#"><i class="icon ion-social-instagram"></i></a>
                                <p class="copyright">Copyright © 2022 All Rights Reserved</p>
                            </div>      
                        </div>
                     </div>
                </footer>
            </div>
        </div> 
      
    </body>
</html>