package praktikum.pd.pkg2.latihan.pkg1.pertemuan.pkg1;

public class PraktikumPD2Latihan1Pertemuan1 {

    String Pengarang;
    String Judul;
    int Tahun;
    int Cetak;
    double Harga;
    
    PraktikumPD2Latihan1Pertemuan1(String penulis, String JudulBuku, int TahunTerbit, int CetakanKe, double HargaJual) {
        Pengarang = penulis;
        Judul = JudulBuku;
        Tahun = TahunTerbit;
        Cetak = CetakanKe;
        Harga = HargaJual;
    }
    
    void infobuku() {
        System.out.println("Pengarang Buku : " + Pengarang);
        System.out.println("Judul Buku : " + Judul);
        System.out.println("Tahun Terbit : " + Tahun);
        System.out.println("Cetakan Ke-" + Cetak);
        System.out.println("Harga Buku : " + Harga);
        System.out.println();
    }
    
    public static void main(String[] args) {
        
        PraktikumPD2Latihan1Pertemuan1 buku1, buku2, buku3;
        buku1 = new PraktikumPD2Latihan1Pertemuan1("Reginald", "Dongeng Indonesia", 2019, 1, 100000);
        buku2 = new PraktikumPD2Latihan1Pertemuan1("Caesaro", "Dongeng Jepang", 2018, 3, 125000);
        buku3 = new PraktikumPD2Latihan1Pertemuan1("Eussebeus", "Dongeng Perancis", 2017, 6, 150000);
        
        buku1.infobuku();
        buku2.infobuku();
        buku3.infobuku();
        
    }
    
}
