package a2arrayOfProducts.Vitaly.DSA.P2_ArrayOfProducts;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrOfProducts {
    /*
    The idea is to create 2 hash maps
    one will count cumulative product left to right
    for given array 5,1,4,2
    0-5
    1-5
    2-20
    3-40

    The second will do the same but starting from back -> right to left
    and populate hash map from the end
    0-40
    1-8
    2-8
    3-2

    Result array is multiplication of first Map's i-1 and  Second map's i+1.

    [..x8][5x8][5x2][20x..] -> 8 40 10 20
    */

    public static HashMap<Integer, Integer> createCumulProdMap(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prod = 1;
        for (int i = 0; i < arr.length; i++) {
            prod = prod * arr[i];
            map.put(i, prod);
        }
        return map;
    }

    public static HashMap<Integer, Integer> createCumulProdMapReveresed(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prod = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            prod = prod * arr[i];
            map.put(i, prod);
        }
        return map;
    }

    public static ArrayList<Integer> findResultArr(int[] givenArr, HashMap<Integer, Integer> map, HashMap<Integer, Integer> mapRev) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < givenArr.length; i++) {

            int prod = 1;
            //case i = 0 (first)
            if (i ==0) prod = mapRev.get(1);

            //case i = last
            else if(i==givenArr.length-1) prod = map.get(i-1);

            //multiply "prev" and "next" cumulative from beg and end respectively
            else prod = map.get(i-1)*mapRev.get(i+1);

            result.add(i,prod);
        }

        return result;
    }


}
