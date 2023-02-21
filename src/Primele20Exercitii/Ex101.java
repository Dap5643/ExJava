package Primele20Exercitii;

import java.util.Arrays;

public class Ex101 {
    public static void main(String[] args){
        int ar3[] = new int[]{10, 13, 34, 20, 10, 43};
        System.out.println("Array 3:" + Arrays.toString(ar3));
        int cntr10 = 0;
        int cntr20 = 0;
        for(int i = 0; i < ar3.length; i++){
            if(ar3[i] == 10)
                cntr10++;
            else if (ar3[i] == 20)
                cntr20++;
        }
        if(cntr10 > cntr20)
            System.out.println("the number of 10 is greater than number to 20");
        else System.out.println("the number of 10 is not greater than number to 20");
    }
}
