package tugas.pd.pkg2.doublelinkedlist;

public class DoubleLinkedList {

    Node awal;
    Node akhir;

    public DoubleLinkedList() {
        awal = null;
        akhir = null;
    }

    public boolean isEmpty() {
        return (awal == null);
    }

    public void insertawal(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            akhir = node;
        } else {
            awal.prev = node;
        }
        node.next = awal;
        awal = node;
    }

    public void insertakhir(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            awal = node;
        } else {
            akhir.next = node;
            node.prev = akhir;
        }
        akhir = node;
    }

    public Node deleteawal() {
        Node temp = awal;
        if (awal.next == null) {
            akhir = null;
        } else {
            awal.next.prev = null;
        }
        awal = awal.next;
        return temp;
    }

    public Node deleteakhir() {
        Node temp = akhir;
        if (awal.next == null) {
            awal = null;
        } else {
            akhir.prev.next = null;
        }
        akhir = akhir.prev;
        return temp;
    }

    public boolean insertafter(int key, int data) {
        Node current = awal;
        while (current.data != key) {
            current = current.next;
            if (current == null) {
                return false;
            }
        }
        Node node = new Node(data);

        if (current == akhir) {
            node.next = null;
            akhir = node;
        } else {
            node.next = current.next;
            current.next.prev = node;
        }
        node.prev = current;
        current.next = node;
        return true;
    }

    public Node deleteKey(int key) {
        Node current = awal;
        while (current.data != key) {
            current = current.next;

            if (current == null) {
                return null;
            }
        }
        if (current == awal) {
            awal = current.next;
        } else {
            current.prev.next = current.next;
        }
        if (current == akhir) {
            akhir = current.prev;
        } else {
            current.next.prev = current.prev;
        }
        return current;
    }

    public void displayForward() {
        System.out.println("List Awal => Akhir : ");
        Node current = awal;

        while (current != null) {
            current.tampil();
            current = current.next;
        }
        System.out.println("");
    }

    public void displayBackward() {
        System.out.println("List Akhir => Awal : ");
        Node current = akhir;

        while (current != null) {
            current.tampil();
            current = current.prev;
        }
        System.out.println("");
    }

}
