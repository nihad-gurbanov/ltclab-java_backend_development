package lesson5;

public class Skip13 {
    public static void main(String[] args) {
        for (int i = 6; i <= 16; i++) {
            if (i == 13){
                continue;
            } else {
                System.out.println(i);
            }
        }
    }
}
