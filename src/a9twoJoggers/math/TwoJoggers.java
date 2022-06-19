package a9twoJoggers.math;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;


public class TwoJoggers {
    public static void main(String[] args) {

        int a = 78;
        int b = 96;

        int max = Math.max(a, b);
        int min = Math.min(a, b);

        int lcm = IntStream.rangeClosed(1, min)
                .filter(num -> (num * max) % min == 0)
                .map(num -> num * max)
                .findFirst()
                .getAsInt();

        System.out.println(lcm / a + " , " + lcm / b);
        System.out.println(Arrays.toString(nbrOfLaps(a, b)));
        System.out.println(Arrays.toString(bruteNbrOfLaps(a, b)));
    }

    private static int[] bruteNbrOfLaps(int a, int b) {
        int x = 1;
        int y = 1;
        int iterationA = a;
        int iterationB = b;
        int count = 0;
        try {
            while (a % b != 0) {
                if (a > b) {
                    y++;
                    count++;
                    b += iterationB;
                } else if (a < b) {
                    x++;
                    count++;
                    a += iterationA;
                } else break;
            }
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }


        System.out.println("number of iteration for minimal solution = " + count);
        return new int[]{x, y};
    }


    private static int[] nbrOfLaps(int a, int b) {

        int higher = Math.max(a, b);
        int lower = Math.min(a, b);
        // find lowest com multiple
        int lcm = higher;
        int count = 0;
        while (lcm % lower != 0) {
            count++;
            lcm += higher;
        }
        System.out.println("number of iteration for normal = " + count);
        return new int[]{lcm / a, lcm / b};
    }

}
