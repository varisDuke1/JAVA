package praktikum.pd.pkg2.aktifitas.pkg1.pertemuan.pkg4;

import java.util.Scanner;

public class Test {

    public static void main(String Args[]) {

        LinkedList a = new LinkedList();
        Scanner input = new Scanner(System.in);
        int pilihan;
        int masukkan;
        boolean ulang = true;

        a.print();
        System.out.println(a.qpop());
        System.out.println(a.spop());
        a.push(new LinkedListNode(5));
        a.push(new LinkedListNode(4));
        a.print();
        System.out.println(a.spop().data);
        a.push(new LinkedListNode(4));
        System.out.println(a.qpop().data);
        a.print();
        while (ulang == true) {
            System.out.println();
            System.out.println("Pilihan Menu");
            System.out.println("1. Masukkan Data");
            System.out.println("2. Hapus Data dengan Cara Queue");
            System.out.println("3. Hapus Data dengan Cara Stack");
            System.out.println("4. Tampilkan Data");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda : ");
            pilihan = input.nextInt();
            System.out.println();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Data : ");
                    masukkan = input.nextInt();
                    a.push(new LinkedListNode(masukkan));
                    System.out.println("Data Berhasil Dimasukkan");
                    break;
                case 2:
                    if (a.head == null) {
                        System.out.println("Data Masih Kosong");
                        break;
                    } else {
                        a.qpop();
                        System.out.println("Data Berhasil Dihapus");
                        break;
                    }
                case 3:
                    if (a.tail == null) {
                        System.out.println("Data Masih Kosong");
                        break;
                    } else {
                        a.spop();
                        System.out.println("Data Berhasil Dihapus");
                        break;
                    }
                case 4:
                    if (a.head == null) {
                        System.out.println("Data Masih Kosong");
                        break;
                    } else {
                        System.out.print("Data : ");
                        a.print();
                        break;
                    }
                case 5:
                    ulang = false;
                    break;
            }
        }
    }
}
