package a3romanToInteger.cydeo;

import java.util.Map;

public class Solution7 {

    public static int getRomanInteger2(String roman) {
        Map<Character, Integer> charIntegerMap = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);
        int result = charIntegerMap.get(roman.charAt(0));

        for (int i = 1; i < roman.length(); i++) {
            result += charIntegerMap.get(roman.charAt(i));

            int value = charIntegerMap.get(roman.charAt(i));
            int previousValue = charIntegerMap.get(roman.charAt(i - 1));

            if (value > previousValue) {
                result -= previousValue * 2;
            }
        }
        return result;
    }
}
