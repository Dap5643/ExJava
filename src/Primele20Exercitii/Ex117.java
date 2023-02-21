package Primele20Exercitii;

import java.util.Scanner;

public class Ex117 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number :");
        Integer givenNumber = sc.nextInt();
        System.out.println("Root : " + Math.sqrt(givenNumber.doubleValue()));
    }
}
