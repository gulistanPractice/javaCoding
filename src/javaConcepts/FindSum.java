package javaConcepts;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindSum {
    public static void main(String[] args) {
        String str ="jav45ai150sgre1at82";
        String[] numbers = str.replaceAll("[\\D]+"," ").split(" ");

//        int sum = 0;
//        for(String each : numbers){
//            sum += Integer.parseInt(each);
//
//        }
//        System.out.println("sum = " + sum);
//
////        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
       System.out.println("frequentOfChar(\"AAABBBCCC\") = " + frequentOfChar("AAABBBCCC"));
        System.out.println("returnUnique(\"abbggttrfd\") = " + returnUnique("abbggttrfd"));


    }

    public static String frequentOfChar(String str){
        String result= "";
        String unique = "";
        for(char each : str.toCharArray()){
            if(!unique.contains(each +"")){
                unique += each;
            }
        }

        System.out.println("unique = " + unique);

        for(char each : unique.toCharArray()){
            int counter = 0;
            for(char eachOne : str.toCharArray()){
                if(each == eachOne){
                    counter++;
                }
            }
            result += each+"" +counter;
        }
        return result;
    }

    public static String returnUnique(String str){
        Set<Character> charSet = new LinkedHashSet<>();
        String result = "";

        for(char each : str.toCharArray()){
            charSet.add(each);
        }

        for (Character eachcharacter : charSet) {
            int counter = 0;
            for(char each : str.toCharArray()){
                if(eachcharacter == each){
                    counter++;
                }
            }
            if(counter == 1){
                result += eachcharacter;
            }

        }
       return result;
    }


}
