package Latihan;
public class GenericMethodClass {

    public static <T> void printArray(T[] array) {
        for (T arrayItem : array) {
            System.out.print(arrayItem + " ");
        }
       // System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        String[] stringArray = { "This", "is", "extraordinary" };

        System.out.print("Array Integer: ");
        printArray(intArray);

        System.out.print("\nArray String: ");
        printArray(stringArray);
    }
}
