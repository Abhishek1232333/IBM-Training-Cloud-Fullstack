package java03;

import java.io.File;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {

        File f = new File(
            "C:\\Users\\AbhishekGoud\\Desktop\\IBM Training Cloud Full Stack\\java03\\Handling.txt"
        );

        try {
            // Append text
            FileWriter fw = new FileWriter(f, true);
            fw.write("\nAbhishek Goud");
            fw.close(); // save changes

            // Read file
            Scanner sc = new Scanner(f);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            sc.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}