package a2arrayOfProducts.math;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ProductOfArray{
    public static void main(String[] args) {
        int  nums[] = {1,2,3,4,5};

        System.out.println("See after split the array");
        show(nums);
        System.out.println("Brutal Solution O(n*n) = " + Arrays.toString(productArrayOn2(nums)));
        System.out.println("My Best Solution O(n+n)  = " + Arrays.toString(leftRight(nums)));

    }



    private static int[] productArrayOn2(int[] nums) {
        int newArr[] = new int[nums.length];
        for (int i = 0; i < nums.length ; i++) {
            int a = 1;
            for (int j = 0; j < newArr.length ; j++) {
                if (i== j ) continue;
                else {
                    a *= nums[j];
                }
            }
            newArr[i] = a;
        }
        return newArr;
    }





    private static int[] leftRight(int[] nums) {
        int [] newArr = new int[nums.length];
        int left[] = new int[nums.length];
        int right[] = new int[nums.length];
        left[0]=1;
        right[nums.length-1]= 1;
        for (int i = 1, j =nums.length-2; i < nums.length; i++,j--) {
            left[i] = nums[i-1] * left[i-1];
            right[j] = nums[j+1] * right[j+1];
        }

        System.out.println( "Product of left Side = " + Arrays.toString(left) + " Product of right Side = " +  Arrays.toString(right));
        for (int i = 0; i < nums.length; i++) {
            newArr[i] = left[i] * right[i];
        }

        return newArr;
    }

    private static void show(int[] nums) {

        Map<Integer, int[][]> arrsMap = new HashMap<Integer,int [][]>();

        for (int i = 1; i <= nums.length ; i++) {
            int[] left = Arrays.copyOfRange(nums,0,i-1);
            int[] right = Arrays.copyOfRange(nums,i,nums.length );
            int[][] a = {left,right};
            arrsMap.put(i,a);

        }
        arrsMap.forEach((key,value) -> System.out.println(key + " : " + Arrays.deepToString(value)));
    }

}
