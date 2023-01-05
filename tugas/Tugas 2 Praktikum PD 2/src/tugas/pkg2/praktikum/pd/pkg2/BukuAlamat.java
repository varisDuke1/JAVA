package tugas.pkg2.praktikum.pd.pkg2;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Collections;
import java.util.List;

public class BukuAlamat {

    static Hashtable<String, String> alamat = new Hashtable<String, String>();

    public static void pengecekan() {

        System.out.print("Apakah Hashtable kosong? " + alamat.isEmpty());

    }

    public static void penghapusan() {

        alamat.remove("Alamat A");
        alamat.remove("Alamat J");

    }

    public static void output() {

        List<String> urutan = new ArrayList<String>(alamat.keySet());
        Collections.sort(urutan);
        
        for (String i : urutan) {
            System.out.println(i + " " + alamat.get(i));
        }

    }

    public static void main(String[] args) {

        alamat.put("Alamat A", "Blimbing");
        alamat.put("Alamat B", "Batu");
        alamat.put("Alamat C", "Dampit");
        alamat.put("Alamat D", "Donomulyo");
        alamat.put("Alamat E", "Gedangan");
        alamat.put("Alamat F", "Karangploso");
        alamat.put("Alamat G", "Kepanjen");
        alamat.put("Alamat H", "Lawang");
        alamat.put("Alamat I", "Singosari");
        alamat.put("Alamat J", "Turen");
        
        System.out.println("PENGECEKAN");
        pengecekan();
        System.out.println();
        
        System.out.println("DATA AWAL");
        output();
        System.out.println();
        
        System.out.println("DATA AKHIR");
        penghapusan();
        output();

    }

}
