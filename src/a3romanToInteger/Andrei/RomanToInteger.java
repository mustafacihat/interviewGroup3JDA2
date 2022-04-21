package a3romanToInteger.Andrei;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {


    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXLI"));
    }

    public static int romanToInt(String str) {

        try {
            if (str.length() > 15 || str.length() < 1)
                throw new RuntimeException("String should not be less than 1 and greater than 15 characters");

        } catch (RuntimeException e) {
            e.printStackTrace();
            System.exit(-1);
        }

        int res = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);

            if (i > 0 && map.get(character) > map.get(str.charAt(i - 1))) {
                char prevChar = str.charAt(i - 1);
                res += map.get(character) - 2 * map.get(prevChar);
            } else
                res += map.get(character);
        }
        return res;
    }


}
