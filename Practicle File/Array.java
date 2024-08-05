// Program for 1 Dimensional Array

public class Array {
    public static void main(String[] args) {
    // 1D Array
        // Declaration and initialization of an array
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        // int[] nyNum = {10, 20, 30, 40};

        // Accessing the value of an array
        System.out.println(cars[0]); // Volvo
        System.out.println(cars[1]); // BMW
        System.out.println(cars[2]); // Ford
        System.out.println(cars[3]); // Mazda

        // Changing an element of an array
        cars[0] = "audi";
        System.out.println(cars[0]); // Output will change to Audi from Volvo

        // Length of an array
        System.out.println(cars.length);

        // Loop through an array
        for (String arr  : cars) {
            System.out.println(arr);
        }
    }
}
