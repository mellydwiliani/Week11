package Latihan;
public class EnumClass {
    enum Level {
        LOW, MEDIUM, HIGH;
    }

    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);
        
        switch (myVar) {
        case LOW :
            System.out.println("Low Level");
            break;
        case MEDIUM :
            System.out.println("Medium Level");
            break;
        case HIGH :
            System.out.println("High Level");
            break;
        }
 
        for (Level myLevel : Level.values()) {
            System.out.println("Level: " + myLevel);
        }
    }
}
