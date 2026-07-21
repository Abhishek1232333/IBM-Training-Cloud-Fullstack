package java03;

import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        
        try {
            File f=new File("C:\\Users\\AbhishekGoud\\Desktop\\IBM Training Cloud Full Stack\\java03\\Handling.txt");
            FileWriter fw=new FileWriter(f,true);
            fw.write("\nChannanagowda K");
            fw.close();

            FileReader fr=new FileReader(f);
            Scanner sc=new Scanner(fr);
            while(sc.hasNext()){
                System.out.println(sc.nextLine());

            
            }
            sc.close();




        } catch (IOException e) {
            
            e.printStackTrace();
        }
    }
}
