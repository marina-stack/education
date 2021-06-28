import java.util.Scanner;

public class Sum {
    public static Scanner in = new Scanner (System.in);
    public static void main (String [] args) {
        int x,a,b,c;
        System.out.println ("Введите трехзначное число");
        x = in.nextInt();
        a = x / 100;
        c = x % 10;
        b = x /10 % 10;
        System.out.println (a+b+c);

    }
}
