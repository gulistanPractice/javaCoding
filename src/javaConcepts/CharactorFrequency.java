package javaConcepts;

import java.util.*;

public class CharactorFrequency {
    public static void main(String[] args) {

        String str ="aaabbbcccj";

        List<Character> charList = new ArrayList<>();
        Set<Character> uniqueChar = new LinkedHashSet<>();
        Map<Character, Integer> resultMap = new LinkedHashMap<>();
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            charList.add(c);
        }

        for (char a : charArray) {
            uniqueChar.add(a);
        }


        for (Character character : uniqueChar) {
            ;
            resultMap.put(character,Collections.frequency(charList,character));
        }

        System.out.println("resultMap = " + resultMap);
    }
}
