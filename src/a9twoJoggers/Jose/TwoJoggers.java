package a9twoJoggers.Jose;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoJoggers {
//    Problem: Two Joggers
//    Level-3
//    Description
//    Bob and Charles are meeting for their weekly jogging tour.
//    They both start at the same spot called "Start" and they each run a different lap, which may (or may not) vary in length.
//    Since they know each other for a long time already, they both run at the exact same speed.

//    Illustration
//    Example where Charles (dashed line) runs a shorter lap than Bob:


//    Task
//    Your job is to complete the function nbrOfLaps(x, y) that, given the length of the laps for Bob and Charles, finds the number of laps that each jogger has to complete before they meet each other again, at the same time, at the start.
//    The function takes two arguments:
//            1. The length of Bob's lap (larger than 0)
//            2. The length of Charles' lap (larger than 0)
//    The function should return an array containing exactly two numbers:
//            1. The first number is the number of laps that Bob has to run
//            2. The second number is the number of laps that Charles has to run
//    Examples:
//    nbrOfLaps(5, 3); // returns [3, 5]
//    nbrOfLaps(4, 6); // returns [3, 2]
//
//
//

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(nbrOfLaps(4, 6)));
//        System.out.println(Arrays.toString(nbrOfLaps(78, 96)));
//        System.out.println(Arrays.toString(nbrOfLaps2(78, 96)));
//        System.out.println(Arrays.toString(nbrOfLaps2(4, 6)));
        System.out.println(Arrays.toString(nbrOfLaps2(5, 3)));

    }

    public static int[] nbrOfLaps2(int x, int y) {
        int lap_x = 1;
        int lap_y = 1;

        while (x*lap_x != y*lap_y) {
            if (x*lap_x > y*lap_y) {
                lap_y++;
            } else if(x*lap_x < y*lap_y) {
                lap_x++;
            }
        }
        int result[] = {lap_x,lap_y};
        System.out.println("Total distance = "+x*lap_x);
        return result;
    }

    public static int[] nbrOfLaps(int x, int y) {

        // Find the least common multiple, through the greatest common divisor
        Map<Integer,Integer> factors_x = trial_division(x);
        Map<Integer,Integer> factors_y = trial_division(y);
        Map<Integer,Integer> factors_common = new HashMap<>();
        System.out.println(factors_x.toString());
        System.out.println(factors_y.toString());

        // Get the common factors
        for (Map.Entry<Integer,Integer> entry : factors_x.entrySet()) {
            if (factors_y.containsKey(entry.getKey())) {
                Integer lower_freq = entry.getValue()>factors_y.get(entry.getKey()) ? factors_y.get(entry.getKey()) : entry.getValue();
                factors_common.put(entry.getKey(), lower_freq);
            }
        }

        int gcd = 1;
        for (Map.Entry<Integer,Integer> entry : factors_common.entrySet()) {
            gcd *= (int)  Math.pow(entry.getKey(),entry.getValue());
        }

        System.out.println("gcd="+gcd);
        System.out.println("ldc="+(x*y/gcd));
        int result[] = {y/gcd,x/gcd};
        return result;
    }

    public static Map<Integer,Integer> trial_division(int n) {
        Map<Integer,Integer> factors = new HashMap();

        int f = 2;

        while (n > 1) {
            if (n % f == 0) {
                if (factors.containsKey(f)) {
                    int value = factors.get(f);
                    factors.put(f,value+1);
                } else {
                    factors.put(f,1);
                }
                n = n/f;
            } else {
                f++;
            }
        }
        return factors;
    }



}
