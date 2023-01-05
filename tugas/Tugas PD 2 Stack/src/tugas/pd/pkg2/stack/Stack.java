package tugas.pd.pkg2.stack;

public class Stack {

    static int[] stack;
    static int ukuran, top;

    void inisialisasi(int i) {
        ukuran = i;
        stack = new int[ukuran];
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
            System.out.println("Stack Penuh");
        } else {
            System.out.println("Nilai " + i + " Sudah Dimasukkan");
            stack[top++] = i;
        }
    }

    void pop() {
        if (isEmpty()) {
            System.out.println("Stack Masih Kosong");
        } else {
            top--;
            System.out.println("Nilai " + stack[top] + " Keluar Dari Stack");
        }
    }

    void find(int i) {
        boolean hasil = false;
        int temp = 0;
        while (temp < top) {
            if (i == stack[temp]) {
                hasil = true;
                break;
            }
            temp++;
        }
        if (hasil) {
            System.out.println("Nilai Ditemukan");
        } else {
            System.out.println("Nilai Tidak Ditemukan");
        }
    }

    void display() {
        int i = top - 1;
        while (i >= 0) {
            System.out.println("Nilai Stack Ke-" + (i + 1) + " Adalah " + stack[i]);
            i--;
        }
    }

}
