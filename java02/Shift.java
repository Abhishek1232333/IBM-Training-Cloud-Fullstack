package java02;

import java.util.Arrays;

public class Shift {

    public static int[] shift(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = arr[(i + k) % n];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        System.out.println(Arrays.toString(shift(arr, 2)));
    }
}