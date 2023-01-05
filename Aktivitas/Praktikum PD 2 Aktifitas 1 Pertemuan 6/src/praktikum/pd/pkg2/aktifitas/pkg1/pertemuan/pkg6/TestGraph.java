package praktikum.pd.pkg2.aktifitas.pkg1.pertemuan.pkg6;

import java.util.Scanner;

public class TestGraph {

    public static void main(String Args[]) {
        Scanner input = new Scanner(System.in);
        int pilihan, masukkan, inode1, inode2, idst;
        boolean ulang = true;
        Graph a = new Graph();
        GraphNode[] graph_node_list = {
            new GraphNode(0),
            new GraphNode(1),
            new GraphNode(2),
            new GraphNode(3),
            new GraphNode(4),};

        for (GraphNode graph_node : graph_node_list) {
            a.add_node(graph_node);
        }
        
        int[][] path_list = new int[4][4];;
        
        do {
            System.out.println("MENU UTAMA");
            System.out.println("1. Masukkan Path List");
            System.out.println("2. Print");
            System.out.println("3. Keluar");
            System.out.println();
            System.out.print("Pilihan Anda : ");
            pilihan = input.nextInt();
            System.out.println();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Jumlah Path : ");
                    masukkan = input.nextInt();
                    for (int i = 0; i < masukkan; i++) {
                        System.out.print("Masukkan First Node : ");
                        inode1 = input.nextInt();
                        path_list[i][0] = inode1;
                        System.out.print("Masukkan Second Node : ");
                        inode2 = input.nextInt();
                        path_list[i][1] = inode2;
                        System.out.print("Masukkan Distance : ");
                        idst = input.nextInt();
                        path_list[i][2] = idst;
                    }
                    
                    for (int[] path : path_list) {
                        GraphNode first_node = graph_node_list[path[0]];
                        GraphNode second_node = graph_node_list[path[1]];
                        double distance = path[2];
                        a.add_edge(new GraphEdge(first_node, second_node,
                                distance));
                        a.add_edge(new GraphEdge(second_node, first_node,
                                distance));
                    }
                    break;
                case 2:
                    System.out.println("PRINT");
                    a.to_tree(0).print();
                    break;
                case 3:
                    ulang = false;
                    break;
            }
        } while (ulang);
    }
}
