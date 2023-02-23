package Cele5Exercitii;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("First number :");
        Integer firstnumber = sc.nextInt();
        System.out.println("Second number :");
        Integer secondNumber = sc.nextInt();
        System.out.println("Third number :");
        Integer thirdNumber = sc.nextInt();
        System.out.println("One number is mid point? " + ex19(firstnumber, secondNumber, thirdNumber));
    }
    public static boolean ex19(Integer number1, Integer number2, Integer number3){
        Integer max = 0;
        Integer min = 0;
        max = Math.max(number1, Math.max(number2, number3));
        min = Math.min(number1, Math.min(number2, number3));
        Integer mid_point1 = (max + min) / 2;
        Integer min_point2 = (number1 + number2 + number3 - max - min);
        return (mid_point1 == min_point2);
    }
}
