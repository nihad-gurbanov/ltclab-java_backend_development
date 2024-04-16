package lesson13.Product;

public class Laptop extends Product {
    CPU cpu;
    GPU gpu;

    public Laptop(String brand, String model, CPU cpu, GPU gpu) {
        super(brand, model);
        this.cpu = cpu;
        this.gpu = gpu;
    }

    public String start() {
        return "Starting " + this.getInfo() + " with " + cpu.process() + ", " + gpu.render();
    }
}
