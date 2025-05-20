import java.io.*;
import java.net.*;

public class CalculatorClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345);
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Connected to server. Enter an arithmetic expression (e.g., 2 + 3):");
            String expression = userInput.readLine();

            writer.println(expression);

            String result = reader.readLine();
            System.out.println("Result: " + result);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
