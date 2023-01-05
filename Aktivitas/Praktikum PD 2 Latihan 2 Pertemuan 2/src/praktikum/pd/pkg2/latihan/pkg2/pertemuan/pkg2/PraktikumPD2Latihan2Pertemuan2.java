package praktikum.pd.pkg2.latihan.pkg2.pertemuan.pkg2;
import java.util.Enumeration;
import java.util.Hashtable;

public class PraktikumPD2Latihan2Pertemuan2 {

    public static void main(String[] args) {
        
        Hashtable <String, String> matakuliah = new Hashtable<String, String>();
        matakuliah.put("MK1", "Pemrograman Dasar II");
        matakuliah.put("MK2", "Basis Data Lanjut");
        matakuliah.put("MK3", "Sistem Operasi");
        matakuliah.put("MK4", "Pengantar TI");
        matakuliah.put("MK5", "Kalkulus");
        
        System.out.println("Apakah Hashtable Kosong? " + matakuliah.isEmpty());
        System.out.println("Ukuran Awal : " + matakuliah.size());
        System.out.println(matakuliah);
        System.out.println();
        
        matakuliah.remove("MK5");
        System.out.println("Ukuran Akhir : " + matakuliah.size());
        System.out.println(matakuliah);
        
    }
    
}
