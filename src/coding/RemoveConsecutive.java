package coding;

import java.util.*;

public class RemoveConsecutive {
    public static void main(String[] args) {
//        System.out.println(remove2("aaabbbddccfgkuhnnmm"));
//        System.out.println (same2("abb", "aab"));
//        System.out.println(same("abb", "aab"));
        System.out.println(removeDupe("aaddfgghhhjr"));
        System.out.println(removeDupe2("aaddfgghhhjr"));
    }

    public static String remove(String str){
        String result = "";

        for (int i = 1; i <= str.length()-1; i++) {
            if(str.charAt(i-1) != str.charAt(i)){
                result += str.charAt(i-1);
            }

        }

        return result;
    }

    public static String remove2(String str) {
        String result = "";

        for (int s = 0; s < str.length(); s++) {
            if(!result.contains("" + str.charAt(s))){

                result += str.charAt(s);
            }

        }
        return result;
    }

    public static boolean same(String str1, String str2){

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

//        System.out.println(Arrays.toString(ch1));
//        System.out.println(Arrays.toString(ch2));

//        if(Arrays.equals(ch1,ch2)){
//            result = true;
//        }
        String a1 ="", a2 = "";

        for (char c : ch1) {
           a1 += c;
        }

        for (char c : ch2) {
            a2 += c;
        }

      return a1.equals(a2);
    }

    public static boolean same2(String str1, String str2){
        str1 = new TreeSet<String>(Arrays.asList(str1.split(""))).toString();
        System.out.println(str1);

        str2 = new TreeSet<String>(Arrays.asList(str2.split(""))).toString();
        System.out.println(str2);

        return str1.equals(str2);

    }

    public static String removeDupe(String str){
        String result = "";

        Set<String> list = new HashSet<>(Arrays.asList(str.split("")));
        for (String s : list) {
            result += s;
        }

        return result;
    }
    public static String removeDupe2(String str){
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if(!result.contains("" + str.charAt(i))){
                result +=  str.charAt(i);
            }
        }

        return result;
    }
}
