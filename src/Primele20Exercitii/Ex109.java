package Primele20Exercitii;

import java.util.Scanner;

public class Ex109 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of coins:");
        Integer numberOfCoins = sc.nextInt();
        if(numberOfCoins > 0)
            System.out.println("Number of rows: "+((int)((Math.sqrt(8 * (long)numberOfCoins + 1) - 1) / 2)));
    }
}
