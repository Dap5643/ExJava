package Cele5Exercitii;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a string :");
        String givenString = sc.next();
        givenString.toLowerCase();
        String vowels = "aeiou";
        int cntr = 0;
        for(int i = 0; i < givenString.length(); i++){
            if(vowels.indexOf(givenString.charAt(i)) != -1){
                cntr++;
            }
        }
        if(cntr == givenString.length())
            System.out.println("Only vowels");
        else System.out.println("NOT only vowels");
    }
}
