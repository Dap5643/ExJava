import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //ex100
        int ar1[] = new int[]{1, 2, 3, 4, 8};
        int ar2[] = new int[]{1, 4, 4, 6, 9};
        System.out.println("Array 1:" + Arrays.toString(ar1));
        System.out.println("Array 2:" + Arrays.toString(ar2));
        int cntr = 0;
        for (int i = 0; i < ar1.length; i++) {
            if (Math.abs(ar1[i] - ar2[i]) <= 1 && ar1[i] != ar2[i]) {
                cntr++;
            }
        }
        System.out.println(cntr);
    }
    }
