
import java.util.Arrays;
import java.util.Scanner;

public class CopyOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        // int b[] = new int[5];

        System.out.println("Enter Elements in array: ");

        for(int i = 0; i <a.length; i++) {
            a[i] = sc.nextInt();
        }

        int b[] = Arrays.copyOf(a, 5);

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

    }
}
