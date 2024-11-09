public class GenericsType<T> { 
    private T t; 

    public T get() { 
        return this.t; 
    } 

    public void set(T t1) { 
        this.t = t1; 
    } 
    
    public static void main(String[] args) { 
        GenericsType<String> type = new GenericsType<>(); 
        type.set("Java"); // valid 
        System.out.println(type.get());
        System.out.println(type.get().getClass().getSimpleName());
        
        // Menggunakan Object sebagai tipe parameter agar bisa menyimpan berbagai tipe data
        GenericsType<Object> type1 = new GenericsType<>(); 
        type1.set("Java"); // valid 
        type1.set(10); // valid, mendukung autoboxing sehingga 10 diubah menjadi Integer
        System.out.println(type1.get()); // Output: 10
        System.out.println(type1.get().getClass().getSimpleName()); // Output: Integer
    } 
} 
    