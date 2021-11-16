public class phraseGenerator {
    public static void main (String [] args) {
        //declaring sets (lists) of words
        String [] lOne = {"круглосуточный", "с 8 до 12", "с 8 до 17", "трех-звенный", "на основе веб-технологий", "умный", "шесть"};
        String [] lTwo = {"уполномоченный", "кластеризованный", "ориентированный", "использованный с выгодой", "динамичный", "статичный", "разноплановый"};
        String [] lThree = {"пункт следования", "процесс", "талант", "обзор"};

        //determine the lenght of each list
        int oneLenght = lOne.length;
        int twoLenght = lTwo.length;
        int threeLenght = lThree.length;

        //generate three random numbers
        int random1 = (int) (Math.random() * oneLenght);
        int random2 = (int) (Math.random() * twoLenght);
        int random3 = (int) (Math.random() * threeLenght);

        //building the final phrase and display it on the screen
        String finalPhrase = lOne[random1] + " " + lTwo[random2] + " " + lThree[random3];
        System.out.println ("Требуется: " + finalPhrase);
    }
}
