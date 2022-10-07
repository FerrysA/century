
import java.util.Scanner;// библ для ввода с клавиатуры


public class Main {
    public static int century(int number) {
        // your code goes here
        int a = (number-1)/100+1;



        return a;

    }

    private static Scanner inn = new Scanner(System.in);// метод для ввода с клавиатуры

    public static <string> void main(String[] args) {

        System.out.println( century(1601));



    }
}
