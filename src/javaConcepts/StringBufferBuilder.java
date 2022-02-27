package javaConcepts;

public class StringBufferBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        str.append(" java");
        System.out.println("str = " + str);
        str.insert(1,"hello");
        System.out.println("str = " + str);

        System.out.println("isPalindrome(\"aba\") = " + isPalindrome("aba"));
    }

    public static boolean isPalindrome(String str){
        boolean result = false;
        StringBuilder reversed = new StringBuilder(str);
        String fina = reversed.reverse().toString();
        System.out.println("reversed = " + reversed);
        System.out.println("str = " + str);

//        String reversed2 = new String(reversed);

        //return reversed.equals(str);
        return str.equals(fina);

    }
}
