package praktikum.pd.pkg2.aktifitas.pkg2.pertemuan.pkg2;
import java.util.Hashtable;

public class PraktikumPD2Aktifitas2Pertemuan2 {

    public static void main(String[] args) {
        
        Hashtable<String, String> urutan = new Hashtable<String, String>();
        urutan.put("A1", "Nasi Goreng");
        urutan.put("A2", "Mie Ayam");
        urutan.put("A3", "Es Teler");
        urutan.put("A4", "Es Teh");
        urutan.put("A5", "Es Campur");
        urutan.put("A6", "Lalapan");
        urutan.put("A7", "Tahu Campur");
        urutan.put("A8", "Nasi Pecel");
        
        System.out.println(urutan);
        
        System.out.println("Nilai dari Kunci 'A4' : " + urutan.get("A4"));
        System.out.println("Apakah Hashtable kosong? " + urutan.isEmpty());
        urutan.remove("A3");
        urutan.remove("A5");
        System.out.println(urutan);
        System.out.println("Ukuran Hashtable : " + urutan.size());
        
    }
    
}
