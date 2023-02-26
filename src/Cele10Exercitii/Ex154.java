package Cele10Exercitii;

import java.util.Scanner;

public class Ex154 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Boolean [][] array = new Boolean[3][3];
        System.out.println("Array elements");
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++) {
                System.out.println("Give element");
                array[i][j] = sc.nextBoolean();
            }
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j].compareTo(true) == 0)
                    System.out.print("t");
                else System.out.print("f");
            }
            System.out.println();
        }

    }
}
