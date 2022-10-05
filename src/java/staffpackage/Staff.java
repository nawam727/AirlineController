
package staffpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AMANTER
 */
class Staff {
    Statement stt;

    void addStaff(String nfname, String nlname, String nemail, String npass, String ndob, String npr, int nccode, int nmno) {
        connectoDB();
        String query = "INSERT INTO Staff(stfname,stlname,stemail,stpass,stdob,stpr,stccode,stmno) VALUES('"+nfname+"','"+nlname+"','"+nemail+"','"+npass+"','"+ndob+"','"+npr+"','"+nccode+"','"+nmno+"')";
        try {
            stt.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Staff.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void connectoDB() {
        String url="jdbc:mysql://localhost:3306/testair";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,"root","");
            stt = con.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Staff.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
