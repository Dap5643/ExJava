package Primele20Exercitii;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex111 {
    public static void main(String[] args){
        int x, y ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number: ");
        x = sc.nextInt();
        System.out.print("Input second number: ");
        y = sc.nextInt();
        while(y != 0){
            int carry = x & y;
            System.out.println(carry);
            x = x ^ y;
            y = carry << 1;
            System.out.println(y);
        }
        System.out.print("Sum: "+ x);
        System.out.print("\n");
    }
}
