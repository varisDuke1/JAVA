package tugas.pkg1.praktikum.pd.pkg2;

public class CustomerData {
    
    String nama;
    String alamat;
    String tgllahir;
    String pekerjaan;
    int gaji;
    
    public CustomerData(String name, String adress, String birth, String work, int salary) {
        nama = name;
        alamat = adress;
        tgllahir = birth;
        pekerjaan = work;
        gaji = salary;
    }
    
    void DataPelanggan() {
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Tanggal Lahir : " + tgllahir);
        System.out.println("Pekerjaan : " + pekerjaan);
        System.out.println("Gaji : " + gaji);
        System.out.println();
    }
    
    public static void main(String[] args) {
        CustomerData customer1;
        
        CustomerData customer2, customer3;
        customer1 = new CustomerData("Reginald", "Blimbing", "27/02/2000", "Programmer", 1000000);
        customer2 = new CustomerData("Caesaro", "Blitar", "13/03/1999", "Sales", 900000);
        customer3 = new CustomerData("Eussebeus", "Jakarta", "04/12/1998", "Manager", 1200000);
        
        customer1.DataPelanggan();
        customer2.DataPelanggan();
        customer3.DataPelanggan();
        
    }
    
}
