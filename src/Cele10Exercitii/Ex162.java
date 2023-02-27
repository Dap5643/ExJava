package Cele10Exercitii;

import java.util.Scanner;

public class Ex162 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of array :");
        Integer size = sc.nextInt();
        Integer[] array = new Integer[size];
        for(int i = 0; i < size; i++){
            System.out.println("Give element :");
            array[i] = sc.nextInt();
        }
        Double avg = average(array, size);
        avg.intValue();
        System.out.println("Average : " + avg);
        System.out.println("Numbers greater than average :");
        for(int i = 0; i < size; i++)
            if(array[i] > avg)
                System.out.println(array[i]);
    }
    public static Double average(Integer[] array, Integer size){
        Double avg = 0.0;
        Integer sum = 0;
        for(int i = 0; i < size; i++)
            sum = sum + array[i];
        avg = sum.doubleValue() / size;
        return avg;
    }

}
