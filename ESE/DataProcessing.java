import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DataProcessing {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter bw= new BufferedWriter(new FileWriter("output.txt"))) {

            String line;
            int lineNumber = 0;

            while ((line = br.readLine()) != null) {
                lineNumber++;

                // Split the line by blank space
                String[] data = line.split("\\s+");

                // Check if line number is even
                if (lineNumber % 2 == 0) {
                    // Write the record to the output file
                    for (String value : data) {
                        bw.write(value);
                        bw.write(" ");
                    }
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
