package a9twoJoggers.Vitaly;

public class TwoJoggers {

    public static void main(String[] args) {
        numOfLaps(6,4);
    }

    public static int[] numOfLaps(int lenA, int lenB){

        int max = Math.max(lenA,lenB);
        int min = Math.min(lenA,lenB);
        int x = 1;

        while(x*max%min!=0){
            x++;
        }
        int y = max*x/min;
//        System.out.println("A = " + x);
//        System.out.println("B = " + y);
        int[] arr = {x,y};
        return arr;

    }
}
