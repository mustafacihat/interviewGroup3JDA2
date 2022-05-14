package a7smallesDifference.Vitaly;

public class SmallestDifBF {


    public static int[] findSmallestDifBF(int [] arr1, int [] arr2){
        int ind1 = 0;
        int ind2 =0 ;
        int min = Math.abs (arr1[0]-arr2[0]);//replace with abs max

        for (int i = 0; i< arr1.length;i++){
            for (int j = 0 ; j < arr2.length;j++){
                int dif = Math.abs (arr1[i]-arr2[j]);
                if (dif<min) {
                    min = dif;
                    ind1 = i;
                    ind2 = j;
                }
            }
        }



        int[] result = {ind1,ind2};

        return result;
    }
}
