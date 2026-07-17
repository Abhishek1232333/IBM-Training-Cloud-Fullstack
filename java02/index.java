package java02;

public class index {
    public static void main(String[] args) {
        int a=10,b=20;

        //Arithmetic
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //Relational
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>=b);

        System.out.println(a * b + a % b);

        int x = 10;
        x += 5; 
        x--; 
        System.out.println(x);

        boolean result=(a>1)&&(b>50);
        System.out.println(result);
    }
}


