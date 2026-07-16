package java01;

public class first{
    public static void main(String[] args){
        int a=10;
        int b=20;
        String name="Abhishek";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.substring(0,4));
        System.out.println(name.charAt(0));

        System.out.println("Abhishek Bhimayya Goud");
        System.out.println(name.equals("Abhishek"));

        System.out.println("Sum:"+(a+b));
        System.out.println("Difference:"+(a-b));
        System.out.println("Hello IBM");

        if (a>b){
            System.out.println("a is greater than b");
        }else if(a<b){
            System.out.println("b is greater than a");
        }else{
            System.out.println("a is equal to b");
        }

    }

}