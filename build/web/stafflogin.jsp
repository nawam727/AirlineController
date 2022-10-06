<%-- 
    Document   : stafflogin
    Created on : Oct 5, 2022, 10:37:23 PM
    Author     : AMANTER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <br><br><br><br>
        
        <center>
          <h1>Login</h1>
           <form action="StloginServlet" method="POST">
              <table border="0">
                    <tr>
                        <td><input type="text" name="suname" placeholder="User Name" /></td>
                    </tr>
                    
                    <tr>
                        <td><br><input type="password" name="supass"  placeholder="Password"/></td>
                    </tr>
                
                    <tr> 
                        <td><br><center><input type="submit" value="Log In" /></center></td>  
                    </tr>
                    
               </table>
           </form>
          </center>
    </body>
</html>
