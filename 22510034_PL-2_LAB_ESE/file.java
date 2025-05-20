import java.io.*;

public class file {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";
        int bufferSize = 30;

        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(outputFile);
             BufferedInputStream bis = new BufferedInputStream(fis);
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {

            byte[] buffer = new byte[bufferSize];
            int bytesRead;

            // Read content from the input file and write it to the output file
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            System.out.println("Content copied successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
