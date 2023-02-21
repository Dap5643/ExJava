package Primele20Exercitii;

import java.util.Scanner;

public class Ex112 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Given number:");
        Integer givenNumber = sc.nextInt();
        Integer factorial = 1;
        Integer cntr = 1;
        for(int i = 1; i <= givenNumber; i++){
            factorial = factorial * i;
        }
        while(factorial % ((int)Math.pow(10,cntr)) == 0) {
            cntr++;
        }
        cntr--;
        System.out.println("Number of 0 : " + cntr);

    }
}
