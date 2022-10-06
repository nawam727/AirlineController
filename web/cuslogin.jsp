<%-- 
    Document   : cuslogin
    Created on : Oct 6, 2022, 2:55:19 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/navbar.css">
        <link rel="stylesheet" href="css/flight.css">
    </head>
    <body>
        <center>
                <div class="topnav">
                <a class="active" href="index.html">Home</a>
                <a href="">Tickets</a>
                <a href="">Flights</a>
                <a href="cuslogin.jsp">Sign In</a>
                <a href="AddCus.html">Sign Up</a>
                </div> 
            </center>
        <br><br><br>
    <center>
        <h1>Login</h1>
        <form action="cuslogServlet" method="POST">
              <table border="0">
                    <tr>
                        <td><input type="text" name="suname" placeholder="User Name" /></td>
                    </tr>
                    
                    <tr>
                        <td><br><input type="password" name="supass"  placeholder="Password"/></td>
                    </tr>
                
                    <tr> 
                        <td><br><center><input class="bttn" type="submit" value="Log In" /></center></td>  
                    </tr>
                    
               </table>
           </form>
    </center>
    </body>
</html>
