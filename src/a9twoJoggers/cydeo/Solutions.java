package a9twoJoggers.cydeo;

import java.util.Arrays;


/**
 Problem: Two Joggers
 Level-3
 Description
 Bob and Charles are meeting for their weekly jogging tour. They both start at the same spot
 called "Start" and they each run a different lap, which may (or may not) vary in length. Since
 they know each other for a long time already, they both run at the exact same speed.
 Illustration
 Example where Charles (dashed line) runs a shorter lap than Bob:
 Task
 Your job is to complete the function nbrOfLaps(x, y) that, given the length of the laps for Bob
 and Charles, finds the number of laps that each jogger has to complete before they meet each
 other again, at the same time, at the start.
 The function takes two arguments:
 1. The length of Bob's lap (larger than 0)
 2. The length of Charles' lap (larger than 0)
 The function should return an array containing exactly two numbers:
 1. The first number is the number of laps that Bob has to run
 2. The second number is the number of laps that Charles has to run
 Examples:
 nbrOfLaps(5, 3); // returns [3, 5]
 nbrOfLaps(4, 6); // returns [3, 2]
 */

public class Solutions {


    public static void main(String[] args) {
        System.out.println(Arrays.toString(nbrOfLaps(4, 8)));
        System.out.println(Arrays.toString(mySolution(4, 6)));

    }


    public static int[] nbrOfLaps(int x, int y) {
        int j = 1, k = 1;
        while (j * x != y * k) {
            if (j * x > y * k) k++;
            else j++;
        }
        return new int[]{j, k};
    }

    public static int[] twoJoggers(int[] array) {
        int bobsLaps = array[0];
        int charlesLaps = array[1];
        for (int i = 0; i < bobsLaps * charlesLaps; i++) {
            if (bobsLaps < charlesLaps) bobsLaps += array[0];
            else charlesLaps += array[1];
            if (bobsLaps == charlesLaps) break;
        }
        return new int[]{bobsLaps / array[0], charlesLaps / array[1]};
    }

    public static int[] lastVersion(int x, int y) {
        int lcm = x;
        while (lcm % y != 0) {
            lcm += x;
        }
        return new int[]{lcm / x, lcm / y};
    }

    public static int[] mySolution(int x, int y){
        int bob=1;
        int charles=1;

        while(bob*x!=charles*y){
            if (bob*x<charles*y)bob++;
            else charles++;
        }
        return new int[]{bob,charles};
    }
}
