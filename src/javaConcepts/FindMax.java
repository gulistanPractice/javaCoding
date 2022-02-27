package javaConcepts;

import java.util.Arrays;

public class FindMax {
    public static void main(String[] args) {
        int[] arr = {4, 6, 99, 3, 1, 909,0};

        int max = Integer.MIN_VALUE;

        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }

        System.out.println(max);


        for(int i = 0; i < arr.length-1; i++){
            for(int j = i +1; j < arr.length; j++)

            if(arr[i] > arr[j]){
                int temp = 0;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }



}
