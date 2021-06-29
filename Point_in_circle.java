import java.util.Scanner;

public class Point_in_circle {
    public static Scanner in = new Scanner(System.in);
    public static void main (String [] args) {
        int [] point = new int [2];
        int R, x,y;
        double h;
        System.out.println ("Введите координаты точки");
        for (int i=0; i<2; i++) {
            point [i] = in.nextInt();
        }
        System.out.println ("Введите радиус круга");
        R = in.nextInt();
        x = point[0]; y = point [1];
        h = Math.sqrt(x*x+y*y);
        if (h>R) {
            System.out.println ("Точка не принадлежит кругу");
        }
        else {
            System.out.println ("Точка принадлежит кругу");
        }
    }
}
