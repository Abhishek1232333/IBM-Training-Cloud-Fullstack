package java03;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

enum day{
    Sunday,
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday
}

public class Date {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        LocalDate localdate=LocalDate.now();
        System.out.println(localdate.getDayOfMonth());

        System.out.print("Would you like to add the next (30 days)?(yes/no):");
        String userInput=scanner.next();

        if(userInput.equals("yes")){
            LocalDate futureDate = localdate.plusDays(30); // Add 30 days
            DayOfWeek futureday=futureDate.getDayOfWeek();
            if(futureday.equals("saturday")){

                System.out.println("Date after 30 days Booked on Monday"+futureDate.plusDays(2));
            }
            else if(futureday.equals("sunday")){
                System.out.println("Date after 30 days Booked on Monday"+futureDate.plusDays(1));
            }
            else{
                System.out.println("Date after 30 days: " + futureday);
            }
        }
        else{
            System.out.println("Today is :"+localdate.getDayOfWeek());
        }
   
        scanner.close();
        }

    }
