package java03;
import java.util.Arrays;
import java.util.Date;

public class Array {
    public static void main(String[] args) {
        int[] arr=new int[2];
        Date date=new Date();
        System.out.println(date);


        arr[0]=1;
        arr[1]=2;
        
        for(int elements:arr){
            System.out.println(elements);
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
