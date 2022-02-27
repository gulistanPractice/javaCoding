package javaConcepts;

import java.util.*;

public class IteratorClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,2,2,2,3,3,4,5,6,7,8,1,1,1));

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            if(it.next() == 1){
                it.remove();
            }
        }
        System.out.println("list = " + list);
        String[] names = {"Ali","Veli","Semavi","Sami","Hayati","Memati","Canan","Eli"};
        int[] numbers = {1,2,5,343,12,6,8,9,34, 53};
        Map<String, String> map = new LinkedHashMap<>();
        map.put("Ali","Veli");
        map.put("Veli","Semavi");
        map.put("Semavi","Sami");
        map.put("Sami","Hayati");
        map.put("Hayati","Memati");

        System.out.println("map = " + map);



        System.out.println("removeE(names) = " + removeE(names));
        System.out.println("returnEven(numbers) = " + returnEven(numbers));
        iterateMap(map);
    }

    public static List<String> removeE(String[] names){
        List<String> nameList = new ArrayList<>(Arrays.asList(names));

        Iterator<String> it = nameList.iterator();
        while(it.hasNext()){
            if(it.next().toLowerCase().contains("e")){
                it.remove();
            }
        }

        return nameList;
    }

    public static List<Integer> returnEven(int[] numbers){
        List<Integer> numberList = new ArrayList<>();
        for(int each : numbers){
            numberList.add(each);
        }

        Iterator<Integer> it = numberList.iterator();

        while(it.hasNext()){
            if(it.next()%2 != 0){
                it.remove();
            }
        }

        return numberList;
    }

    public static void iterateMap(Map<String, String> map){
        for(String each : map.values()){
            System.out.println(each);
        }

        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
//        List<Map.Entry<String, String>> mapIter = new ArrayList<>(map.entrySet());
        while(it.hasNext()){
           Map.Entry<String,String> entry = it.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());

        }
    }
}
