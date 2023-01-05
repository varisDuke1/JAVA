package tugas.pd.pkg2.constructor.pkg1;

import java.util.Scanner;

public class TugasPD2Constructor1 {

    String nrp;
    String nama;
    String alamat;
    char jk;

    public TugasPD2Constructor1(String data1, String data2, String data3, char data4) {
        nrp = data1;
        nama = data2;
        alamat = data3;
        jk = data4;
    }

    void Output() {
        System.out.println("NRP Mahasiswa : " + nrp);
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Alamat Mahasiswa : " + alamat);
        System.out.println("JK Mahasiswa : " + jk);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nrplokal;
        String namalokal;
        String alamatlokal;
        char jklokal;
        int jumlahdata;

        System.out.print("Masukkan Jumlah Data Mahasiswa : ");
        jumlahdata = input.nextInt();

        TugasPD2Constructor1 show[] = new TugasPD2Constructor1[jumlahdata];

        for (int i = 0; i < show.length; i++) {
            System.out.println();
            System.out.print("Masukkan NRP Mahasiswa : ");
            nrplokal = input.next();
            System.out.print("Masukkan Nama Mahasiswa : ");
            namalokal = input.next();
            System.out.print("Masukkan Alamat Mahasiswa : ");
            alamatlokal = input.next();
            System.out.print("Masukkan JK Mahasiswa (L/P) : ");
            jklokal = input.next().charAt(0);
            show[i] = new TugasPD2Constructor1(nrplokal, namalokal, alamatlokal, jklokal);
        }

        System.out.println();
        System.out.println("DATA MAHASISWA");
        for (int i = 0; i < show.length; i++) {
            System.out.println();
            System.out.println("Mahasiswa ke-" + (i + 1));
            show[i].Output();
        }

    }

}
