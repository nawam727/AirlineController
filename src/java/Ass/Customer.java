
package Ass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

class Customer
{
    Statement st;
/*
    void addCus(String Fname, String Lname)        
    {
        String url="jdbc:mysql://localhost:3306/testair";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,"root","");
            st=con.createStatement();
            String sql="INSERT INTO client(cfname,clname) VALUES ('"+Fname+"','"+Lname+"')";
            st.executeUpdate(sql);
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
*/

    void addCus(String Fname, String Lname, String Email, String Pass, int t1, int t2, int vccno) 
    {
                String url="jdbc:mysql://localhost:3306/testair";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,"root","");
            st=con.createStatement();
            String sql="INSERT INTO client(cfname,clname,clemail,clpass,clt,cltt,clvno) VALUES ('"+Fname+"','"+Lname+"','"+Email+"','"+Pass+"','"+t1+"','"+t2+"','"+vccno+"')";
            st.executeUpdate(sql);
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    
}
