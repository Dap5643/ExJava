package Primele20Exercitii;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex119 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> array = new ArrayList<>();
        System.out.println("Length array :");
        Integer lengthArray = sc.nextInt();
        System.out.println("Array");
        for(int i = 0; i < lengthArray; i++){
            System.out.println("Give number :");
            Integer number = sc.nextInt();
            array.add(number);
        }
        System.out.println("Searched number :");
        Integer searchedNumber = sc.nextInt();
        Boolean isTrue = Boolean.FALSE;
        for(int i = 0; i < lengthArray; i++){
            if(array.get(i) == searchedNumber) {
                System.out.println("number found at position " + i);
                isTrue = Boolean.TRUE;
                break;
            }
        }
        if(isTrue == Boolean.FALSE)
            System.out.println("number not found");
    }
}
