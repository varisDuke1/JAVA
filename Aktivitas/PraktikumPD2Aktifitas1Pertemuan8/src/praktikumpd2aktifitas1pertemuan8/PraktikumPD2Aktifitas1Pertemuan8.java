package praktikumpd2aktifitas1pertemuan8;

import java.util.Scanner;
import java.sql.*;

public class PraktikumPD2Aktifitas1Pertemuan8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        String masukkan, id1, nama1, score1;
        boolean ulang = true;
        String array[];
        array = new String[10];

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/praktikum", "root", "");

            Statement stmt = conn.createStatement();
            String sqlinsert, sqlupdate1, sqlupdate2, sqldelete, sqlselect;

            do {
                System.out.println();
                System.out.println("MENU DATABASE");
                System.out.println("1. INSERT");
                System.out.println("2. UPDATE");
                System.out.println("3. DELETE");
                System.out.println("4. SELECT");
                System.out.println("5. Exit");
                System.out.println();
                System.out.print("Pilihan Anda : ");
                pilihan = input.nextInt();
                switch (pilihan) {
                    case 1:
                        System.out.println("INSERT MENU");
                        System.out.print("Masukkan ID : ");
                        id1 = input.next();
                        System.out.print("Masukkan Nama : ");
                        nama1 = input.next();
                        System.out.print("Masukkan Score : ");
                        score1 = input.next();
                        sqlinsert = "INSERT INTO person(id, name, score) VALUES (" + id1 + ", \"" + nama1 + "\", " + score1 + ")";
                        array[0] = sqlinsert;
                        stmt.executeUpdate(array[0]);
                        break;
                    case 2:
                        System.out.println("UPDATE MENU");
                        System.out.println("1. Update Nama");
                        System.out.println("2. Update Score");
                        System.out.print("Pilihan Anda : ");
                        pilihan = input.nextInt();
                        switch (pilihan) {
                            case 1:
                                System.out.print("Pilih ID : ");
                                id1 = input.next();
                                System.out.print("Masukkan Nama Baru : ");
                                nama1 = input.next();
                                sqlupdate1 = "UPDATE person SET name=\"" + nama1 + "\" WHERE id=" + id1;
                                array[1] = sqlupdate1;
                                stmt.executeUpdate(sqlupdate1);
                                break;
                            case 2:
                                System.out.print("Pilih ID : ");
                                id1 = input.next();
                                System.out.print("Masukkan Score Baru : ");
                                score1 = input.next();
                                sqlupdate2 = "UPDATE person SET score=" + score1 + " WHERE id=" + id1;
                                array[2] = sqlupdate2;
                                stmt.executeUpdate(sqlupdate2);
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("DELETE MENU");
                        System.out.print("Pilih ID : ");
                        id1 = input.next();
                        sqldelete = "DELETE FROM person WHERE id=" + id1;
                        array[3] = sqldelete;
                        stmt.executeUpdate(sqldelete);
                        break;
                    case 4:
                        System.out.println("SELECT MENU");
                        sqlselect = "SELECT id, name, score FROM person order by score";
                        array[4] = sqlselect;
                        ResultSet rs = stmt.executeQuery(sqlselect);
                        while (rs.next()) {
                            int id = rs.getInt("id");
                            String name = rs.getString("name");
                            int score = rs.getInt("score");
                            System.out.println(id + "\t" + name + "\t" + score);
                        }
                        break;
                    case 5:
                        ulang = false;
                        break;
                }
            } while (ulang);
        } catch (Exception e) {
            System.out.println("failed");
        }

    }

}
