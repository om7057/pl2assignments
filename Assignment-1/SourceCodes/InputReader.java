import java.util.Scanner;

public class InputReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //integer
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();
        System.out.println("You entered: " + intValue);

        //double
        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("You entered: " + doubleValue);

        //string
        scanner.nextLine(); 
        System.out.print("Enter a string: ");
        String stringValue = scanner.nextLine();
        System.out.println("You entered: " + stringValue);

        //boolean
        System.out.print("Enter a boolean (true/false): ");
        boolean booleanValue = scanner.nextBoolean();
        System.out.println("You entered: " + booleanValue);

        
        scanner.close();
    }
}
