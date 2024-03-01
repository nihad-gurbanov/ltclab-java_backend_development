package lesson5;

public class NFibonacci {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        System.out.print(num1 + " ");
        System.out.print(num2 + " ");
        for (int i = 2; i < 10; i++) {
            int nextNum = num1 + num2;
            System.out.print(nextNum + " "); // 0, 1, 1, 2, 3, 5, 8
            num1 = num2;
            num2 = nextNum;
        }
    }
}