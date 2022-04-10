package a2arrayOfProducts.cydeo;

import java.util.Arrays;

public class OptimizeSolution {

    //
    public static void main(String[] args) {
        int[] products = {5, 1, 4, 2};
        System.out.println("arrayOfProducts(products) = " + Arrays.toString(arrayOfProducts(products)));
    }


    public static int[] arrayOfProducts(int[] array) {

        try {
            if (array.length < 1 || array == null) {
                throw new IllegalArgumentException("Argument should have ONE ELEMENT in least");
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.exit(-1);
        }

        int[] product = new int[array.length];

        int left=1;

        for (int i = 0; i < array.length; i++) { //[1,5,5,20]
            product[i]=left;
            left*=array[i];
        }
        //System.out.println(Arrays.toString(product));

        int right = 1;
        for (int i = array.length-1; i>=0 ; i--) {
            product[i] *= right;
            right *= array[i];
        }
        return product;
    }
}
