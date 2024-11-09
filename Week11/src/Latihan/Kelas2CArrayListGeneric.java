package Latihan;
import java.util.ArrayList;

public class Kelas2CArrayListGeneric {
    public static void main(String[] args) {
        // pembuatan generic collection 
        ArrayList<String> listNamaMahasiswa = new ArrayList<>();  
        
        listNamaMahasiswa.add("Afriza");
        listNamaMahasiswa.add("Haikal");
        listNamaMahasiswa.add("Ryuki");

        System.out.println("Size Set Nama:"+ listNamaMahasiswa.size());
        for (String nama : listNamaMahasiswa) {  
            System.out.println(nama);
        }

       try {
            listNamaMahasiswa.remove(2);
            System.out.println("Size Set Nama:"+ listNamaMahasiswa.size());
            for (String nama : listNamaMahasiswa) {  
               System.out.println(nama);
             }
        } catch(Exception e) {
            System.out.println("terjadi kesalahan ");
        }

    }
}
