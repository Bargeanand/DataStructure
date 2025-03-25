import java.io.*;
import java.util.Scanner;

/**
 * A utility class for file handling operations such as reading, writing, and modifying text files.
 */
public class FileHandlingUtility {

    /**
     * Method to write content to a file.
     *
     * @param fileName the name of the file
     * @param content  the content to write
     */
    public static void writeFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    /**
     * Method to read content from a file.
     *
     * @param fileName the name of the file
     */
    public static void readFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("File content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

    /**
     * Method to modify content in a file by appending new content.
     *
     * @param fileName    the name of the file
     * @param newContent the content to append
     */
    public static void modifyFile(String fileName, String newContent) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(newContent);
            System.out.println("File modified successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while modifying the file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the File Handling Utility!");
        System.out.println("1. Write to a file");
        System.out.println("2. Read from a file");
        System.out.println("3. Modify a file");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter content to write: ");
                String content = scanner.nextLine();
                writeFile(fileName, content);
                break;
            case 2:
                readFile(fileName);
                break;
            case 3:
                System.out.print("Enter content to append: ");
                String newContent = scanner.nextLine();
                modifyFile(fileName, newContent);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
