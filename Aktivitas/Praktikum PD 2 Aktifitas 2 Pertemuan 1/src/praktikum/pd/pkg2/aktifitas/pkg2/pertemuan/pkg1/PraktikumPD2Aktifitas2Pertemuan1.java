package praktikum.pd.pkg2.aktifitas.pkg2.pertemuan.pkg1;

public class PraktikumPD2Aktifitas2Pertemuan1 {

    String warna;
    String rasa;
    int berat;
    double harga;
    
    void beriwarna(String warnaRoti) {
        warna = warnaRoti;
    }
    
    void berirasa(String rasaRoti) {
        rasa = rasaRoti;
    }
    
    void timbangberat(int beratRoti) {
        berat = beratRoti;
    }
    
    void hargajual(double hargaRoti) {
        harga = hargaRoti;
    }
    
    void inforoti() {
        System.out.println("Warna Roti : " + warna);
        System.out.println("Rasa Roti : " + rasa);
        System.out.println("Berat Roti : " + berat);
        System.out.println("Harga Roti : " + harga);
    }

    public static void main(String[] args) {
        
        PraktikumPD2Aktifitas2Pertemuan1 roti = new PraktikumPD2Aktifitas2Pertemuan1();
        roti.beriwarna("Cokelat");
        roti.berirasa("Pisang Cokelat");
        roti.timbangberat(50);
        roti.hargajual(5000);
        roti.inforoti();
        
    }

}
