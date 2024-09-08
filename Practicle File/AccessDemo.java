class AccessDemo {
    public int publicVar = 10;
    private int privateVar = 20;
    
    static int staticVar = 30;
    
    final int finalVar = 40;

    public void show() {
        System.out.println("Public Variable: " + publicVar);
        System.out.println("Private Variable: " + privateVar);
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Final Variable: " + finalVar);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called.");
    }

    public static void main(String[] args) {
        AccessDemo demo = new AccessDemo();
        demo.show();

        // Static variable can be accessed directly without creating an object
        System.out.println("Accessing static variable without object: " + AccessDemo.staticVar);

        // Making object eligible for garbage collection
        demo = null;
        System.gc();  // Request garbage collection
    }
}