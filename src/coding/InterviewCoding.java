package coding;

import java.util.*;

public class InterviewCoding {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("art");
        list.add("rat");
        list.add("racecar");
        list.add("carrace");
        list.add("rrcaace");
        list.add("rraceca");
        list.add("tar");
        list.add("rose");
        list.add("seor");

        System.out.println("method(list) = " + method(list));
    }

//        System.out.println("isAnagram(list.get(0),list.get(1)) = " + isAnagram(list.get(0), list.get(1)));
//
//        System.out.println("method(list) = " + method(list));


//    public static List<List<String>> method(List<String> list){
//
//        List<List<String>> result = new ArrayList<>();
//        List<String> pairList = new ArrayList<>();
//
//
//        for (int i = 0; i < list.size(); i++) {
//
//            for (int j = i + 1; j < list.size(); j++) {
//               if (isAnagram(list.get(i), list.get(j))) {
//
//                   if (!pairList.contains(list.get(i))) {
//                       pairList.add(list.get(i));
//                   }
//                   pairList.add(list.get(j));
//                   //list.remove(list.get(j));
//               }
//
//
//           }
//
//           if (!result.contains(pairList) && pairList.size() != 0) {
//               result.add(pairList);
//           }
//
//
//          }
//        Iterator<String> it = pairList.iterator();
//
//        while (it.hasNext()){
//            it.next();
//            it.remove();
//           //System.out.println(list);
//       }
//        return result;
//
//        }
//        public static boolean isAnagram(String str1, String str2){
//        boolean result = false;
//        char[] charStr1 = str1.toCharArray();
//        Arrays.sort(charStr1);
//        //System.out.println(charStr1);
//        char[] charStr2 = str2.toCharArray();
//        Arrays.sort(charStr2);
//       // System.out.println(charStr2);
//
//        if( Arrays.equals(charStr1, charStr2)){
//            result = true;
//        }
//
//        return result;
//    }

    public static List<List<String>> method(List<String> name){
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for (String eachName : name) {
            char[] charName = eachName.toCharArray();
            Arrays.sort(charName);
            String key = new String(charName);


            if (map.containsKey(key)) {
                map.get(key).add(eachName);
            }else {
                List<String> value = new ArrayList<>();
                value.add(eachName);
                map.put(key,value);
            }


            //System.out.println(result);
        }
        for (List<String> value : map.values()) {
            if(value.size()>1){
                result.add(value);
            }
        }


        return result;

    }
}
