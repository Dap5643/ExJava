package Cele5Exercitii;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number");
        Integer givenNumber = sc.nextInt();
        ex21(givenNumber);
    }
    public static void ex21(Integer number){
        while(number % 3 == 0) {
                System.out.print("3 * ");
                number = number / 3;
            }
        System.out.print(number);
    }
}
