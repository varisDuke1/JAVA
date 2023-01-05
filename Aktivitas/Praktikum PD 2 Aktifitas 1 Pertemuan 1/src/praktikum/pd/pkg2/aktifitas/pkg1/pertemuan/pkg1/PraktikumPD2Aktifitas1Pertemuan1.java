package praktikum.pd.pkg2.aktifitas.pkg1.pertemuan.pkg1;

public class PraktikumPD2Aktifitas1Pertemuan1 {
    
        double panjang;
        double lebar;
        double tinggi;
        
        PraktikumPD2Aktifitas1Pertemuan1(double p, double l, double t) {
            panjang = p;
            lebar = l;
            tinggi = t;
        }
        
        double hitungVolume() {
            return(panjang*lebar*tinggi);
        }
    

    public static void main(String[] args) {
        
        PraktikumPD2Aktifitas1Pertemuan1 k1, k2;
        k1 = new PraktikumPD2Aktifitas1Pertemuan1(4, 3, 2);
        k2 = new PraktikumPD2Aktifitas1Pertemuan1(6,5,4);
        
        System.out.println("Volume k1 : " + k1.hitungVolume());
        System.out.println("Volume k2 : " + k2.hitungVolume());
        
    }
    
}
