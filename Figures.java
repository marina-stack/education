import java.util.Scanner;

public class Figures {
    public static Scanner in = new Scanner(System.in);
    public static void main (String [] args) {
        System.out.println ("Введите стороны треугольника");
        triangle P = new triangle();
        P.a = in.nextDouble();
        P.b = in.nextDouble();
        P.c = in.nextDouble();
        P.displayInfo();

        System.out.println ("Введите стороны прямоугольника");
        rectangle S = new rectangle();
        S.a = in.nextInt();
        S.b = in.nextInt();
        S.displayInfo();

        System.out.println ("Введите радиус круга");
        circle R = new circle();
        R.r = in.nextDouble();
        R.displayInfo();
    }
}

class triangle {
    double a, b, c;
    void displayInfo () {
        System.out.println ("Периметр треугольника");
        System.out.println (a+b+c);
        System.out.println ("Площадь треугольника");
        System.out.println (Math.sqrt(((a+b+c)/2)*((a+b+c)/2-a)*((a+b+c)/2-b)*((a+b+c)/2-c)));
    }
}

class rectangle {
    int a,b;
    void displayInfo () {
        System.out.println ("Перимерт треугольника");
        System.out.println (2*(a+b));
        System.out.println ("Площадь прямоугольника");
        System.out.println (a*b);
    }
}

class circle {
    double r;
    void displayInfo () {
        System.out.println ("Площадь круга");
        System.out.println (Math.PI*2*r);
        System.out.println ("Периметр круга");
        System.out.println (Math.PI*r*r);
    }
}
