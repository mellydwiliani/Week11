class Bound<T extends A> { 
    private T objRef; 
    
    public Bound(T obj){ 
        this.objRef = obj; 
    } 
    
    public void doRunTest(){ 
        this.objRef.displayClass(); 
    } 
}

class A { 
    public void displayClass() { 
        System.out.println("Inside super class A"); 
    } 
}

class B extends A { 
    public void displayClass() { 
        System.out.println("Inside sub class B"); 
    } 
}

class C extends A { 
    public void displayClass() { 
        System.out.println("Inside sub class C"); 
    } 
}

public class BoundedClass { 
    public static void main(String[] args) {
        Bound<C> bec = new Bound<>(new C()); // Passing subclass C
        bec.doRunTest(); // Output: Inside sub class C
        
        Bound<B> beb = new Bound<>(new B()); // Passing subclass B
        beb.doRunTest(); // Output: Inside sub class B
        
        Bound<A> bea = new Bound<>(new A()); // Passing superclass A
        bea.doRunTest(); // Output: Inside super class A
    } 
}
