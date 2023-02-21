package Primele20Exercitii;

import java.util.Scanner;

public class Ex107 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("n=");
        int n = sc.nextInt();
        int array[] = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Array[" + i + "]=");
            array[i]=sc.nextInt();
        }
        int cntr = 0;
        for(int i = 0; i < array.length - 3; i++){
            if(array[i+1] == array[i] + 1 && array[i+2] == array[i+1] + 1 && array[i+3] == array[i+2] + 1)
                cntr++;
        }
        if(cntr != 0)
            System.out.println("an array of integers contains three increasing adjacent numbers");
        else System.out.println("NO");
    }
}
