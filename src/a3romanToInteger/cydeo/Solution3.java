package a3romanToInteger.cydeo;

import java.util.HashMap;
import java.util.Map;

public class Solution3 {
    public static int romanToInt(String s) {
        Map<Character, Integer> valueMap = new HashMap<>();

        valueMap.put('I', 1);                               // assigning all key and values to the map in a default
        valueMap.put('V', 5);
        valueMap.put('X', 10);
        valueMap.put('L', 50);
        valueMap.put('C', 100);
        valueMap.put('D', 500);
        valueMap.put('M', 1000);

        int total = 0, carry = valueMap.get(s.charAt(0));   // assigning value of first element of string  to the carry

        for (int index = 1; index < s.length(); index++) {   // beginning with index 1
            int value = valueMap.get(s.charAt(index));      // assigning value of index 1 to the value
            if (carry >= value) {                            // assumption: always value of first element of string (carry) is bigger than next element (value)
                total += carry;                             // if then add to the total
            } else {
                total -= carry;                             // if not subtract from the total
            }
            carry = value;                                  // for next iteration change carry with value
        }
        if (carry != 0) {                                    // if carry is not 0 (end of the string) add to the total
            total += carry;
        }
        return total;
    }
}
