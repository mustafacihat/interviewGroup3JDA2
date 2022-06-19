package a10subtractArray.math;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

public class SubstractArray {
    public static void main(String[] args) {
        int  a[] = {1,2,2,2,2,4,5};
        int  b[] = {1,2,3};

        System.out.println(Arrays.toString(subArr(a,b)));

    }

    public static int[] subArr(int[] a,int[] b){

        List<Integer> alist= new ArrayList<>();
        List<Integer> blist= new ArrayList<>();
        for (int i : a) {
            alist.add(i);
        }

        for (int i : b) {
           blist.add(i);
        }

        alist.removeAll(blist);

        int[] res = new int[alist.size()];
        for(int i = 0; i<alist.size(); i++){
            res[i] = alist.get(i);
        }

        return res;
    }
}
