package lesson8;

public class PackerMain {
    public static void main(String[] args) {
        Packer packer1 = new Packer();

        System.out.println(packer1.canPack(1, 0, 4));
        System.out.println(packer1.canPack(1, 0, 5));
        System.out.println(packer1.canPack(0, 5, 4));
        System.out.println(packer1.canPack(2, 2, 11));
        System.out.println(packer1.canPack(-3, 2, 12));


    }
}
