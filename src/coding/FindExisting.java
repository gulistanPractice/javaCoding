package coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindExisting {

    public static void main(String[] args) {
        int[] arr1 = {1,2,6,9,5};
        int[] arr2 = {3,2,9,4,0,1};
        System.out.println(Arrays.toString(findCommon(arr1, arr2)));

        Frequency.main(args);


    }
    public static int[] findCommon(int[] arr1, int[] arr2){
        List<Integer> listResult = new ArrayList<>();


        for(int eachArr1 : arr1){
            for(int eachArr2 : arr2){
                if(eachArr1 == eachArr2){
                    listResult.add(eachArr1);
                }
            }
        }

        int[] result = new int[listResult.size()];

        for(int i = 0, j = 0; i < result.length ; i++, j++){
            result[i] = listResult.get(j);
        }


        return result;
    }

}
