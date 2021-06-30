import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main (String [] args) {
        System.out.println ("Введите два числа");
        int a = in.nextInt(), b = in.nextInt();
        System.out.println ("Введите знак операции");
        char sign = in.next().charAt(0);
        if (sign == '+') {
            System.out.print (a+b);
        }
        else if (sign == '-') {
            System.out.print (a-b);
        }
        else if (sign == '*') {
            System.out.print (a*b);
        }
        else if (sign == '/') {
            System.out.print (a/b);
        }
        else {
            System.out.println ("Введен неверный знак");
        }
    }
}
