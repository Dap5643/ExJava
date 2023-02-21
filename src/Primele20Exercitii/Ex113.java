package Primele20Exercitii;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex113 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> array1 = new ArrayList<>();
        List<Integer> array2 = new ArrayList<>();
        List<Integer> newArray = new ArrayList<>();
        int sizeArray1;
        System.out.println("Size of array  1:");
        sizeArray1 = sc.nextInt();
        int sizeArray2;
        System.out.println("Size array 2:");
        sizeArray2 = sc.nextInt();
        System.out.println("Numbers for array 1");
        for(int i = 0; i < sizeArray1; i++){
            System.out.println("Give number:");
            Integer number = sc.nextInt();
            array1.add(number);
        }
        System.out.println("Numbers for array 2");
        for(int i = 0; i < sizeArray2; i++){
            System.out.println("Give number:");
            Integer number = sc.nextInt();
            array2.add(number);
        }
        newArray.addAll(array1);
        newArray.addAll(array2);
        for(int i = 0; i < newArray.size() ; i++)
            for(int j = 0; j < newArray.size() - i - 1; j++){
                if(newArray.get(j) > newArray.get(j + 1)) {
                Integer aux = newArray.get(j);
                newArray.set(j, newArray.get(j+1));
                newArray.set(j + 1, aux);
                }
            }
        System.out.println("New array : " + newArray.toString());
    }
}
