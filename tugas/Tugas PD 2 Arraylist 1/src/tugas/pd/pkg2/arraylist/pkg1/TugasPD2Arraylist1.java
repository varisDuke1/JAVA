package tugas.pd.pkg2.arraylist.pkg1;

import java.util.ArrayList;
import java.util.Scanner;

public class TugasPD2Arraylist1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahdata;
        String nrplokal;
        String namalokal;
        String alamatlokal;
        
        System.out.print("Masukkan Jumlah Data Mahasiswa : ");
        jumlahdata = input.nextInt();
        
        ArrayList<DataMahasiswa> listMahasiswa = new ArrayList<DataMahasiswa>();
        
        for (int i = 0; i < jumlahdata; i++) {
            System.out.print("Masukkan NRP Mahasiswa : ");
            nrplokal = input.next();
            System.out.print("Masukkan Nama Mahasiswa : ");
            namalokal = input.next();
            System.out.print("Masukkan Alamat Mahasiswa : ");
            alamatlokal = input.next();
            System.out.println();
            listMahasiswa.add(new DataMahasiswa(nrplokal, namalokal, alamatlokal));
        }
        
        for (DataMahasiswa mhs : listMahasiswa) {
            System.out.println(mhs);
        }
    }

}

class DataMahasiswa {

    public String nrp;
    public String nama;
    public String alamat;

    public DataMahasiswa(String nrp, String nama, String alamat) {
        this.nrp = nrp;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String toString() {
        return "NRP : " + this.nrp + ", Nama : " + this.nama + ", Alamat : " + this.alamat;
    }
}
