
class outerClass {
    static int outer_x = 34; // Static member
    int outer_y = 102;
    // Non-static member
    private static int outerPrivate = 44; // Static member
    static class innerClass {
        // Static nested class
        void display() {
            outerClass outer = new outerClass();
            System.out.println("Value of x: " + outer_x);
            System.out.println("Value of y: " + outer.outer_y);
            System.out.println("Value of private variable: " + outerPrivate);
        }
    }
}

public class Nest { // Separate class to run the main method
    public static void main(String[] args) {
        System.out.println("Static Nested Class");
        outerClass.innerClass obj = new outerClass.innerClass();
        obj.display(); // Call the display method}
    }
}
