package hust.soict.itep.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) {
        // Absolute path to the file
        String filename = "C:\\Users\\Admin\\OneDrive\\Máy tính\\Java\\OOP Lab\\OOP-Lab-Lab01\\OOP-Lab-744523\\Lab003\\OtherProjects\\src\\hust\\soict\\itep\\garbage\\test.txt";
        byte[] inputBytes = {0};
        long startTime, endTime;

        try {
            // Read the file directly using the absolute path
            inputBytes = Files.readAllBytes(Paths.get(filename));
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        startTime = System.currentTimeMillis();
        StringBuilder outputString = new StringBuilder();
        for (byte b : inputBytes) {
            outputString.append((char) b);
        }
        endTime = System.currentTimeMillis();

        System.out.println("Execution time: " + (endTime - startTime) + " ms");
        System.out.println("File content: " + outputString.toString());
    }
}