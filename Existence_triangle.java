import java.util.Scanner;

public class Existence_triangle {
    public static Scanner in = new Scanner (System.in);
    public static void main (String [] args) {
        System.out.println ("Введите длины сторон");
        int a = in.nextInt(), b = in.nextInt(), c=in.nextInt(), s = 0;
        if ((a+b>c) & (b+c>a) & (c+a>b)) {
            System.out.println("Такой треугольник существует");
            s = s+1;

        }
        else {
            System.out.println ("Такого треугольника не существует");
        }

        while (s == 1) {
            if ((a==b) & (b==c) & (c==a)) {
                System.out.println ("Треугольника равносторонний");
            }
            else if ((a!=b) & (b!=c) & (c!=a)) {
                System.out.println("Треугольник разностроронний");
            }
            else {
                System.out.println("Треугольник равнобедренный");
            }
            break;
        }

    }
}
