package a2arrayOfProducts.Vitaly.DSA.P2_ArrayOfProducts;

import java.util.ArrayList;

import static a2arrayOfProducts.Vitaly.DSA.P2_ArrayOfProducts.ArrOfProducts.*;

public class aopMain {
    public static void main(String[] args) {
        
        int[] givenArr = {5, 1, 4, 2};

        ArrayList<Integer> result = findResultArr(
                givenArr,
                createCumulProdMap(givenArr),
                createCumulProdMapReveresed(givenArr)
        );

        System.out.println("result = " + result);
        
    }
}