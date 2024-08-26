
import java.util.Arrays;
import java.util.Scanner;

public class Equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a[] = new int[5];
        int b[] = new int[5];

        System.out.println("Enter Elements in array a : ");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter Elements in array b : ");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        boolean c = Arrays.equals(a, b);

        System.out.println("A is equals to B:" + c);
        // System.out.println(c);
    }
}
