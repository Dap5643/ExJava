package Primele20Exercitii;

import java.util.Scanner;

public class Ex110 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Given number=");
        Integer givenNumber = sc.nextInt();
        Integer powerOfFour = 1;
        while(givenNumber > powerOfFour){
            powerOfFour = powerOfFour * 4;
            if(givenNumber == powerOfFour)
                System.out.println(givenNumber + " is power of 4");
        }
        if(givenNumber != powerOfFour)
            System.out.println(givenNumber + " is NOT power of 4");
    }
}
