import java.util.Scanner;

public class Equation_line {
    public static Scanner in = new Scanner (System.in);
    public static void main (String [] args) {
        int [] t1  = new int [2];
        int [] t2 = new int [2];
        float k, b;
        System.out.println ("Введите координаты первой точки");
        //пройдемся по всему массиву, заполняя его числами с клавиатуры
        for (int i = 0; i < 2; i++) {
            t1[i] = in.nextInt(); //заполняем массив числами с клавиатуры
        }
        System.out.println ("Введите координаты второй точки");
        //пройдемся по всему массиву, заполняя его числами с клавиатуры
        for (int i2 = 0; i2 < 2; i2++) {
            t2[i2] = in.nextInt(); //заполняем массив числами с клавиатуры
        }
        //выводим полученный массив на экран
        //for (int i = 0; i<2; i++) {
        //    System.out.print (" " + t1[i]);
        //}
        float x1=t1[0], y1=t1[1], x2=t2[0], y2=t2[1];
        k = (y1-y2)/(x1-x2);
        b = y2-k*x2;
        System.out.printf ("y=%f*x + %f", k,b);



    }
}
