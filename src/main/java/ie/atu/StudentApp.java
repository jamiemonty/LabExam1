package ie.atu;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class StudentApp extends Student {
    public static void main(String[] args) {
        Student student1 = new Student("\nJamie\n  ", 20, 20, "\nGalway\n  ");
        System.out.println(student1);

            /*Scanner scanner = new Scanner(System.in);

            System.out.println("Enter name: ");
            String name = scanner.nextLine();

            System.out.println("Enter name: ");
            int age = scanner.nextInt();

            System.out.println("Enter name: ");
            String address = scanner.nextLine();

            System.out.println("Enter name: ");
            int studentNum = scanner.nextInt();*/



        String fileName = "studentInfo.txt";

        File myFile = new File(fileName);

        try {
            if (!myFile.exists()) {
                if (myFile.createNewFile()) {
                    System.out.println("File created " + myFile.getAbsolutePath());
                } else {
                    System.out.println("File creation failed.");
                    return;
                }
            }
            try (FileWriter writer = new FileWriter(myFile, true)) {
                writer.write(student1.name);
                writer.write(student1.studentNum);
                writer.write(student1.age);
                writer.write(student1.address);
            } catch (IOException e) {
                System.out.println("!!Error!!");
                e.printStackTrace();
            }
        } catch (IOException e) {
            System.out.println("An error has occured trying to create the file");
            e.printStackTrace();
        }

    }
}