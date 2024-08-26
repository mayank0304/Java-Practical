
import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
// Sum of first n numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n--;
        }
        System.out.println(sum);
    }
}
