
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));

        System.out.print("Enter the name:");
        String name=sc.nextLine();

        System.out.print("Enter the Age:");
        int age=sc.nextInt();

        System.out.print("Enter the Gpa:");
        double gpa=sc.nextDouble();

        System.out.println("Welcome, " + name + "!");   
        System.out.println("Age: " + age + ", GPA: " + gpa);

        System.out.print("Enter the day number:");
        int day_num=sc.nextInt();

        switch(day_num){
            case 1:System.out.println("Today is monday");break;
            case 2:System.out.println("Today is Tuesday");break;
            case 3:System.out.println("Today is Wednesday");break;
            case 4:System.out.println("Today is Thursday");break;
            case 5:System.out.println("Today is Friday");break;
            case 6:System.out.println("Today is Saturday");break;
            case 7:System.out.println("Today is Sunday");break;
        }
        sc.close();

    }
}
