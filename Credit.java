import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main (String [] args) {
        int s,m; double x;
        System.out.println ("Введите сумму заема");
        int n = in.nextInt();
        System.out.println ("Введите срок заема");
        int y = in.nextInt();
        System.out.println ("Введите процент заема");
        double p = in.nextDouble();

        p = (p/100);
        System.out.println(p);
        x=Math.pow((1+p),y);
        m= (int) ((n*p*x)/((12*x)-1));
        System.out.printf("Мсячные выплаты по кредиту: %d", m);
        System.out.println();

        s=(m*12)*y;
        System.out.printf("Суммарная выплата по кредиту: %d", s);
