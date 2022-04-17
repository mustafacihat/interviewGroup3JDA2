package a3romanToInteger.jose;

import java.util.HashMap;
import java.util.Map;

public class Algo_3_RomanNumbers_Jose {

//    JDA2 Interview Prep Algo Question 3
//    Problem: Roman to Integer
//            Easy
//    Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
//            Symbol Value
//    I1 V5
//    X 10
//    L 50
//    C 100 D 500 M 1000
//    For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
//    Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
//            • I canbeplacedbefore V (5)andX (10)tomake4and9.
//• X can be placed before L (50) and C (100) to make 40 and 90.
//            • C can be placed before D (500) and M (1000) to make 400 and 900.
//
//    Given a roman numeral, convert it to an integer.
//    Example 1:
//    Input: s = "III" Output: 3 Explanation: III = 3.
//    Example 2:
//    Input: s = "LVIII"
//    Output: 58
//    Explanation: L = 50, V= 5, III = 3.
//    Example 3:
//    Input: s = "MCMXCIV"
//    Output: 1994
//    Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
//    Constraints:
//            •
//            • s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
//            • It is guaranteed that s is a valid roman numeral in the range   .
//    Good Luck ! Fatih
//1 <= s.length <= 15
//            [1, 3999]

    public static void main(String[] args) {
//        System.out.println(romanToInt("MCMXCIV"));
//        System.out.println(romanToInt("LVIII"));
//        System.out.println(romanToInt("MMMCDLXXXVIII")); // 3488
//        System.out.println(romanToInt("MDCCCLXXXIV")); // 1884
        System.out.println(romanToInt("MCMXCIV")); // 1994
    }

    public static int romanToInt(String str) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("IV", 4);
        map1.put("IX", 9);
        map1.put("XL", 40);
        map1.put("XC", 90);
        map1.put("CD", 400);
        map1.put("CM", 900);

        // Two maps: 1 for top priority, other lower priority
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("I", 1);
        map2.put("V", 5);
        map2.put("X", 10);
        map2.put("L", 50);
        map2.put("C", 100);
        map2.put("D", 500);
        map2.put("M", 1000);

        int number = 0;

        while (!str.isEmpty()) {
            boolean found = false;

            for (Map.Entry<String, Integer> entry : map1.entrySet()) {
                if (str.startsWith(entry.getKey())) {
                    number += entry.getValue();
                    str = str.replaceFirst(entry.getKey(), "");
                    found=true;
                    break;
                }
            }

            if (found) continue;

            for (Map.Entry<String, Integer> entry : map2.entrySet()) {
                if (str.startsWith(entry.getKey())) {
                    number += entry.getValue();
                    str = str.replaceFirst(entry.getKey(), "");
                    break;
                }
            }

        }
        return number;
    }

}
