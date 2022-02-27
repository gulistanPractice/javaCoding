package coding;

import java.util.Arrays;
import java.util.Map;

public class OCA {
    public static void main(String[] args) {

        int[][] arr = new int[2][];
        System.out.println(Arrays.toString(arr));

        double[][] arr1 = new double[][]{{1,2},{3,4}};
        System.out.println(Arrays.toString(arr1));

        long[][] arr2 = new long[][]{{1,2},{3,4}};
        System.out.println(Arrays.toString(arr2));

        int[][] arr3 ={{'A','b'},{'C','D'}};
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = new int[2];

            arr4[0] = 10;
            arr4[1] = 20;
        System.out.println(arr4[0] +" " + arr4[1]);
    }
}
