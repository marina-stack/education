import java.util.Scanner;

public class Quadratic_equation {
    public static Scanner in = new Scanner(System.in);
    public static void main (String [] args) {
        System.out.println ("Введите коэффиценты a,b,c");
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        double x1, x2, D;
        D = b*b-4*a*c;
        if (D==0) {
            System.out.println ("Уравнение имеет один корень");
            x1 = -b/(2*a);
            System.out.println (x1);
        }
        else if (D>0) {
            System.out.println ("Уравнение имеет два корня");
            x1 = (-b+Math.sqrt(D))/(2*a);
            x2 = (-b-Math.sqrt(D))/(2*a);
            System.out.println (x1);
            System.out.println (x2);
        }
        else {
            System.out.println ("Корней нет");
        }
    }
}
