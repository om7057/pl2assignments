import java.io.*;
import java.net.*;

public class CalculatorServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Server started. Waiting for client...");

            while (true) {
                try (Socket clientSocket = serverSocket.accept();
                     BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                     PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true)) {

                    String expression = reader.readLine();
                    System.out.println("Received expression: " + expression);

                    String[] parts = expression.split(" ");
                    double operand1 = Double.parseDouble(parts[0]);
                    double operand2 = Double.parseDouble(parts[2]);
                    double result = 0;

                    switch (parts[1]) {
                        case "+":
                            result = operand1 + operand2;
                            break;
                        case "-":
                            result = operand1 - operand2;
                            break;
                        case "*":
                            result = operand1 * operand2;
                            break;
                        case "/":
                            result = operand1 / operand2;
                            break;
                        default:
                            System.out.println("Invalid operator");
                    }

                    writer.println(result);
                } catch (IOException | NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
 