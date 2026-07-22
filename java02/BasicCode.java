package java02;
import java.util.Scanner;

public class BasicCode {
    public static void main(String[] args) {
        //Swap Two Numbers
        int num1=10;
        int num2=20;
        int temp=num1;
        num1=num2;
        num2=temp;

        System.out.println("num1=" + num1 + ", num2=" + num2);

        // even and odd number
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();

        if(num%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd number");
        }
    
        //factorial code
        int numo=5;
        int fact=1;
        for(int i=1;i<=numo;i++){
            fact*=i;
        }
        System.out.println("Factorial of:" + numo + " is " + fact);


        //Palindrome code
        int x=121,rev=0,original=x;
        while(x>0){
            rev=rev*10+x%10;
            x/=10;
           
        }
        System.out.print(rev==original);


        //Fibonacci Series
        int a=0,b=1;
        System.out.print("\n"+ a+ " "+ b+" ");
        for(int i=2;i<8;i++){
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;

        }

        //Prime number
        boolean isPrime = true;
        System.out.print("Enter the number:");
        int xk=sc.nextInt();
        for(int i=2;i<xk;i++){
            if(xk%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println("\nPrime Number");
        }
        else{
        System.out.println("Not prime number");
        }

        sc.close();
    }
}
