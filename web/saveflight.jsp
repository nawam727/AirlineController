<%-- 
    Document   : saveflight
    Created on : Oct 6, 2022, 3:02:10 PM
    Author     : Expert Book
--%>

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
        <h1>Date Saved</h1>
                                
                    <%
                        String flId=session.getAttribute("flId").toString();
                   int a=Integer.parseInt(flId);
                   try
                    {
                        Class.forName("com.mysql.jdbc.Driver");
                        String url="jdbc:mysql://localhost:3306/testair";
                        Connection con=DriverManager.getConnection(url, "root","");
                        
                        Statement st= con.createStatement();
                        
                        String p1=request.getParameter("cptname");
               
                        String sql1="UPDATE flights SET pilot1='"+p1+"' where flightId='"+a+"'";
                        st.executeUpdate(sql1);
                        
                        String p2=request.getParameter("txtpilot2");
                        
                        String sql2="UPDATE flights SET pilot2='"+p2+"' where flightId='"+a+"'";
                        st.executeUpdate(sql2);
                        
                        String p3=request.getParameter("arrTime");
                        String sql3="UPDATE flights SET arriTime='"+p3+"' where flightId='"+a+"'";
                         st.executeUpdate(sql3);
                         
                         String P4=request.getParameter("depTime");
                        String sql4="UPDATE flights SET depTime='"+P4+"' where flightId='"+a+"'";
                        st.executeUpdate(sql4);
                        
                        String P5=request.getParameter("arrDate");
                        String sql5="UPDATE flights SET arriDate='"+P5+"' where flightId='"+a+"'";
                        st.executeUpdate(sql5);
                        
                        String P6=request.getParameter("depDate");
                        String sql6="UPDATE flights SET depDate='"+P6+"' where flightId='"+a+"'";
                        st.executeUpdate(sql6);
                        
                        String P7=request.getParameter("txtarrAir");
                        String sql7="UPDATE flights SET arriAirport='"+P7+"' where flightId='"+a+"'";
                        st.executeUpdate(sql7);
                        
                        String P8=request.getParameter("txtdepAir");
                        String sql8="UPDATE flights SET depAir='"+P8+"' where flightId='"+a+"'";
                        st.executeUpdate(sql8);
                        
                        int p9=Integer.parseInt(request.getParameter("NOS"));
                        String sql9="UPDATE flights SET SeatCount='"+p9+"' where flightId='"+a+"'";
                         st.executeUpdate(sql9);
                         
                         int p10=Integer.parseInt(request.getParameter("NOA"));
                        String sql10="UPDATE flights SET avaiSeat='"+p10+"' where flightId='"+a+"'";
                         st.executeUpdate(sql10);
                   
                    }
                      catch(Exception e)
                    {
                        System.out.println(e.getMessage());
                    }
                      %>
                      <form action="adflights.html">
                          <input type="submit" value="home"/>
                      </form>
    </body>
</html>
