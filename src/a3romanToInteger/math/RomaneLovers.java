package a3romanToInteger.math;

import java.util.TreeMap;

public class RomaneLovers {

    private static final TreeMap<Integer, String> converterMap = new TreeMap<Integer, String>();
    static {
        converterMap.put(1000, "M");
        converterMap.put(900, "CM");
        converterMap.put(500, "D");
        converterMap.put(400, "CD");
        converterMap.put(100, "C");
        converterMap.put(90, "XC");
        converterMap.put(50, "L");
        converterMap.put(40, "XL");
        converterMap.put(10, "X");
        converterMap.put(9, "IX");
        converterMap.put(5, "V");
        converterMap.put(4, "IV");
        converterMap.put(1, "I");

    }
    public static void main(String args[]){
        RomaneLovers ob = new RomaneLovers();

        String str = "MXLIV";
        System.out.println("convert to the Decimal " + ob.romanToDecimal(str));

        System.out.println("convert to the Roman " + ob.decimalToRoman(1904));
    }


    int roman (char roman) {

        switch (roman) {
            case 'I' : return 1;

            case 'V' : return 5;

            case 'X' : return 10;

            case 'L' : return 50;

            case 'C' : return 100;

            case 'D' : return 500;

            case 'M' : return 1000;

            default: return -1;
        }

    }
    int romanToDecimal(String s){
        int result = 0;
        for(int i = 0; i <s.length(); i++){
            int num1 = roman(s.charAt(i));

            if (i == s.length()-1){
                result = result + num1;
            } else {
                int num2 = roman(s.charAt(i + 1));

                if (num1 >= num2){
                    result = result + num1;
                }
                else {
                    result = result + num2 - num1;
                    i++;
                }

            }

        }

        return result;
    }

    public static final String decimalToRoman(int number) {
        int l = converterMap.floorKey(number);
        if (number == l) {
            return converterMap.get(number);
        }
        return converterMap.get(l) + decimalToRoman(number - l);
    }
}
