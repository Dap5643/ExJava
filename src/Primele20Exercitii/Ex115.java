package Primele20Exercitii;

import java.util.Scanner;

public class Ex115 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Given number :");
        String givenNumber =sc.next();
        String reversedNumber = new String();
        for(int i = 0; i < givenNumber.length(); i++){
            Character aux;
            aux = givenNumber.charAt(i);
            reversedNumber = aux.toString() + reversedNumber;
        }
            if(givenNumber.compareTo(reversedNumber) == 0)
                System.out.println("Palindrome");
            else System.out.println("Not Palindrome");
        }
    }

