package a2arrayOfProducts.cydeo;

import java.util.Arrays;

public class BruteForceSolution {


    public static void main(String[] args) {
        int [] products = {5,1,4,2};
        System.out.println("arrayOfProducts(products) = " + Arrays.toString(arrayOfProducts(products)));
    }

    static int [] arrayOfProducts(int [] arr){

        int [] result = new int[arr.length];

        for (int i = 0; i <arr.length ; i++) {
            int subResult=1;
            for (int j = 0; j < arr.length; j++) {
                if (i!=j){
                    subResult*= arr[j];
                }
            }
            result[i] = subResult;
        }

        return result;
    }
}
