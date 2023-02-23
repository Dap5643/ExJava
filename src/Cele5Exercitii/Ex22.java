package Cele5Exercitii;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number :");
        Integer givenNumber = sc.nextInt();
        Boolean verify = true;
        while(givenNumber != 0){
            if(givenNumber % 2 == 0)
                givenNumber = givenNumber / 10;
            else {
                verify = false;
                break;
            }
        }
        System.out.println(verify);
    }
}
