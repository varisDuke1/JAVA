package tugas.pd.pkg2.queue;

public class Queue {
    static int[] queue;
    static int ukuran, top;
    
    void inisialisasi(int i) {
        ukuran = i;
        queue = new int[ukuran];
        top = 0;
    }
    
    boolean isEmpty() {
        return top <= 0;
    }
    
    boolean isFull() {
        return top >= ukuran;
    }
    
    void push(int i) {
        if (isFull()) {
            System.out.println("Queue Penuh");
        } else {
            System.out.println("Nilai " + i + " Sudah Masuk Queue");
            queue[top++] = i;
        }
    }
    
    void pop() {
        if (isEmpty()) {
            System.out.println("Queue Masih Kosong");
        } else {
            int pop = queue[0];
            int i = 1;
            System.out.println("Nilai " + pop + " Keluar Dari Queue");
            while(i < top) {
                queue[i-1] = queue[i];
                i++;
            }
            top--;
        }
    }
    
    void find(int i) {
        boolean hasil = false;
        int temp = 0;
        while(temp<top) {
            if (i == queue[temp]) {
                hasil = true;
                break;
            }
            temp++;
        }
        if (hasil) {
            System.out.println("Nilai " + i + " Ditemukan di Queue Ke-" + (temp+1));
        } else {
            System.out.println("Nilai Tidak Ditemukan");
        }
    }
    
    void display() {
        System.out.println("Isi Queue");
        int i = 0;
        while(i < top) {
            System.out.println("Queue ke-" + (i+1) + " Adalah " + queue[i]);
            i++;
        }
    }
}
