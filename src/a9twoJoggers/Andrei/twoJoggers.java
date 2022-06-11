package a9twoJoggers.Andrei;

import java.util.Arrays;

public class twoJoggers {
    public static int[] nbrOfLaps(int a, int b) {
        int[] res = new int[2];
        for (int i = 1; i <= a * b; i++) {
            if (i % a == 0 && i % b == 0) {
                res[0] = i / a;
                res[1] = i / b;
                return res;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nbrOfLaps(5, 3)));
        System.out.println(Arrays.toString(nbrOfLaps(4, 6)));
    }

}
