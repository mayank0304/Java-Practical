
import java.util.Scanner;

public class IfElseLad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age -> ");
        int age = sc.nextInt();
        if (age < 12) {
            System.out.println("Child"); 
        }else if (age < 18) {
            System.out.println("Teenager"); 
        }else {
            System.out.println("Adult");
        }
    }
}
