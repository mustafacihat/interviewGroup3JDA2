package a2arrayOfProducts.bahrom;

import java.util.Arrays;

//Brute Force solution

public class ArrayOfProducts {

    public static void main(String[] args) {

        int[] arrayInput = {5,1,4,2};

        System.out.println(Arrays.toString(arrayNew(arrayInput)));
    }

    public static int[] arrayNew (int[] arrayInput) {
        int[] arrayOutcome = new int[arrayInput.length];

        for (int i = 0; i < arrayInput.length; i++) {
            int number = 1; // here initiating as 1 to mitigate the issue with 0. If we initiate as 0 multiplication will be always 0

            for (int j = 0; j < arrayInput.length; j++) {
                if(i==j){
                    continue;
                }
                number = number*arrayInput[j];

            } arrayOutcome[i] = number;

        }return arrayOutcome;
    }

}
