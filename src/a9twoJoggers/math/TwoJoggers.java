package a9twoJoggers.math;

import java.lang.reflect.Array;
import java.util.Arrays;



public class TwoJoggers {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(nbrOfLaps(5, 3)));
        System.out.println(Arrays.toString(nbrOfLaps(4, 6)));
    }





    private static int[] nbrOfLaps(int a, int b) {

        int higher = Math.max(a,b);
        int lower = Math.min(a,b);
        //find least common multiple first
        int lcm = higher;
        while (lcm % lower != 0) {
            lcm += higher;
        }
        return new int[] {lcm/a , lcm/b} ;
    }

}
