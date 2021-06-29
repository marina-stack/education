import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner (System.in);
    public static void main (String [] args) {
        System.out.println ("Введите три числа");
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        if (((a>c) & (a<b)) || ((a<c) & (a>b))) {
            System.out.printf ("Среднее число: %d", a);
        }
        else if (((b>a) & (b<c)) || ((b<a) & (b>c))){
            System.out.printf ("Среднее число: %d", b);
        }
        else {
            System.out.printf ("Среднее число: %d", c);
        }
    }
}
