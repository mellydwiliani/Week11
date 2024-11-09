import java.util.HashMap;
import java.util.Map;

public class Niece implements Comparable<Niece> {
    private String name;
    private int day;
    private int month;
    private Map<Uncle, String> receivedPresents;
    private Family family;

    public Niece(String name, int day, int month, Family family) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.family = family;
        this.receivedPresents = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int clearPresents() {
        int count = receivedPresents.size();
        receivedPresents.clear();
        return count;
    }
    public void addPresent(Uncle uncle, String present) {
        receivedPresents.put(uncle, present);
    }

    public void listPresents() {
        for (Uncle uncle : receivedPresents.keySet()) {
            System.out.println(uncle.getName() + ": " + receivedPresents.get(uncle));
        }
        // Tampilkan paman yang belum memberikan hadiah untuk keponakan ini
        for (Uncle uncle : family.getUncles()) {
            if (!receivedPresents.containsKey(uncle)) {
                System.out.println(uncle.getName() + ": No present");
            }
        }
    }

    @Override
    public int compareTo(Niece other) {
        if (this.month != other.month) {
            return this.month - other.month;
        }
        return this.day - other.day;
    }
}
