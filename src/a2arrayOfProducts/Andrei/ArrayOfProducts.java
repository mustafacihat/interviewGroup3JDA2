package a2arrayOfProducts.Andrei;

import java.util.Arrays;

public class ArrayOfProducts {

    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2};
        System.out.println(Arrays.toString(arrOfProd(arr)));
    }

    public static int[] arrOfProd(int[] arr) {
        int[] res = new int[arr.length];
        Arrays.fill(res, 1);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < arr.length; j++)
                res[i] *= (i == j) ? 1 : arr[j];
        }
        return res;
    }
}
