package Cele10Exercitii;

import java.util.Scanner;

public class Ex153 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("First number :");
        Double firstNum = sc.nextDouble();
        System.out.println("Second number :");
        Double secondNum = sc.nextDouble();
        if(firstNum < 1 && firstNum > 0 && secondNum < 1 && secondNum > 0)
            System.out.println("true");
        else System.out.println("false");
    }
}
