public class PredefinedExceptionHandling {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            
            // Example of ArrayIndexOutOfBoundsException
            System.out.println("Accessing element at index 3: " + numbers[3]);

            // // Example of ArithmeticException
            // int result = 10 / 0;
            // System.out.println("Result: " + result);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
            
        } catch (Exception e) {
            System.out.println("An unexpected exception occurred: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
