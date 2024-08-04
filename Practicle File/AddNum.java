import java.util.Scanner;

public class AddNum {
    public static void main(String[] args) {
        System.out.println("# Adding Two Numbers #");
        System.out.println("Taking input for two numbers: \n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Sum is: ");
        int sum = a + b;
        System.out.println(sum);
    }
}
