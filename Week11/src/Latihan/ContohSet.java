package Latihan;
import java.util.HashSet;
import java.util.Set;

public class ContohSet {
    public static void main(String[] args) {
        Set<String> namaSet = new HashSet<>();
        namaSet.add("Afriza");
        namaSet.add("Haikal");
        namaSet.add("Ryuki");  
        namaSet.add("Afriza");
        namaSet.add("Haikal");
        namaSet.add("Afriza");
        namaSet.add("Haikal");
        
        System.out.println("Size Set Nama:"+ namaSet.size());


        System.out.println("Set Nama:");
        for (String nama : namaSet) {
            System.out.println(nama);
        }
    }
}


