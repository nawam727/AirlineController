/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ass;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
@WebServlet(name = "cuslogServlet", urlPatterns = {"/cuslogServlet"})
public class cuslogServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet cuslogServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet cuslogServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        
        //request parameters from jsp to here   
            String stfname = request.getParameter("suname");
            String stpass = request.getParameter("supass");
            
            //create connection to db
            try{
                Connection con;
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","");
                System.out.println("Connected Login Part"); // connected
                String sql = "select * from testair.client where cfname=? and clpass=?";
                PreparedStatement ps = con.prepareStatement(sql);//will run query
                ps.setString(1, stfname);      
                ps.setString(2, stpass);
                    
            //  db uname & psw match
                
                String unameDB = "";
                String passDB = "";
                
                ResultSet rs = ps.executeQuery();
                
              //get whole DB uname & psw 
              while(rs.next()){
                  unameDB = rs.getString("cfname");
                  passDB = rs.getString("clpass");
                  
                  System.out.println("Database cfname ::: "+unameDB);
                  System.out.println("Database clpass :: "+passDB);
              }
                
              //add if else statment to check uname and pass
              
              if(stfname.equals(unameDB) && stpass.equals(passDB)){
                  System.out.println("inside IFF");
                  
                  RequestDispatcher rd = request.getRequestDispatcher("succlogin.jsp");
                  rd.forward(request, response);
                  
              }else{
                  System.out.println("INSIDE ELSEE");
                  
                  RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
                  rd.forward(request, response);
              }
                
                       
            }catch(Exception e){
               System.out.println("Error From Login part ::"+e.getMessage());
            }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
