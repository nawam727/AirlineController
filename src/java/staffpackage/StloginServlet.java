package staffpackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class StloginServlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
         
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            PrintWriter out = response.getWriter();
            
            //request parameters from jsp to here   
            String stfname = request.getParameter("suname");
            String stpass = request.getParameter("supass");
            
            //create connection to db
            try{
                Connection con;
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","");
                System.out.println("Connected Login Part"); // connected
                String sql = "select * from testair.staff where stfname=? and stpass=?";
                PreparedStatement ps = con.prepareStatement(sql);//will run query
                ps.setString(1, stfname);      
                ps.setString(2, stpass);
                    
            //  db uname & psw match
                
                String unameDB = "";
                String passDB = "";
                
                ResultSet rs = ps.executeQuery();
                
              //get whole DB uname & psw 
              while(rs.next()){
                  unameDB = rs.getString("stfname");
                  passDB = rs.getString("stpass");
                  
                  System.out.println("Database stfname ::: "+unameDB);
                  System.out.println("Database stpass :: "+passDB);
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

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
