package a7smallesDifference.Vitaly;

import org.w3c.dom.ls.LSOutput;

public class app {
    public static void main(String[] args) {
        int [] arr1 = {9, 10,200,33,48,59};
        int [] arr2 = {1000,1,100};
        System.out.println(SmallestDifBF.findSmallestDifBF(arr1,arr2)[0]);
        System.out.println(SmallestDifBF.findSmallestDifBF(arr1,arr2)[1]);

    }
}
