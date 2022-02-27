package javaConcepts;

public class FinRa {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("finra");
            } else if (i % 5 == 0) {
                System.out.println("ra");
            } else if (i % 3 == 0) {
                System.out.println("fin");
            } else {
                System.out.println(i);
            }
        }


        for (int i = 1; i <= 30; i++) {
            String word = "";
            if (i % 3 == 0 && i % 5 == 0) {
                word = "finra";
            } else if (i % 5 == 0) {
                word = "ra";
            } else if (i % 3 == 0) {
                word = "fin";
            }
            if(word.isEmpty()){
                System.out.println(i);
            }else  {
                System.out.println(word);
            }
        }
    }


}
