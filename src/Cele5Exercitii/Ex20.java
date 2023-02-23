package Cele5Exercitii;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number :");
        Integer givenNumber = sc.nextInt();
        ex21(givenNumber);
    }
    public static void ex21(Integer number){
        Integer lastDigit = 0;
        while(number != 0){
            lastDigit = number % 10;
            number = number / 10;
        }
        System.out.println(lastDigit);;
    }
}
