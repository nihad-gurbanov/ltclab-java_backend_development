package lesson13.Product;

public class CPU extends Product{
    protected int cores;
    protected double clockSpeed;

    public CPU(String brand, String model, int cores, double clockSpeed) {
        super(brand, model);
        this.cores = cores;
        this.clockSpeed = clockSpeed;
    }

    public String process() {
        return cores + " cores, " + clockSpeed + " Ghz";
    }

}