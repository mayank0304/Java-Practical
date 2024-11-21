
class Vehicle { // Outer class

    interface Engine { // Nested

        void start();

        void stop();
    }

    // Method to demonstrate the nested interface
    public void useEngine() {
        // Implementing the nested interface
        Engine engine = new Engine() {
            @Override
            public void start() {
                System.out.println("Engine is starting...");
            }

            @Override
            public void stop() {
                System.out.println("Engine is stopping...");
            }

        };
        engine.start();
        engine.stop();
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("Nested Interface (Interface within Class)");
        Vehicle vehicle = new Vehicle();
        // Using the nested interface
        vehicle.useEngine();
    }
}
