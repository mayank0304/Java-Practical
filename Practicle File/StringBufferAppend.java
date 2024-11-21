public class StringBufferAppend {
    public static void main(String[] args)
    {
        // Append Method
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("world");
        String message = sb.toString();
        System.out.println(message);
    }
}
