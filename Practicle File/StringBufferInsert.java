public class StringBufferInsert {
    // Insert Method in String Buffer
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.insert(3, "HHH");
        String message = sb.toString();
        System.out.println(message);
    }
}
