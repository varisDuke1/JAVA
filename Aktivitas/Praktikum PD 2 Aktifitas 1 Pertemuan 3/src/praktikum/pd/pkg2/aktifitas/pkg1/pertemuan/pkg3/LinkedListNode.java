package praktikum.pd.pkg2.aktifitas.pkg1.pertemuan.pkg3;
import java.util.LinkedList;

public class LinkedListNode {
    
    LinkedListNode next;
    LinkedListNode prev;
    int data;
    
    LinkedListNode(int new_data) {
        
        this.data = new_data;
        this.prev = null;
        this.next = null;
        
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
