package tugas.pd.pkg2.doublelinkedlist;
import java.util.Scanner;

public class TugasPD2DoubleLinkedList {

    public static void main(String[] args) {
        
        DoubleLinkedList list = new DoubleLinkedList();
        Scanner input = new Scanner(System.in);
        int pilihan, after1, after2, awal, akhir;
        boolean ulang = true;
        
        while(ulang) {
            System.out.println();
            System.out.println("Menu Pilihan");
            System.out.println("1. Insert Awal");
            System.out.println("2. Insert Akhir");
            System.out.println("3. Insert After");
            System.out.println("4. Delete Awal");
            System.out.println("5. Delete Akhir");
            System.out.println("6. Display Forward");
            System.out.println("7. Display Backward");
            System.out.println("8. Keluar");
            System.out.print("Pilihan Anda : ");
            pilihan = input.nextInt();
            System.out.println();
            
            switch(pilihan) {
                case 1:
                    System.out.print("Masukkan Nilai Awal : ");
                    awal = input.nextInt();
                    list.insertawal(awal);
                    System.out.println("Nilai Telah Dimasukkan di Awal");
                    break;
                case 2:
                    System.out.print("Masukkan Nilai Akhir : ");
                    akhir = input.nextInt();
                    list.insertakhir(akhir);
                    System.out.println("Nilai Telah Dimasukkan di Akhir");
                    break;
                case 3:
                    System.out.print("Masukkan Setelah Nilai : ");
                    after1 = input.nextInt();
                    System.out.print("Masukkan Nilai Yang Diinsert : ");
                    after2 = input.nextInt();
                    list.insertafter(after1, after2);
                    System.out.println("Nilai Telah Dimasukkan Setelah Nilai " + after1);
                    break;
                case 4:
                    list.deleteawal();
                    System.out.println("Nilai Awal Telah Dihapus");
                    break;
                case 5:
                    list.deleteakhir();
                    System.out.println("Nilai Akhir Telah Dihapus");
                    break;
                case 6:
                    System.out.println("Display Forward");
                    list.displayForward();
                    break;
                case 7:
                    System.out.println("Display Backward");
                    list.displayBackward();
                    break;
                case 8:
                    ulang = false;
                    break;
            }
            
        }
    }
    
}
