package a7smallesDifference.cydeo;


import java.util.Arrays;

public class BruteForce {


    public static void main(String[] args) {

        int[] first = {-1, 5, 10, 20, 28, 3};
        int[] second = {26, 134, 135, 15, 17};
        System.out.println("Arrays.toString(smallDifference(first, second)) = " + Arrays.toString(smallDifference(first, second)));
    }

    public static int[] smallDifference(int[] first, int[] second) {


        int[] result = new int[2];
        int index1 = 0;
        int index2 = 0;
        int smallestDifference = Math.abs(first[0] - second[0]);
        System.out.println(Math.abs(-5-5));
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if (Math.abs(first[i] - second[j]) < smallestDifference) {
                    smallestDifference = Math.abs(first[i] - second[j]);
                    index1=i;
                    index2 = j;
                }
            }

        }
        result[0] = first[index1];
        result[1] = second[index2];
        return result;
    }

    public static int[] smallestDifferenceBruteForce(int[] array1, int[] array2){
        int[] output = new int[2];
        int min = Integer.MAX_VALUE;
        for (int i : array1) {
            for (int j : array2) {
                if (Math.abs(i - j) < min) {
                    min = Math.abs(i - j);
                    output[0] = i;
                    output[1] = j;
                    if(min == 0) break;
                }
            }
        }
        return output;
    }

}
