
import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
// Sum of first n numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        do {
            sum += n--;
        } while (n > 0);
        System.out.println(sum);
    }
}
