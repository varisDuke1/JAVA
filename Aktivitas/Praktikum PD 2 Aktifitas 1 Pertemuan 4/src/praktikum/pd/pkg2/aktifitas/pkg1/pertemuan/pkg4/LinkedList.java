package praktikum.pd.pkg2.aktifitas.pkg1.pertemuan.pkg4;

public class LinkedList {
    
    LinkedListNode head;
    LinkedListNode tail;
    
    LinkedList() {
        this.head = null;
        this.tail = null;
    }
    
    void print() {
        LinkedListNode current = head;
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    void push(LinkedListNode new_node) {
        if (this.head == null) {
            this.head = new_node;
            this.tail = new_node;
        } else {
            this.tail.set_next(new_node);
            this.tail = new_node;
        }
    }
    
    LinkedListNode qpop() {
        LinkedListNode taken;
        if (this.head == null) {
            taken = null;
        } else if(this.head == this.tail) {
            taken = this.head;
            this.head = null;
            this.tail = null;
        } else {
            taken = this.head;
            this.head = this.head.next;
            this.head.prev = null;
            taken.next = null;
        }
        return taken;
    }
    
    LinkedListNode spop() {
        LinkedListNode taken;
        if (this.head == null) {
            taken = null;
        } else if(this.head == this.tail) {
            taken = this.tail;
            this.head = null;
            this.tail = null;
        } else {
            taken = this.tail;
            this.tail = this.tail.prev;
            this.tail.next = null;
            taken.next = null;
        }
        return taken;
    }
}
