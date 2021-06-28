import java.util.Random;

public class Random_num {
    public static void main (String [] args) {
        Random random = new Random ();
        int i = random.nextInt();
        System.out.println (i);
        float y = random.nextFloat();
        System.out.println (y);
        char c = (char) ('a' + random.nextInt(26));
        System.out.println (c);
    }
}
