package praktikum.pd.pkg2.latihan.pkg1.pertemuan.pkg2;

import java.util.ArrayList;
import java.util.Iterator;

public class PraktikumPD2Latihan1Pertemuan2 {

    ArrayList<String> data = new ArrayList<String>();
    String nama;
    String nrp;
    String alamat;

    PraktikumPD2Latihan1Pertemuan2(String name, String code, String adress) {
        
        nama = name;
        nrp = code;
        alamat = adress;
        data.add(nama + "\n" + nrp + "\n" + alamat);
        
    }
    
    void datamahasiswa() {
        
        //System.out.println("Sebelum Perubahan : ");
        for (String i : data) {
            System.out.println(i);
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        
        PraktikumPD2Latihan1Pertemuan2 mhs1, mhs2, mhs3, mhs4, mhs5;
        mhs1 = new PraktikumPD2Latihan1Pertemuan2("Reginald", "001", "Malang");
        mhs2 = new PraktikumPD2Latihan1Pertemuan2("Caesaro", "002", "Batu");
        mhs3 = new PraktikumPD2Latihan1Pertemuan2("Elizabeth", "003", "Jakarta");
        mhs4 = new PraktikumPD2Latihan1Pertemuan2("Vellisyo", "004", "Surabaya");
        mhs5 = new PraktikumPD2Latihan1Pertemuan2("Charlotte", "005", "Bandung");
        mhs1.datamahasiswa();
        mhs2.datamahasiswa();
        mhs3.datamahasiswa();
        mhs4.datamahasiswa();
        mhs5.datamahasiswa();
        //ArrayList<String> data = new ArrayList<String>();
        //data.add("Nama : Reginald" + "\n" + "NRP : 001" + "\n" + "Alamat : Malang");
        //data.add("Nama : Caesaro" + "\n" + "NRP : 002" + "\n" + "Alamat : Blitar");
        //data.add("Nama : Elizabeth" + "\n" + "NRP : 003" + "\n" + "Alamat : Jakarta");
        //data.add("Nama : Vellisyo" + "\n" + "NRP : 004" + "\n" + "Alamat : Surabaya");
        //data.add("Nama : Charlotte" + "\n" + "NRP : 005" + "\n" + "Alamat : Bandung");

        //System.out.println("Sebelum Perubahan : ");
        //for (String i : data) {
            //System.out.println(i);
            //System.out.println();
        //}

        //data.remove(4);
        //Iterator itr = data.iterator();
        //System.out.println("Sesudah Perubahan");
        //while (itr.hasNext()) {
            //System.out.println(itr.next());
            //System.out.println();
        //}

    }

}
