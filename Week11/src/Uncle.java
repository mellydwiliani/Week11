import java.util.HashMap;
import java.util.Map;

public class Uncle {
    private String name;
    private Map<Niece, String> presents;
    private Family family; // Reference to the Family class

    // Constructor with name and family reference
    Uncle(String name, Family family) {
        this.name = name;
        this.family = family;
        this.presents = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public boolean addPresent(Niece recipient, String description) {
        if (!presents.containsValue(description) && !presents.containsKey(recipient)) {
            presents.put(recipient, description);
            recipient.addPresent(this, description); // Simpan hadiah di objek Niece
            return true;
        }
        return false;
    }

    public void listPresents() {
        for (Niece niece : presents.keySet()) {
            System.out.println(niece.getName() + ": " + presents.get(niece));
        }
        // Tampilkan keponakan yang belum menerima hadiah dari paman ini
        for (Niece niece : family.getNieces()) { // Gunakan family untuk mengakses daftar keponakan
            if (!presents.containsKey(niece)) {
                System.out.println(niece.getName() + ": No present");
            }
        }
    }
}
