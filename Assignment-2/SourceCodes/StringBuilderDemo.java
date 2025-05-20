public class StringBuilderDemo {
    public static void main(String[] args) {
        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder();

        // Append methods
        sb.append("Hello");
        sb.append(" ");
        sb.append("world");
        System.out.println("Appended string: " + sb);

        // Insert method
        sb.insert(5, " Java");
        System.out.println("After insertion: " + sb);

        // Delete method
        sb.delete(5, 10);
        System.out.println("After deletion: " + sb);

        // Reverse method
        sb.reverse();
        System.out.println("After reversal: " + sb);

        // Length method
        System.out.println("Length of StringBuilder: " + sb.length());

        // Capacity method
        System.out.println("Capacity of StringBuilder: " + sb.capacity());

        // SetLength method
        sb.setLength(5);
        System.out.println("After setting length: " + sb);

        // Replace method
        sb.replace(0, 5, "Hi");
        System.out.println("After replacement: " + sb);
    }
}
