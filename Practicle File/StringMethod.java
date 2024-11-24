public class StringMethod {
    public static void main(String[] args) {
        System.out.println("toUpperClass");
        String text = "hello world";
        System.out.println(text.toUpperCase());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("toLowerCase");
        String text1 = "HELLO WORLD";
        System.out.println(text1.toLowerCase());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("trim");
        String text2 = "   Java Programming   ";
        System.out.println(text2.trim());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("charAt");
        String text3 = "Hello";
        System.out.println(text3.charAt(1));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("length");
        String text4 = "Hello World";
        System.out.println(text4.length());  
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("replace");
        String text5 = "I love Dart";
        System.out.println(text5.replace("Dart", "Java"));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("valueOf");
        int number = 123;
        String strNumber = String.valueOf(number);
        System.out.println(strNumber);
    }
}