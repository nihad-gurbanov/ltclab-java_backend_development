package lesson3;

public class ME2 {
    public static void main(String[] args) {
        int randInt = (int) (Math.random() * 100);

        if (randInt % 2 == 0) {
            System.out.println(randInt + " is even");
        } else {
            System.out.println(randInt + " is odd");
        }
    }
}
