package lesson13.Product;

public class GPU extends Product{
    int vRam;

    public GPU(String brand, String model, int vRam) {
        super(brand, model);
        this.vRam = vRam;
    }

    public String render() {
        return vRam + " GB vRam";
    }
}
