import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner (System.in);
    public static void main (String [] args) {
        System.out.println ("Введите число");
        int a = in.nextInt(), even =  0, odd = 0, x = 0;
        while (a>0) {
            x = a % 10;
            if (x % 2 == 0) {
                even = even+1;
            }
            else {
                odd = odd+1;
            }
            a = a / 10;
        }
        System.out.printf ("Четных чисел: %d, Нечетных чисел: %d", even, odd);
    }
}
