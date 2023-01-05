/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author MSI
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class oneksi {
    Connection con;
    Statement stm;
    
    public void config(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
//            String dbUr1 = "jdbc:mysql://localhost/login";
//            String username = "root";
//            String password = "";
            con=DriverManager.getConnection("jdbc:mysql://localhost/jadwal", "root", "");
            stm = con.createStatement();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "koneksi gagal" +e.getMessage());
        }
        
    }
}
