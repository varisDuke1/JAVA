package praktikum.pd.pkg2.aktifitas.pkg1.pertemuan.pkg2;

import java.util.ArrayList;
import java.util.Iterator;

public class PraktikumPD2Aktifitas1Pertemuan2 {

    public static void main(String[] args) {
        
        ArrayList<String> al = new ArrayList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        
        Iterator itr = al.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        
    }
    
}
