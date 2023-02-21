package Primele20Exercitii;

public class Ex116 {
    public static void main(String[] args){
        for(int i = 0; i <= 100; i++)
            if(i % 5 == 0 && i % 3 == 0)
                System.out.println("fizz buzz " + i);
        else if (i % 3 == 0)
                System.out.println("buzz " + i);
            else if(i % 5 == 0)
                System.out.println("fizz " + i);
    }
}
