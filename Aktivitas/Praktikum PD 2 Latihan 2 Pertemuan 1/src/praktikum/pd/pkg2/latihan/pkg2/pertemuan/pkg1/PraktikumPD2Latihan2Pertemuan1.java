package praktikum.pd.pkg2.latihan.pkg2.pertemuan.pkg1;

public class PraktikumPD2Latihan2Pertemuan1 {
    
    String judulbuku;
    String penulis;
    String tahun;
    int harga;
    
    PraktikumPD2Latihan2Pertemuan1(String judul, String pengarang, String TahunTerbit, int hargajual) {
        judulbuku = judul;
        penulis = pengarang;
        tahun = TahunTerbit;
        harga = hargajual;
    }
    
    void infobuku() {
        System.out.println("Buku : " + judulbuku);
        System.out.println("Penulis : " + penulis);
        System.out.println("Tahun Terbit : " + tahun);
        System.out.println("Harga : " + harga);
        System.out.println();
    }
    public static void main(String[] args) {
        
        PraktikumPD2Latihan2Pertemuan1 buku1, buku2, buku3, buku4, buku5, buku6, buku7, buku8, buku9, buku10;
        buku1 = new PraktikumPD2Latihan2Pertemuan1("Dongeng Indonesia", "Reginald", "2000", 10000);
        buku2 = new PraktikumPD2Latihan2Pertemuan1("Dongeng Jepang", "Hafedo", "2001", 11000);
        buku3 = new PraktikumPD2Latihan2Pertemuan1("Dongeng Amerika", "Peter", "2002", 12000);
        buku4 = new PraktikumPD2Latihan2Pertemuan1("Dongeng Perancis", "Zulfi", "2003", 13000);
        buku5 = new PraktikumPD2Latihan2Pertemuan1("Dongeng Cina", "Pandu", "2004", 14000);
        buku6 = new PraktikumPD2Latihan2Pertemuan1("Dongeng Malaysia", "Caesaro", "2005", 15000);
        buku7 = new PraktikumPD2Latihan2Pertemuan1("Dongeng Slandia", "Elizabeth", "2006", 16000);
        buku8 = new PraktikumPD2Latihan2Pertemuan1("Dongeng German", "Charlotte", "2007", 17000);
        buku9 = new PraktikumPD2Latihan2Pertemuan1("Dongeng Filipina", "Vellisyo", "2008", 18000);
        buku10 = new PraktikumPD2Latihan2Pertemuan1("Dongeng Malaya", "Eussebeus", "2009", 19000);
        buku1.infobuku();
        buku2.infobuku();
        buku3.infobuku();
        buku4.infobuku();
        buku5.infobuku();
        buku6.infobuku();
        buku7.infobuku();
        buku8.infobuku();
        buku9.infobuku();
        buku10.infobuku();
        
    }
    
}
