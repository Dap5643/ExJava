package Cele10Exercitii;

import java.util.Arrays;
import java.util.Scanner;

public class Ex167 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of array :");
        Integer size = sc.nextInt();
        Integer array[] = new Integer[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Give element :");
            array[i] = sc.nextInt();
        }
        Boolean flag = true;
        while(flag){
            flag = false;
            for (int i = 0; i < size - 1; i++)
                if(array[i] == 0 && array[i + 1] != 0) {
                    swap(array, i, i + 1);
                    flag = true;
                }
        }

        System.out.println("New array:" + Arrays.toString(array));
    }

    public static void swap(Integer[] array, Integer indexOne, Integer indexTwo){
        Integer aux = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = aux;
    }

}
