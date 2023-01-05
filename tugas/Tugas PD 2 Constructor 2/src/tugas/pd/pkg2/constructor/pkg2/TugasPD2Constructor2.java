package tugas.pd.pkg2.constructor.pkg2;

import java.util.Scanner;

public class TugasPD2Constructor2 {

    double panjang;
    double lebar;
    double tinggi;

    public TugasPD2Constructor2(double p, double l, double t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    double VolumeBalok() {
        return (panjang * lebar * tinggi);
    }

    double VolumePrismaSegitiga() {
        return ((panjang * lebar * tinggi) / 2);
    }

    double VolumeLimasSegiempat() {
        return ((panjang * lebar * tinggi) / 3);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double panjang2;
        double lebar2;
        double tinggi2;
        int pilihan;
        int jumlahdata;

        System.out.print("Masukkan Jumlah Data : ");
        jumlahdata = input.nextInt();

        TugasPD2Constructor2 show[] = new TugasPD2Constructor2[jumlahdata];

        System.out.println();
        System.out.println("Pilih Rumus : ");
        System.out.println("1. Rumus Volume Balok");
        System.out.println("2. Rumus Volume Prisma Segitiga");
        System.out.println("3. Rumus Volume Limas Segiempat");
        System.out.print("Pilihan Anda : ");
        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println();
                System.out.println("ANDA MEMILIH RUMUS VOLUME BALOK");
                for (int i = 0; i < show.length; i++) {
                    System.out.println();
                    System.out.print("Masukkan Panjang : ");
                    panjang2 = input.nextDouble();
                    System.out.print("Masukkan Lebar : ");
                    lebar2 = input.nextDouble();
                    System.out.print("Masukkan Tinggi : ");
                    tinggi2 = input.nextDouble();
                    show[i] = new TugasPD2Constructor2(panjang2, lebar2, tinggi2);
                    System.out.println("Volume Balok ke-" + (i + 1) + " : " + show[i].VolumeBalok());
                }
                break;
            case 2:
                System.out.println();
                System.out.println("ANDA MEMILIH RUMUS VOLUME PRISMA SEGITIGA");
                for (int i = 0; i < show.length; i++) {
                    System.out.println();
                    System.out.print("Masukkan Panjang : ");
                    panjang2 = input.nextDouble();
                    System.out.print("Masukkan Lebar : ");
                    lebar2 = input.nextDouble();
                    System.out.print("Masukkan Tinggi : ");
                    tinggi2 = input.nextDouble();
                    show[i] = new TugasPD2Constructor2(panjang2, lebar2, tinggi2);
                    System.out.println("Volume Prisma Segitiga ke-" + (i + 1) + " : " + show[i].VolumePrismaSegitiga());
                }
                break;
            case 3:
                System.out.println();
                System.out.println("ANDA MEMILIH RUMUS VOLUME LIMAS SEGIEMPAT");
                for (int i = 0; i < show.length; i++) {
                    System.out.println();
                    System.out.print("Masukkan Panjang : ");
                    panjang2 = input.nextDouble();
                    System.out.print("Masukkan Lebar : ");
                    lebar2 = input.nextDouble();
                    System.out.print("Masukkan Tinggi : ");
                    tinggi2 = input.nextDouble();
                    show[i] = new TugasPD2Constructor2(panjang2, lebar2, tinggi2);
                    System.out.println("Volume Limas Segiempat ke-" + (i + 1) + " : " + show[i].VolumeLimasSegiempat());
                }
                break;
        }
    }
}
