package Cele10Exercitii;

import java.util.Scanner;

public class Ex160 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of array :");
        Integer size = sc.nextInt();
        Integer[][] array = new Integer[size][size];
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++) {
                System.out.println("Give number :");
                array[i][j] = sc.nextInt();
            }
        System.out.print(minim(array, size) + " ");
        delete(array, size);
        System.out.print(minim(array, size) + " ");
        delete(array, size);
        System.out.print(minim(array, size));
        delete(array, size);
    }

    public static Integer minim(Integer[][] array, Integer size) {
        Integer min = array[0][0];
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                if (min > array[i][j])
                    min = array[i][j];
        return min;
    }

    public static void delete(Integer[][] array, Integer size) {
        Integer min = minim(array, size);
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                if (array[i][j] == min)
                    array[i][j] = array[i][j]*(1000);
    }
}
