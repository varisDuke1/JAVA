
package MyPrj;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class koneksi {
    Connection con;
    Statement stm;
    
    public void config(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String dbUrl = "jdbc:mysql://localhost/login";
            String username = "root";
            String pw = "";
            con = DriverManager.getConnection(dbUrl, username, pw);
            stm = con.createStatement();
            JPanel panel = new JPanel( new BorderLayout());
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "koneksi gagal "+e.getMessage());
        }
    }
}
