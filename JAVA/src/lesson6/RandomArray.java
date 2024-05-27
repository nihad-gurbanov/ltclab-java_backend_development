package lesson6;

public class RandomArray {
    public static void main(String[] args) {
        /*Generate 10 random numbers and store in an array.
        Print the largest number*/

        int[] randomArray = new int[10];

        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * 10);
            randomArray[i] = random;
        }
        int largest = randomArray[0];
        System.out.print("{");
        for (int i = 0; i < randomArray.length; i++) {
            System.out.print(randomArray[i]);
            if (i < randomArray.length - 1) {
                System.out.print(", ");
            }
            if (randomArray[i] > largest) {
                largest = randomArray[i];
            }
        }
        System.out.println("}");

        System.out.println("Largest number: " + largest);
    }
}
