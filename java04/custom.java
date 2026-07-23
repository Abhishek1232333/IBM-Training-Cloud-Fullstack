package java04;

public class custom {
   public static void main(String[] args) {
     int[] arr={1,2,3,4,5};
    int [] b=new int[5];
    b=arr;
    System.out.println(b.equals(arr));

    for (int i : b) {
        System.out.println(i);
    }

    System.out.println(b);
    System.out.println(arr);

   }
}
