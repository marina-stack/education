import java.util.Scanner;

public class Coordinate_quarter {
    public static Scanner in = new Scanner (System.in);
    public static void main (String [] args) {
        int [] point = new int [2];
        System.out.println ("Введите координаты точки");
        for (int i = 0; i<2; i++) {
            point [i] = in.nextInt();
        }
        int x=point[0], y=point[1];
        if ((x>0) & (y>0)) {
            System.out.println ("Точка принадлежит I координатной плоскости");
        }
        else if ((x<0) & (y>0)) {
            System.out.println ("Точка принадлежит II координатной плоскости");
        }
        else if ((x<0) & (y<0)) {
            System.out.println ("Точка принадлежит III координатной плоскости");
        }
        else {
            System.out.println ("Точка принадлежит IV координатной плоскости");
        }
    }
}
