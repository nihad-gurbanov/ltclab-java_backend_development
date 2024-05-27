package lesson7;

public class AsteriskArray {
    public static void main(String[] args) {
        int outerLength = 4;
        int innerLength = 5;

        char[][] twoDimArray = new char[outerLength][innerLength];

        for (int i = 0; i < outerLength; i++) {
            for (int j = 0; j < innerLength; j++) {
                twoDimArray[i][j] = '*';
            }
        }

        for (int i = 0; i < outerLength; i++) {
            for (int j = 0; j < innerLength; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
