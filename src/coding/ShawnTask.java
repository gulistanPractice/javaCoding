package coding;

import java.util.HashSet;
import java.util.Set;

public class ShawnTask {
    public static int findSmalest(int[] A){
        int number = 0;
        int N = A.length;
        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            if (a > 0) {
                set.add(a);
            }
        }
        for (int i = 1; i <= N + 1; i++) {
            if (!set.contains(i)) {
                number = i;

            }
        }
        return number;
    }

    public static void main(String[] args) {
        int[] A = {1,3,2,4,6,1,};
        System.out.println(findSmalest(A));
    }


}
