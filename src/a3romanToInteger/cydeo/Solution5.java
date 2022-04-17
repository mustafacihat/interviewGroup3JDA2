package a3romanToInteger.cydeo;

import java.util.Map;

public class Solution5 {
    public int romanToInt(String s) {

        Map<Character, Integer> romanValues = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);
        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'I' && i + 1 < s.length()) {
                if (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X') {
                    result -= 1;
                    continue;
                }
            }

            if (s.charAt(i) == 'X' && i + 1 < s.length()) {
                if (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C') {
                    result -= 10;
                    continue;
                }
            }

            if (s.charAt(i) == 'C' && i + 1 < s.length()) {
                if (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M') {
                    result -= 100;
                    continue;
                }
            }
            result += romanValues.get(s.charAt(i));
        }
        return result;
    }
}
