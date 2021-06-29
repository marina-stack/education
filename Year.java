import java.util.Scanner;

public class Year {
    public static Scanner in = new Scanner (System.in);
    public static void main (String [] args) {
        System.out.println ("Введите год");
        int year = in.nextInt();
        if (year % 4 !=0) {
            System.out.println ("Год не високосный");
        }
        else if ((year % 100 ==0) & (year % 400 == 0)) {
            System.out.println ("Год високосный");
        }
        else if (year % 100 == 0){
            System.out.println ("Год високосный");
        }
        else {
            System.out.println ("Год не високосный");
        }
    }
}
