package Cele10Exercitii;

import java.util.Scanner;

public class Ex159 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of array :");
        Integer size = sc.nextInt();
        Integer[][] array = new Integer[size][size];
        for(int i = 0; i < size; i++)
            for(int j = 0; j < size; j++){
                System.out.println("Give number :");
                array[i][j] = sc.nextInt();
            }
        System.out.print(maxim(array, size) + " ");
        delete(array, size);
        System.out.print(maxim(array, size) + " ");
        delete(array, size);
        System.out.print(maxim(array, size));
        delete(array, size);
    }
    public static Integer maxim(Integer[][] array, Integer size){
        Integer max = 0;
        for(int i = 0; i < size; i++)
            for(int j = 0; j < size; j++)
                if(array[i][j] > max)
                    max = array[i][j];
        return max;
    }
    public static void delete(Integer[][] array, Integer size){
        Integer max = maxim(array, size);
        for(int i = 0; i < size; i++)
            for(int j = 0; j < size; j++)
                if(array[i][j] == max)
                    array[i][j] = 0;
    }
}
