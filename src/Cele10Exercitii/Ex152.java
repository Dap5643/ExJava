package Cele10Exercitii;

import java.util.Scanner;

public class Ex152 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("First number :");
        Integer firstNum = sc.nextInt();
        System.out.println("Second number :");
        Integer secondNum = sc.nextInt();
        System.out.println("Third number :");
        Integer thirdNum = sc.nextInt();
        System.out.println("Fourth number :");
        Integer fourthNum = sc.nextInt();
        if(firstNum.equals(secondNum) && firstNum.equals(thirdNum) && firstNum.equals(fourthNum) && secondNum.equals(thirdNum) && secondNum.equals(fourthNum) && thirdNum.equals(fourthNum))
            System.out.println("All numbers are equal");
        else System.out.println("Numbers not equal");
    }
}
