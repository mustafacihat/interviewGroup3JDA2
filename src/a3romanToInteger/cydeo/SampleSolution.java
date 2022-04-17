package a3romanToInteger.cydeo;

import java.util.Map;

public class SampleSolution {

    public static void main(String[] args) {

        System.out.println(romanToInt("MCMXCIV"));
    }


    public static Integer romanToInt(String s) {

        int sum = 0;

        int preNum = getValueOfChar(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            int num = getValueOfChar(s.charAt(i));

            if (preNum < num) {
                sum -= preNum;
            } else {
                sum += preNum;
            }
            preNum = num;
        }

        sum += preNum;

        return sum;
    }

    public static Integer getValueOfChar(Character c) {

        Map<Character, Integer> integerMap = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );
        return integerMap.get(c);
    }


}
