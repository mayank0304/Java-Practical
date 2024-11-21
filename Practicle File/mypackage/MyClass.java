package mypackage;

public class MyClass {
    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30; // default access
    private int privateVar = 40;

    public void display() {
        System.out.println("Public variable: " + publicVar);
        System.out.println("Protected variable: " + protectedVar);
        System.out.println("Default variable: " + defaultVar);
        System.out.println("Private variable: " + privateVar);
    }
}