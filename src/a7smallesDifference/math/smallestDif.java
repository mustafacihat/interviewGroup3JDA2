package a7smallesDifference.math;

import java.util.Arrays;

public class smallestDif {
    public static void main(String[] args) {
        int[] myarray1 = {-1, 5, 10, 20, 28, 3};
        int[] myarray2 = {26, 134, 135, 15, 17};


        System.out.println("Brutal Solution =" + Arrays.toString(twoSub1(myarray1, myarray2)));
        System.out.println("Sorted Array =" + Arrays.toString(twoSubSortArray(myarray1, myarray2)));
    }
    public static int[] twoSub1(int[] array1, int[] array2) {
        int minDif = Integer.MAX_VALUE;
        int[] result = new int[2];
        int counter = 0;
        for (int i = 0; i < array1.length - 1; i++) {  //n
            for (int j = 0; j < array2.length - 1; j++) { //n

                if (Math.abs(array1[i] - array2[j]) < minDif) {
                    minDif = Math.abs(array1[i] - array2[j]);
                    result[0] = array1[i];
                    result[1] = array2[j];

                }
                counter++;
            }
        }
        System.out.println("length of Iteration for Complexity = " + counter);
        return result;
    }

    public static int[] twoSubSortArray(int[] array1, int[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);

        int i = 0, j = 0;
        int counter=0;
        // assign max value to
        int minDif = Integer.MAX_VALUE;
        int[] result = new int[2];


        while (i < array1.length && j < array2.length) {
            if (Math.abs(array1[i] - array2[j]) < minDif) {
                minDif = Math.abs(array1[i] - array2[j]);
                result[0] = array1[i];
                result[1] = array2[j];
            }

            if (array1[i] < array2[j]){
                i++;
                counter++;
            } else{
                j++;
                counter++;
            }

        }
        System.out.println("length of Iteration for Complexity = " + counter);
      
        return result;
    }

}
