package a7smallesDifference.cydeo;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Solutions {


    public static void main(String[] args) {

        int[] first = {-1, 5, 10, 20, 28, 3};
        int[] second = {0, 134, 135, 15, 17};
        System.out.println("Arrays.toString(smallDifference(first, second)) = " + Arrays.toString(smallDifference(first, second)));
    }

    public static int[] smallDifference(int[] first, int[] second) {

        Arrays.sort(first);
        Arrays.sort(second);

        int[] result = new int[2];
        int smallDifference = Integer.MAX_VALUE;

        int firstIndex = 0;
        int secondIndex = 0;

        while (firstIndex < first.length && secondIndex < second.length) {
            if (Math.abs(first[firstIndex] - second[secondIndex]) < smallDifference) {
                smallDifference = Math.abs(first[firstIndex] - second[secondIndex]);
                result[0] = first[firstIndex];
                result[1] = second[secondIndex];
                if (smallDifference == 1) return result;
            }

            if (first[firstIndex] < second[secondIndex]) {
                firstIndex++;
            } else {
                secondIndex++;
            }
        }
        return result;
    }

    public static int[] smallestDifference(int[] array1, int[] array2){
        int[] output = new int[2];
        Arrays.sort(array1);
        Arrays.sort(array2);
        int minDifference = Integer.MAX_VALUE;
        int current1 = 0;
        int current2 = 0;
        while ((current1 < array1.length) && (current2 < array2.length)){
            int currentDifference = Math.abs(array1[current1] - array2[current2]);
            if(currentDifference < minDifference) {
                minDifference = currentDifference;
                output[0] = array1[current1];
                output[1] = array2[current2];
                if(minDifference == 0) break;
            }
            if(array1[current1] < array2[current2]) current1++;
            else if(array2[current2] <= array1[current1]) current2++;
        }
        return output;
    }

    public static int[] smallestDifferenceWithMap(int[] array1, int[] array2){
        int[] output = new int[2];

        Map<Integer, Integer> allNumbersMap = new TreeMap<>();

        int difference = Integer.MAX_VALUE;

        for(int i : array1) allNumbersMap.put(i,1);
        for(int i : array2) allNumbersMap.put(i,2);

        Object[] keysArray = allNumbersMap.keySet().toArray();

        for(int i=0 ; i<keysArray.length-1 ; i++){
            // {-1, 5, 10, 15, 17, 20, 26, 28, 134, 135};
            //   1  1  1   2   2   1   2   1    2    2
            int firstElementArray = allNumbersMap.get(Integer.valueOf(keysArray[i].toString()));
            int secondElementArray = allNumbersMap.get(Integer.valueOf(keysArray[i+1].toString()));

            int firstElement = Integer.parseInt(keysArray[i].toString());
            int secondElement = Integer.parseInt(keysArray[i+1].toString());

            if(firstElementArray != secondElementArray){
                if (secondElement - firstElement < difference){
                    difference = secondElement - firstElement;
                    output[0] = firstElement;
                    output[1] = secondElement;
                    if(difference == 0) break;
                }
            }
        }
        return output;
    }
}
