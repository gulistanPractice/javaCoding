package coding;

import com.sun.tools.javac.util.ArrayUtils;
import com.sun.tools.javac.util.ArrayUtils.*;

import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,9,9,5,7};
        int[] arr2 = {2,4,6,8,10,11};
        System.out.println("findFrequency" + findFrequency("abbcbaa"));
//        System.out.println(median(arr1, arr2));
       System.out.println("returnDupe(arr1) = " + returnDupe(arr1));
       // System.out.println("returnSet(arr1) = " + returnSet(arr1));

    }

    public static String findFrequency(String str){
        String  result = "";

        Map<Character,Integer> map = new LinkedHashMap<>();
        for (char each : str.toCharArray()) {
            if(!map.containsKey(each)){
                map.put(each,1);
            }else{
                map.put(each,map.get(each)+1);
            }

        }
        for (Map.Entry<Character, Integer> each : map.entrySet()) {
            result+= each.getKey()+"" + "" + each.getValue();
        }

        return result;
    }

    public static double median(int[] arr1,int[] arr2){
        double result = 0;

        //List<Integer> list = Arrays.asList(ArrayUtils.toObject(arr1));
        List<Integer> list = new LinkedList<>();

        for (int each : arr1) {
            list.add(each);

        }
        for (int each : arr2) {
            list.add(each);
        }

        Collections.sort(list);

        if(list.size()%2 == 0){
            result = ((list.get((list.size()/2)-1 )+ list.get(list.size()/2)))/2.0;

        }else {
            result = list.get(list.size()/2);
        }

return result;
    }


    public static List<Object> returnDupe(int[] arr){


        List<Object> result = new ArrayList<>();
        Map<Integer,Integer> map = new LinkedHashMap<>();

        for(int i=0; i<=arr.length-1;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        //List<Map.Entry> listOfMap =new ArrayList<>(map.entrySet());

        for (Map.Entry entry : map.entrySet()) {
            if((int)entry.getValue() > 1 ){
                result.add(entry.getKey());
            }

        }

        return result;
    }

//    public static Set<Integer> returnSet(int[] arr){
//
//        List<Integer> listArray = new ArrayList<>(Arrays.asList(arr));
//        Set<Integer> setArray = new HashSet<>();
//        for (int i = 0; i < arr.length; i++) {
//            int frequency = Collections.frequency(listArray,listArray.get(i));
//
//            if(frequency > 1){
//                setArray.add(listArray.get(i));
//            }
//
//        }
//        return setArray;
//    }
}
