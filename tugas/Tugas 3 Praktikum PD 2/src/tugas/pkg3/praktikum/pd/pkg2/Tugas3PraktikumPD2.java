package tugas.pkg3.praktikum.pd.pkg2;

public class Tugas3PraktikumPD2 {

    static class Node {
        int data;
        Node prev;
        Node next;
    }

    static Node Insert(Node NextNode, int data) {
        Node baru = new Node();
        baru.data = data;
        baru.next = NextNode;
        if (NextNode != null) {
            (NextNode).prev = baru;
        }
        NextNode = baru;
        return NextNode;
    }

    static void printList(Node start) {
        Node temp = start;
        System.out.println();
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    static Node bubbleSort(Node start) {
        int swapped, i;
        Node Baru;
        Node Lama = null;
 
        if (start == null) {
            return null;
        }

        do {
            swapped = 0;
            Baru = start;

            while (Baru.next != Lama) {
                if (Baru.data > Baru.next.data) {
                    int t = Baru.data;
                    Baru.data = Baru.next.data;
                    Baru.next.data = t;
                    swapped = 1;
                }
                Baru = Baru.next;
            }
            Lama = Baru;
        } while (swapped != 0);
        return start;
    }

    public static void main(String[] args) {

        int arr[] = {10, 30, 50, 70, 90, 20, 40, 60, 80, 100};
        int list_size, i;

        Node start = null;
 
        for (i = 0; i < arr.length; i++) {
            start = Insert(start, arr[i]);
        }
 
        System.out.printf("\nLinked list before sorting ");
        printList(start);

        start = bubbleSort(start);

        System.out.printf("\nLinked list after Bubble Sorting ");
        printList(start);

    }

}
