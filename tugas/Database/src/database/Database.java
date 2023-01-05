package database;

import java.sql.*;

public class Database {

    public static void main(String[] args) {
        
        String array[];
        array = new String[10];

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/praktikum", "root", "");

            Statement stmt = conn.createStatement();
            String sqlinsert = "INSERT INTO person(id, name, score) VALUES (1, \"Tono\", 20), (2, \"Toni\", 50), (3, \"Tini\", 80), (4, \"Tino\", 50)";
            array[0] = sqlinsert;
            stmt.executeUpdate(array[0]);

            String sqlupdate = "UPDATE person SET score=60, name=\"Tono Martono\" WHERE id=1";
            array[1] = sqlupdate;
            stmt.executeUpdate(array[1]);

            String sqldelete = "DELETE FROM person WHERE id=2";
            array[2] = sqldelete;
            stmt.executeUpdate(array[2]);

            String sqlselect = "SELECT id, name, score FROM person order by score";
            array[3] = sqlselect;
            ResultSet rs = stmt.executeQuery(array[3]);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int score = rs.getInt("score");
                System.out.println(id + "\t" + name + "\t" + score);
            }
        } catch (Exception e) {
            System.out.println("failed");
        }

    }

}
