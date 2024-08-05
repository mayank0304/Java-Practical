// Program for Multi-Dimensional Array

public class Array2D {
    public static void main(String[] args) {
    // 2D Array
        // Declaration and initialization of an 2D array
        int[][] my2DArr = {{10, 20, 30, 40}, {50, 60, 70}};

        // Accessing Elemensts of array
        System.out.println(my2DArr[0][0]); // 10
        System.out.println(my2DArr[1][2]); // 70

        // change element of array
        my2DArr[0][0] = 100;
        System.out.println(my2DArr[0][0]); //100

        // Loop through a multi dimensional array
        System.out.println("Looping through an array");
        for (int[] row : my2DArr) {
            for(int i : row) {
                System.out.println(i);
            }
        }
    }
}
