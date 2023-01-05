package tugas.pkg4.praktikum.pd.pkg2.stack;

import java.util.Scanner;

public class Tugas4PraktikumPD2Stack {

    public static void main(String[] args) {

        Stack a = new Stack();
        Scanner input = new Scanner(System.in);
        boolean ulang = true;
        int pilihan;
        int masukkan;
        while (ulang) {
            System.out.println();
            System.out.println("Pilihan Menu");
            System.out.println("1. Inisialisasi Ukuran Stack");
            System.out.println("2. Masukkan Data");
            System.out.println("3. Keluarkan Data");
            System.out.println("4. Cari Data");
            System.out.println("5. Tampilkan Data");
            System.out.println("6. Keluar");
            System.out.print("Pilihan Anda : ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Ukuran Stack : ");
                    masukkan = input.nextInt();
                    a.inisialisasi(masukkan);
                    System.out.println("Ukuran Stack Adalah " + masukkan);
                    break;
                case 2:
                    System.out.print("Masukkan Data : ");
                    masukkan = input.nextInt();
                    a.push(masukkan);
                    break;
                case 3:
                    a.pop();
                    break;
                case 4:
                    System.out.print("Cari Data : ");
                    masukkan = input.nextInt();
                    a.find(masukkan);
                    break;
                case 5:
                    a.display();
                    break;
                case 6:
                    ulang = false;
                    break;
            }
        }

    }

}
