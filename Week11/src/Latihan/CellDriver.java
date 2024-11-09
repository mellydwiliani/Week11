package Latihan;
class Cell<T> {
    private T nilai;

    public T getNilai() {
        return nilai;
    }
    
    public void setNilai(T nilai) {
        this.nilai = nilai;
    }
}

public class CellDriver {
    public static void main(String[] args) {
        Cell<Integer> cellInteger = new Cell<>();
        Cell<String> cellString = new Cell<>();

        cellInteger.setNilai(1);
        cellString.setNilai("It's amazing");

        System.out.println("Nilai Integer: " + cellInteger.getNilai());
        System.out.println("Nilai String: " + cellString.getNilai());
    }
}
