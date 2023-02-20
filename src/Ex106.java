import java.util.Arrays;
import java.util.Scanner;

public class Ex106 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("n=");
        int n = sc.nextInt();
        int array[] = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Array[" + i + "]=");
            array[i]=sc.nextInt();
        }
        int newar[] = new int[n];
        for(int i = 0; i < n - 1; i++) {
            newar[i] = array[i + 1];
        }
        newar[n-1] = array[0];
        System.out.println(Arrays.toString(newar));
    }
}
