package praktikum.pd.pkg2.aktifitas.pkg1.pertemuan.pkg3;

public class LinkedList {

    LinkedListNode head;
    LinkedListNode tail;

    LinkedList() {

        this.head = null;
        this.tail = null;

    }

    void print() {

        LinkedListNode current = head;
        while (current != null) {
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

    void insert(LinkedListNode new_node) {
        if (this.head == null) {
            this.head = new_node;
            this.tail = new_node;
        } else if (new_node.data <= this.head.data) {
            this.head.set_prev(new_node);
            this.head = new_node;
        } else if (new_node.data >= this.tail.data) {
            this.tail.set_next(new_node);
            this.tail = new_node;
        } else {
            LinkedListNode position = head;
            while (position.data < new_node.data) {
                position = position.next;
            }
            LinkedListNode previous_position = position.prev;
            new_node.set_prev(previous_position);
            new_node.set_next(position);
        }
    }

    LinkedListNode find_node_by_data(int data) {
        LinkedListNode current = this.head;
        while (current != null) {
            if (current.data == data) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    void delete(LinkedListNode deleted) {
        if (deleted != null && this.head != null) {
            if (this.head == this.tail && deleted == this.head) {
                this.head = null;
                this.tail = null;
            } else if (deleted == this.head) {
                LinkedListNode new_head = this.head.next;
                this.head.set_next(null);
                new_head.set_prev(null);
                this.head = new_head;
            } else if (deleted == this.tail) {
                LinkedListNode new_tail = this.tail.prev;
                this.tail.set_prev(null);
                new_tail.set_next(null);
                this.tail = new_tail;
            } else {
                LinkedListNode deleted_prev = deleted.prev;
                LinkedListNode deleted_next = deleted.next;
                deleted.set_prev(null);
                deleted.set_next(null);
                deleted_prev.set_next(deleted_next);
            }
        }
    }

    public void search(int key) {

        int i = 0;
        boolean ketemu = false;
        LinkedListNode temp = head;
        while (temp != null) {
            if (temp.data == key) {
                ketemu = true;
                break;
            }
            i++;
            temp = temp.next;
        }
        if (ketemu) {
            System.out.println(key + " ditemukan pada index " + i);
        } else {
            System.out.println("Data tidak ditemukan");
        }

    }


}
