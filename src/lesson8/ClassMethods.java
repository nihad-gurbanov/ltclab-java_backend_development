package lesson8;


public class ClassMethods {
     /*Create a method that takes two integers as parameters and
     returns their sum.*/
    public static int add(int a, int b) {
        return a + b;
    }
     /*Implement a method that takes a string and an integer and
     returns a new string repeated that many times.*/
    public static String productString(String a, int b) {
        StringBuilder product = new StringBuilder(); // String product = "";
        for (int i = 0; i < b; i++) {
            product.append(a); // product += a;
        }
        return product.toString();
    }
    /*Develop a method that accepts an array of doubles and
    returns the average value.*/
    public static double arrayAvg(double[] a) {
        double sum = 0;
        for(double number: a) {
            sum += number;
        }
        double avg;
        avg = sum / a.length;
        return avg;
    }

    /*Write a method that takes an integer as input and returns
    true if it's even, false otherwise.*/
        public static boolean isEven(int a) {
            return a % 2 == 0;
        }
    public static void main(String[] args) {
        System.out.println(add(3, 5));
        System.out.println(productString("Apple", 3));

        double[] array1 = {5, 8, 2};
        System.out.println(arrayAvg(array1));
        System.out.println(isEven(5));
        System.out.println(isEven(8));
    }
}
