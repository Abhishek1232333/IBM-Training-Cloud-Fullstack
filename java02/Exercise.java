package java02;

import java.util.Scanner;

public class Exercise {
    //Grade calculator
    public static void Grade(int marks){
        if(marks>90){
            System.out.println("Grade A");
        }else if((marks>=75)&& (marks<=89)){
            System.out.println("Grade B");
        }else if((marks>=60)&&(marks<=74)){
            System.out.println("Grade C");
        }else if((marks>=50)&&(marks<=59)){
            System.out.println("Grade D");
        }else{
            System.out.println("Grade F");
        }
    }

    //Sum of N Numbers
    public static int sum(int num){
        int sum=0;
        for(int i=0;i<=num;i++){
            sum+=i;
        }
        return sum;
    }

    //Reverse a String
    public static String reverse(String s){
        String k="";
        for(int i=s.length()-1;i>=0;i--){
            k=k+s.charAt(i);
        }
        return k;
    }
    public static void main(String[] args) {
        //Temperature Converter
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Temperature:");
        float celsius=sc.nextFloat();
        float farenhit=(celsius*(9/5)+32);
        System.out.println("Farenhit:"+farenhit);

        Grade(0);
        System.out.println(sum(5));

        System.out.println("Enter a string");
        String str1=sc.next(); 
        System.out.println(reverse(str1)) ;
        sc.close();
    }

}
