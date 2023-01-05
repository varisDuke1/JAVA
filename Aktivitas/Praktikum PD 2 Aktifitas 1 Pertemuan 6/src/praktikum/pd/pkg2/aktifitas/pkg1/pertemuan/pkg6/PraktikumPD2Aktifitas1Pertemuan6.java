package praktikum.pd.pkg2.aktifitas.pkg1.pertemuan.pkg6;

import java.util.Scanner;

public class PraktikumPD2Aktifitas1Pertemuan6 {

    static Tree t = new Tree(new TreeNode(1));

    public static void main(String[] args) {

        t.root.add_child(new TreeNode(2), 1);
        t.root.add_child(new TreeNode(3), 1);
        t.root.add_child(new TreeNode(4), 2);
        t.root.children.get(0).add_child(new TreeNode(5), 1);
        t.root.children.get(2).add_child(new TreeNode(6), 1);
        t.root.children.get(2).add_child(new TreeNode(7), 2);
        t.print();

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println(" TREE INTERFACE ");
            System.out.println("1. Add child");
            System.out.println("2. Print");
            System.out.println("3. Exit");
            System.out.print("Enter your choice : ");
            int choice = input.nextInt();
            if (choice == 3) {
                break;
            } else {
                switch (choice) {
                    case 1:
                        System.out.println("1. Tambahkan child dari root");
                        System.out.println("2. Tambahkan child dari parent");
                        System.out.print("Pilihan Anda : ");
                        int choice_1 = input.nextInt();
                        switch (choice_1) {
                            case 1:
                                System.out.print("Masukkan new node untuk tree : ");
                                int treeNode = input.nextInt();
                                System.out.print("Masukkan distance dari root : ");
                                double distance = input.nextDouble();
                                t.root.add_child(new TreeNode(treeNode), distance);
                                break;
                            case 2:
                                if (t.root.children.size() == 0) {
                                    System.out.println("Tree masih tidak memiliki children!");
                                } else {
                                    System.out.print("Pilih parent index untuk new node : ");
                                    int parent = input.nextInt();
                                    System.out.print("Masukkan new node untuk tree : ");
                                    int tree_Node = input.nextInt();
                                    System.out.print("Masukkan distance dari root : ");
                                    double dist = input.nextDouble();
                                    t.root.children.get(parent).add_child(new TreeNode(tree_Node), dist);
                                }
                                break;
                        }
                        break;
                    case 2:
                        t.root.print();
                        break;
                }
            }
        }

    }

}
