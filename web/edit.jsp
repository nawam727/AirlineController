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
                <h1>Edit Passenger Accounts</h1>
                
                <% 
                   String cusId=session.getAttribute("CID").toString();
                   int a=Integer.parseInt(cusId);
                   try
                    {
                        Class.forName("com.mysql.jdbc.Driver");
                        String url="jdbc:mysql://localhost:3306/testair";
                        Connection con=DriverManager.getConnection(url, "root","");
                        
                        Statement st= con.createStatement();
             
                        String query="Select * from client where clientId='"+a+"'";
                        ResultSet rs=st.executeQuery(query);
                        while(rs.next())
                        {
                %>
                
            <form action="save.jsp" method="post">
                <h4>Passenger ID <%=rs.getInt("clientId")%></h4>
                <% session.setAttribute("CID",cusId); %>
                <table border="0">
                    <tr>
                        <td>First name</td>
                        <td><input type="text" name="fname" value='<%=rs.getString("cfname")%>'></td>
                    </tr>
                    
                    <tr>
                        <td>Last name</td>
                        <td><input type="text" name="lname" value='<%=rs.getString("clname")%>'></td>
                    </tr>
                    <tr>
                        <td>Email</td>
                        <td><input type="text" name="mail" value='<%=rs.getString("clemail")%>'></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="pwd" value='<%=rs.getString("clpass")%>'></td>
                    </tr> 
                    <tr>
                        <td>Vaccine Card number</td>
                        <td><input type="text" name="num" value='<%=rs.getInt("clvno")%>'></td>
                    </tr>
                    <tr>
                        <td><center><input class="bttn" type="submit" value="save"></center></td>
                        <td><center><input class="bttn" type="reset" value="clear"></center></td>
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