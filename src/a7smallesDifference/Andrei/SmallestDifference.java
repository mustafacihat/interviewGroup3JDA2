package a7smallesDifference.Andrei;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class SmallestDifference {

    public static int[] smallestDifference(int[] arr1, int[] arr2) {

        Map<Integer, String> map = new TreeMap<>();
        int[] result = new int[2];

        for (int j : arr1) {
            for (int k : arr2) {
                int res;
                if (j < k) {
                    res = (j - k) * -1;
                    map.put(res, j + " " + k);
                } else if (j > k) {
                    res = (j - k);
                    map.put(res, j + " " + k);
                } else {
                    result[0] = j;
                    result[1] = k;
                    break;
                }
            }
        }
        String str = map.get(map.keySet().stream().findFirst().get());
        Integer [] strArr = Arrays.stream(str.split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
        result[0] = strArr[0];
        result[1] = strArr[1];
        return result;
    }


    public static void main(String[] args) {
        int[] arr1 = {-1, 5, 10, 20, 28, 3};
        int[] arr2 = {26, 134, 135, 15, 17};

        System.out.println(Arrays.toString(smallestDifference(arr1, arr2)));
    }



}


