package a9twoJoggers.math;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;


public class TwoJoggers {
    public static void main(String[] args) {

        int a = 6;
        int b = 4;

        int max = Math.max(a, b);
        int min = Math.min(a, b);

        int lcm = IntStream.rangeClosed(1,min)
                .filter(num -> (num * max) % min == 0)
                .map(num -> Math.abs(num * max))
                .findFirst()
                .getAsInt();

        System.out.println(lcm/a + " , " + lcm/b);
        System.out.println(Arrays.toString(nbrOfLaps(a,b)));


    }





    private static int[] nbrOfLaps(int a, int b) {

        int higher = Math.max(a,b);
        int lower = Math.min(a,b);
        // find lowest com multiple
        int lcm = higher;
        while (lcm % lower != 0) {

            lcm += higher;
        }
        return new int[] {lcm/a , lcm/b} ;
    }

}
