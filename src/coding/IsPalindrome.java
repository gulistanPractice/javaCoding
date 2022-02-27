package coding;

public class IsPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalimdrome("word"));
    }


    public static boolean isPalimdrome(String word){

        boolean answer = false;
        String result ="";

        for (int i = word.length()-1; i >= 0 ; i--) {

            result += word.charAt(i);
        }
        if (result.equalsIgnoreCase(word)) {

              answer = true;
        }


    return answer;

    }


}
