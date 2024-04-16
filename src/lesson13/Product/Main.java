package lesson13.Product;

public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU("Intel", "i7", 24, 3.7);
        GPU gpu = new GPU("NVIDIA", "3060", 8);

        Laptop asusTuf = new Laptop("Asus", "Tuf", cpu, gpu);

        System.out.println(asusTuf.start());

    }
}
