package tugas.pkg3.praktikum.pd.pkg2.pkg2;

public class Tugas3PraktikumPD22 {

    static class Node {

        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    Node head;

    void addNode(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        Node newNode = new Node(data);
        current.next = newNode;
    }

    void printList(Node n) {
        while (n != null) {
            System.out.print(n.data);
            System.out.print(" ");
            n = n.next;
        }
    }

    Node PartisiAkhir(Node awal, Node akhir) {
        if (awal == akhir
                || awal == null || akhir == null) {
            return awal;
        }

        Node pivot_prev = awal;
        Node current = awal;
        int pivot = akhir.data;

        while (awal != akhir) {
            if (awal.data < pivot) {
                pivot_prev = current;
                int temp = current.data;
                current.data = awal.data;
                awal.data = temp;
                current = current.next;
            }
            awal = awal.next;
        }

        int temp = current.data;
        current.data = pivot;
        akhir.data = temp;

        return pivot_prev;
    }

    void sort(Node awal, Node akhir) {
        if (awal == akhir) {
            return;
        }
        Node putar_prev = PartisiAkhir(awal, akhir);
        sort(awal, putar_prev);

        if (putar_prev != null
                && putar_prev == awal) {
            sort(putar_prev.next, akhir);
        } else if (putar_prev != null
                && putar_prev.next != null) {
            sort(putar_prev.next.next, akhir);
        }
    }

    public static void main(String[] args) {
        Tugas3PraktikumPD22 list = new Tugas3PraktikumPD22();
        list.addNode(20);
        list.addNode(40);
        list.addNode(60);
        list.addNode(80);
        list.addNode(100);
        list.addNode(10);
        list.addNode(30);
        list.addNode(50);
        list.addNode(70);
        list.addNode(90);

        Node n = list.head;
        while (n.next != null) {
            n = n.next;
        }

        System.out.println("Linked List before sorting");
        list.printList(list.head);

        list.sort(list.head, n);

        System.out.println("\nLinked List after Quick Sorting");
        list.printList(list.head);
    }

}
