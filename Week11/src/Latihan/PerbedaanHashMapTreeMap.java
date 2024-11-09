package Latihan;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PerbedaanHashMapTreeMap {
    public static void main(String[] args) {
        // HashMap - Tidak menjamin urutan
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Aulia", 18);
        hashMap.put("Dio", 22);
        hashMap.put("Wildan", 21);
        hashMap.put("Sifa", 20);

        System.out.println("HashMap (tidak berurutan):");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Nama: " + entry.getKey() + ", Umur: " + entry.getValue());
        }

        // TreeMap - Urut secara alami (berdasarkan kunci)
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Aulia", 18);
        treeMap.put("Dio", 22);
        treeMap.put("Wildan", 21);
        treeMap.put("Sifa", 20);

        System.out.println("\nTreeMap (urutan alami):");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("Nama: " + entry.getKey() + ", Umur: " + entry.getValue());
        }
    }
}
