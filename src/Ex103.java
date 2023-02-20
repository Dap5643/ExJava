import java.util.Arrays;

public class Ex103 {
    public static void main(String[] args){
        int ar5[] = new int[]{1, 10, 2, 3, 10, 4, 33, 44, 23};
        int j = ar5.length - 1;
        int[] newAr;
        while(ar5[j] != 10)
            j--;
        newAr = new int[ar5.length - 1 - j];
        for(int i = j+1; i< ar5.length; i++)
            newAr[i - j - 1] = ar5[i];

        System.out.println("New array:" + Arrays.toString(newAr));

    }
}
