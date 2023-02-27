package Cele10Exercitii;

import java.util.Scanner;

public class Ex163 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give number :");
        Integer number = sc.nextInt();
        String binaryNumber = Integer.toBinaryString(number);
        System.out.println("Number " + number + " in bytes :" + binaryNumber);
        int cntr = 0;
        for(char chr : binaryNumber.toCharArray()) {
            cntr += chr == '0' ? 1 : 0;
        }
        System.out.println("Zeros : " + cntr);
    }
}
