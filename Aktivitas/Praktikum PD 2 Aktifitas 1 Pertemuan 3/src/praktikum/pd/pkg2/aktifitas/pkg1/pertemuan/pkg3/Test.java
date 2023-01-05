package praktikum.pd.pkg2.aktifitas.pkg1.pertemuan.pkg3;

import java.util.Scanner;
import java.util.*;

public class Test {

    public static void main(String Args[]) {
        Scanner input = new Scanner(System.in);
        int pilihan1;
        int pilihan2;
        int masukkan;
        boolean ulang = true;

        LinkedList a = new LinkedList();
        a.print();
        a.insert(new LinkedListNode(5));
        a.insert(new LinkedListNode(4));
        a.insert(new LinkedListNode(7));
        a.insert(new LinkedListNode(6));
        a.print();
        //a.delete(a.head);
        //a.print();
        //a.delete(a.tail.prev);
        //a.print();
        //a.delete(a.tail);
        //a.print();
        //a.delete(a.head);
        //a.print();
        while (ulang == true) {
            System.out.println();
            System.out.println("INTERFACE");
            System.out.println("1. Tampilkan Data");
            System.out.println("2. Search Data");
            System.out.println("3. Insert Data");
            System.out.println("4. Delete Data");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda : ");
            pilihan1 = input.nextInt();

            switch (pilihan1) {
                case 1:
                    a.print();
                    break;
                case 2:
                    System.out.print("Masukkan data yang ingin dicari : ");
                    int cari = input.nextInt();
                    a.search(cari);
                    break;
                case 3:
                    System.out.print("Masukkan Data : ");
                    masukkan = input.nextInt();
                    a.insert(new LinkedListNode(masukkan));
                    break;
                case 4:
                    System.out.println("DELETE");
                    System.out.println("1. Delete dari depan");
                    System.out.println("2. Delete dari belakang");
                    System.out.println("3. Delete Semua");
                    System.out.print("Pilihan Anda : ");
                    pilihan2 = input.nextInt();
                    switch (pilihan2) {
                        case 1:
                            a.delete(a.head);
                            break;
                        case 2:
                            a.delete(a.tail);
                            break;
                    }
                    break;
                case 5:
                    ulang = false;
                    break;
            }
        }

    }
}
