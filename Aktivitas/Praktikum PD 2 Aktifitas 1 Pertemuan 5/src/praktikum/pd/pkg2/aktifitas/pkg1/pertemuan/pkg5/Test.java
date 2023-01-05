package praktikum.pd.pkg2.aktifitas.pkg1.pertemuan.pkg5;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();
        Scanner input = new Scanner(System.in);
        int pilihan;
        int masukkan;
        int jumlahdata;
        boolean ulang = true;

        do {
            System.out.println();
            System.out.println("MENU PILIHAN");
            System.out.println("1. Push Data");
            System.out.println("2. Delete Data");
            System.out.println("3. Print Data");
            System.out.println("4. Tampilkan Tree (Infix)");
            System.out.println("5. Tampilkan Tree (Prefix)");
            System.out.println("6. Tampilkan Tree (Postfix)");
            System.out.println("7. Search Data");
            System.out.println("8. Cari Minimum");
            System.out.println("9. Cari Maksimum");
            System.out.println("10. Keluar");
            System.out.println();

            System.out.print("Pilihan Anda : ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Jumlah Data Yang Dimasukkan : ");
                    jumlahdata = input.nextInt();

                    for (int i = 1; i <= jumlahdata; i++) {
                        System.out.println();
                        System.out.print("Masukkan Data : ");
                        masukkan = input.nextInt();
                        bt.push(new BinaryTreeNode(masukkan));
                        System.out.println("Data " + masukkan + " Berhasil Dimasukkan");
                    }
                    break;
                case 2:
                    System.out.println();
                    System.out.println("MENU DELETE");
                    System.out.println("1. Delete a Node With No Child");
                    System.out.println("2. Delete a Node With a Single Child");
                    System.out.println("3. Delete Root");
                    System.out.println();
                    System.out.print("Pilihan Anda : ");
                    pilihan = input.nextInt();

                    switch (pilihan) {
                        case 1:
                            BinaryTreeNode deleted = bt.root.most_left_child();
                            System.out.println(deleted.data);
                            bt.delete(deleted);
                            bt.print();
                            break;
                        case 2:
                            deleted = bt.root.most_right_child().parent;
                            System.out.println(deleted.data);
                            System.out.println(deleted.only_has_right());
                            System.out.println(deleted.only_has_left());
                            bt.delete(deleted);
                            bt.print();
                            break;
                        case 3:
                            deleted = bt.root;
                            System.out.println(deleted.data);
                            bt.delete(deleted);
                            bt.print();
                            break;
                    }
                    break;
                case 3:
                    bt.print();
                    break;
                case 4:
                    bt.infix();
                    break;
                case 5:
                    bt.prefix();
                    break;
                case 6:
                    bt.postfix();
                    break;
                case 7:
                    System.out.print("Cari Data : ");
                    masukkan = input.nextInt();
                    bt.search(masukkan);
                    break;
                case 8:
                    bt.findmin();
                    break;
                case 9:
                    bt.findmax();
                    break;
                case 10:
                    ulang = false;
                    break;
            }
        } while (ulang);
    }

}
