/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flightpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author navee
 */
class flight {
    Statement st;

    void addNewFlight(String pilot1Name, String pilot2Name, String aTime, String aDate, String aAir, String dTime, String dDate, String dAir, int SC, int ASC,int Price)
    {
               connectDb();
       String sql="INSERT INTO flights(pilot1,pilot2,arriTime,arriDate,arriAirport,depTime,depDate,depAir,SeatCount,avaiSeat,price) VALUES('"+pilot1Name+"','"+pilot2Name+"','"+aTime+"','"+aDate+"','"+aAir+"','"+dTime+"','"+dDate+"','"+dAir+"','"+SC+"','"+ASC+"','"+Price+"')";
        try {
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(flight.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        private void connectDb()
    {
        String url="jdbc:mysql://localhost:3306/testair";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,"root","");
            st=con.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(flight.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
