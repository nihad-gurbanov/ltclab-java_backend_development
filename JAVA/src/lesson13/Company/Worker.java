package lesson13.Company;

public class Worker {
    String name;
    String birthDate;
    String endOfContract;

    public Worker(String name, String birthDate, String endOfContract) {
        this.name = name;
        this.birthDate = birthDate;
        this.endOfContract = endOfContract;
    }

    public String retire() {
        return this.name + " retired!";
    }
}
