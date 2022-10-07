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
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css"> <!-- social media icons link-->

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
    <!-- header section -->  
    <header class="hero-section">

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
