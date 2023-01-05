package tugas.pd.pkg2.linkedlist;

public class LinkedList {

    private static Node node;

    static void insert(Node newNode, int n) {
        if (n == 1) {
            newNode.next = node;
            node = newNode;
        } else {
            Node copy = node;
            for (int i = 1; i < n - 1; i++) {
                node = node.next;
            }
            newNode.next = node.next;
            node.next = newNode;
            node = copy;
        }
    }

    static void remove(int n) {
        if (n == 1) {
            node = node.next;
        } else {
            Node copy = node;
            for (int i = 1; i < n - 1; i++) {
                node = node.next;
            }
            node.next = node.next.next;
            node = copy;
        }
    }

    static void find(int data) {
        Node ketemu = null, copy = node;
        int counter = 1, i = 0;
        while (true) {
            try {
                if (node.dataInt == data) {
                    Node neo = new Node();
                    neo.dataInt = counter;
                    ketemu = insert(ketemu, neo, i + 1);
                    i++;
                }
                node = node.next;
                counter++;
            } catch (NullPointerException accept) {
                break;
            }
        }
        node = copy;
        foundInfo(ketemu);
    }

    static void printLinkedList() {
        Node copy = node;
        while (true) {
            try {
                System.out.println(node.dataInt + "-");
                node = node.next;
            } catch (NullPointerException accept) {
                System.out.println(", . .");
                break;
            }
        }
        node = copy;
    }

    private static void foundInfo(Node current) {
        if (current == null) {
            System.out.println("Data Tidak Ditemukan");
        } else {
            System.out.println("Temukan data Nomor ke :");
            while (true) {
                try {
                    System.out.println(current.dataInt + ", ");
                    current = current.next;
                } catch (NullPointerException accept) {
                    System.out.println("............");
                    break;
                }
            }
        }
    }

    private static Node insert(Node node, Node newNode, int n) {
        if (n == 1) {
            newNode.next = node;
            node = newNode;
        } else {
            Node copy = node;
            for (int i = 1; i < n - 1; i++) {
                node = node.next;
            }
            newNode.next = node.next;
            node.next = newNode;
            node = copy;
        }
        return node;
    }

}
