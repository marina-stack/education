import java.util.Random;

public class Main {
    public static void main (String [] args) {
        Random rndm = new Random();
        int even_num = rndm.nextInt()*2;
        int odd_num =(rndm.nextInt()*2)-1;
        System.out.printf ("Нечетное число: %d", odd_num);
        System.out.println ();
        System.out.printf ("Четное число: %d", even_num);
    }
}
