package a7smallesDifference.jose;

import java.util.Arrays;

public class SmallestDifference {

//    Question # 2
//    Difficulty: Medium Category: Arrays Description:
//    Smallest Difference
//    Write a function that takes in two non-empty arrays of integers, finds the pair of numbers (one from each array)
//    whose absolute difference is closest to zero, and returns an array containing these two numbers,
//    with the number from the first array in the first position.
//    Note that the absolute difference between two integers is the distance between them on the real number line.
//    For example, the absolute difference between -5 and 5 is 10, and the absolute difference of -5 and -4 is 1.
//    You can assume that there will only be one pair of numbers with the smallest difference.
//
//    Sample Input
//    arrayOne = [-1, 5, 10, 20, 28, 3] arrayTwo = [26, 134, 135, 15, 17]
//
//    Sample Output
//    [28, 26]


    public static void main(String[] args) {
        int[] arrayOne = {-1, 5, 10, 20, 28, 3};
        int[] arrayTwo = {26, 134, 135, 15, 17};

        System.out.println(Arrays.toString(minimumAbsoluteDifference(arrayOne,arrayTwo)));

    }


    public static int[] minimumAbsoluteDifference(int[] a, int[] b) {
        // First define norm
        // Calculate norm between all elements in array 1 and 2
        // Compare always with the minimum founded

        int[] result = new int[2];
        boolean found = false;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {

                if (norm(a[i],b[j]) < norm(result[0],result[1]) || !found){
                   found=true;
                   result[0]=a[i];
                   result[1]=b[j];
                }
            }
        }
        return result;
    }

    public static int norm(int a, int b){
        return Math.abs(a-b);
    }


}