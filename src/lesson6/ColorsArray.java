package lesson6;

public class ColorsArray {
    public static void main(String[] args) {

        /*
        Declare and initialize an array to hold the colors of the rainbow.
        Use a for-each loop to print out each color.
        */
        String[] colorsArray = {
                "Red",
                "Orange",
                "Yellow",
                "Green",
                "Blue",
                "Indigo",
                "Violet"
        };
        int num = 0;
        for(String color: colorsArray) {
            num+=1;
            System.out.println("Color " + num + " " + color);
        }
    }
}
