public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = a / b; // This will cause an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero is not allowed.");
            System.out.println("Error: " + e);
        }

        System.out.println("Program continues after handling the exception.");
    }
}