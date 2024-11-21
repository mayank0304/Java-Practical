import mypackage.MyClass;

public class ImportPackage {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        
        // Accessing variables with different access modifiers
        System.out.println("Accessing public variable: " + obj.publicVar);
        // System.out.println("Accessing protected variable: " + obj.protectedVar); // Error: Not accessible
        // System.out.println("Accessing default variable: " + obj.defaultVar); // Error: Not accessible
        // System.out.println("Accessing private variable: " + obj.privateVar); // Error: Not accessible

        obj.display(); // Method displays all variables within the same class
    }
}