package tugas.pd.pkg2.linkedlist;

import java.util.Scanner;

public class TugasPD2LinkedList {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        Scanner scanku = new Scanner(System.in);
        int pilihan;
        boolean ulang = true;

        while (ulang) {
            System.out.println();
            System.out.println("Menu Pilihan");
            System.out.println("1. Masukkan Jumlah Data");
            System.out.println("2. Menyisipkan Data");
            System.out.println("3. Menghapus Data");
            System.out.println("4. Temukan Data");
            System.out.println("5. Tampilkan Data");
            System.out.println("6. Keluar");
            System.out.print("Pilihan Anda : ");
            pilihan = scanku.nextInt();
            System.out.println();

            switch (pilihan) {
                case 1:
                    System.out.print("Jumlah Data Yang Ingin Dimasukkan : ");
                    int nomor = scanku.nextInt();
                    System.out.println();

                    for (int i = 0; i < nomor; i++) {
                        System.out.print((i + 1) + " : ");
                        Node xxx = new Node();
                        int data = scanku.nextInt();
                        xxx.dataInt = data;
                        list.insert(xxx, (i + 1));
                    }
                    break;
                case 2:
                    System.out.println("\nMenyisipkan Data");
                    System.out.print("Data Yang Ingin Disisipkan : ");
                    int datas = scanku.nextInt();
                    System.out.print("Posisi Nomor Yang Akan Disisipkan : ");
                    int n = scanku.nextInt();
                    Node newNode = new Node();
                    newNode.dataInt = datas;
                    list.insert(newNode, n);
                    System.out.println("\nLinked List Data Baru Setelah Disisipkan : ");
                    list.printLinkedList();
                    break;
                case 3:
                    System.out.println("\nMenghapus Data");
                    System.out.println("Posisi Nomor Yang Akan Dihapus : ");
                    n = scanku.nextInt();
                    list.remove(n);
                    System.out.println("Linked List Setelah Data Dihapus : ");
                    list.printLinkedList();
                    break;
                case 4:
                    System.out.println("\nTemukan Data");
                    System.out.println("Data Yang Ingin Ditemukan : ");
                    int datax = scanku.nextInt();
                    list.find(datax);
                    break;
                case 5:
                    list.printLinkedList();
                    break;
                case 6:
                    ulang = false;
                    break;
            }
        }

    }

}
