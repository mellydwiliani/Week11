package Latihan;
import java.util.HashMap;
import java.util.Map;

public class ContohMap {
    public static void main(String[] args) {
        Map<String, String> noHandphone = new HashMap<>();
        noHandphone.put("Alqan", "08123456789");
        noHandphone.put("Restu", "08198765432");
        noHandphone.put("Restu", "08100000000");  // Menimpa nilai sebelumnya untuk kunci "Alqan"

        System.out.println("No Telepon:");
        for (String nama : noHandphone.keySet()) {
            System.out.println("Nama: " + nama + ", Nomor: " + noHandphone.get(nama));
        }
    }
}
