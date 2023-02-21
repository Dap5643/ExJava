package Primele20Exercitii;

import java.util.Scanner;

public class Ex118 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a string :");
        String givenString = sc.next();
        System.out.println("Searching string :");
        String searchedString = sc.next();
        Boolean isTrue = givenString.contains(searchedString);
        System.out.println(isTrue);
    }
}
