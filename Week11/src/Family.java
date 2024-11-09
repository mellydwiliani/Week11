import java.util.*;

public class Family {
    private List<Uncle> uncles;
    private List<Niece> nieces;

    public Family() {
        this.uncles = new ArrayList<>();
        this.nieces = new ArrayList<>();
    }

    public boolean addNiece(String name, int day, int month) {
        for (Niece niece : nieces) {
            if (niece.getName().equals(name)) {
                return false; // Keponakan dengan nama yang sama sudah ada
            }
        }
        nieces.add(new Niece(name, day, month, this));
        return true;
    }

    public boolean addUncle(String name) {
        for (Uncle uncle : uncles) {
            if (uncle.getName().equals(name)) {
                return false; // Paman dengan nama yang sama sudah ada
            }
        }
        uncles.add(new Uncle(name, this));
        return true;
    }

    public Niece findNiece(String name) {
        for (Niece niece : nieces) {
            if (niece.getName().equals(name)) {
                return niece;
            }
        }
        return null;
    }

    public Uncle findUncle(String name) {
        for (Uncle uncle : uncles) {
            if (uncle.getName().equals(name)) {
                return uncle;
            }
        }
        return null;
    }

    public void listNieces() {
        // Sortir berdasarkan bulan dan hari lahir
        nieces.sort(Comparator.comparingInt(Niece::getMonth).thenComparingInt(Niece::getDay));
        for (Niece niece : nieces) {
            System.out.println(niece.getName());
        }
    }

    public void listUncles() {
        // Sortir berdasarkan nama
        uncles.sort(Comparator.comparing(Uncle::getName));
        for (Uncle uncle : uncles) {
            System.out.println(uncle.getName());
        }
    }
    public List<Niece> getNieces() {
        return nieces;
    }

    public List<Uncle> getUncles() {
        return uncles;
    }
}