import java.util.Scanner;

public class Hypotenuse {
    public static Scanner in = new Scanner (System.in);
    public static void main (String [] args) {
        int a,b;
        System.out.println ("Введите длины катетов треугольника");
        a = in.nextInt();
        b = in.nextInt();
        System.out.println ("Длина гипотенузы");
        System.out.println (Math.sqrt(a*a+b*b));
    }
}
