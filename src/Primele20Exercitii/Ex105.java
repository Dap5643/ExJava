package Primele20Exercitii;

import java.util.Scanner;

public class Ex105 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("n=");
        int n = sc.nextInt();
        int array[] = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Array[" + i + "]=");
            array[i]=sc.nextInt();
        }
        System.out.println("Group of numbers=");
        int l = sc.nextInt();
        int cond = 1;
        for(int i = 0; i < l - 1; i++){
                if(array[i] != array[array.length  - l + i]) {
                    cond = 0;
                }
            }
        if(cond == 1)
            System.out.println(" group of numbers (l) at the start and end of a given array are same.");
        else System.out.println( "group of numbers (l) at the start and end of a given array are NOT same.");
    }
}
