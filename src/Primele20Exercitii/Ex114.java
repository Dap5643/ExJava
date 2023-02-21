package Primele20Exercitii;

import java.util.Scanner;

public class Ex114 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Offset :");
        Integer offset = sc.nextInt();
        System.out.println("String :");
        String str = sc.next();
        str = str.substring(offset - 1, str.length()) + str.substring(0, offset - 1);
        System.out.println(str);
    }
}
