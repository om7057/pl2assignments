public class StringBufferFunctions {

    public static void main(String[] args) {
        // Creating a StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello");

        // Appending
        stringBuffer.append(", World!");
        System.out.println("Appended: " + stringBuffer);

        // Inserting
        stringBuffer.insert(6, " Java");
        System.out.println("Inserted: " + stringBuffer);

        // Deleting
        stringBuffer.delete(6, 11);
        System.out.println("Deleted: " + stringBuffer);

        // Deleting a single character
        stringBuffer.deleteCharAt(0);
        System.out.println("Deleted char at index 0: " + stringBuffer);

        // Replacing
        stringBuffer.replace(0, 5, "Hola");
        System.out.println("Replaced: " + stringBuffer);

        // Reverse
        stringBuffer.reverse();
        System.out.println("Reversed: " + stringBuffer);

        // Capacity and Length
        System.out.println("Capacity: " + stringBuffer.capacity());
        System.out.println("Length: " + stringBuffer.length());

        // Set Length
        stringBuffer.setLength(5);
        System.out.println("Set Length to 5: " + stringBuffer);

        // Ensure Capacity
        stringBuffer.ensureCapacity(20);
        System.out.println("Ensured Capacity to 20: " + stringBuffer);
    }
}
