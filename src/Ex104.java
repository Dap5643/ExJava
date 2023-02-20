import java.util.Arrays;

public class Ex104 {
    public static void main(String[] args){
        int array[] = new int[]{2, 4, 10, 23, 22, 10, 6, 7};
        int[] newar;
        int j = array.length - 1;
        while(array[j]!=10)
            j--;
        newar = new int[j];
        for(int i = 0; i < j; i++)
            newar[i]=array[i];
        System.out.println("New array:" + Arrays.toString(newar));
    }
}
