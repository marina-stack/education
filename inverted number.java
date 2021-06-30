import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner (System.in);
    public static void main (String [] args) {
        System.out.println ("Введите число");
        int x = in.nextInt(), y=0, s=0;
        while (x>0) {
            s=x%10;
            x=x/10;
            y=(y*10)+s;
        }
        System.out.printf("Перевернутое чичло: %d", y);
    }
}
