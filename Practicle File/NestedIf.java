
import java.util.Scanner;

public class NestedIf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a -> ");
        int a = sc.nextInt();
        System.out.print("Enter b -> ");
        int b = sc.nextInt();
        System.out.print("Enter c -> ");
        int c = sc.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("A is greatest"); 
            }else {
                System.out.println("C is greatest");
            }
        } else {
            if (b > c) {
                System.out.println("B is greatest"); 
            }else {
                System.out.println("C is greatest");
            }
        }
    }
}
