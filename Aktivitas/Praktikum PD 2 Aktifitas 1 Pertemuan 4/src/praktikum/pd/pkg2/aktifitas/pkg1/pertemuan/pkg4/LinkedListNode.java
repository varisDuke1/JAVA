package praktikum.pd.pkg2.aktifitas.pkg1.pertemuan.pkg4;

public class LinkedListNode {

    LinkedListNode next;
    LinkedListNode prev;
    int data;

    LinkedListNode(int new_data) {
        this.data = new_data;
        this.next = null;
        this.prev = null;
    }

    void set_prev(LinkedListNode other) {
        this.prev = other;
        if (other != null) {
            other.next = this;
        }
    }
    
    void set_next(LinkedListNode other) {
        this.next = other;
        if (other != null) {
            other.prev = this;
        }
    }
}
