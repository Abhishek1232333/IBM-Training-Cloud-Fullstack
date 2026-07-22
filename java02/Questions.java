package java02;

import java.util.Arrays;

public class Questions {
    public static boolean anagrams(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);

 }
    public static void main(String[] args) {
        System.out.println(anagrams("listen", "silent"));
    }
}