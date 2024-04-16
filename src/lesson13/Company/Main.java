package lesson13.Company;

public class Main {
    public static void main(String[] args) {
        HourlyEmployee john = new HourlyEmployee(
                "John",
                "11.12.1994",
                "31.12.2025",
                25485475,
                "01.01.2020",
                65.50);


        SalariedEmployee tom = new SalariedEmployee(
                "Tom",
                "01.12.1994",
                "31.12.2026",
                25485476,
                "01.01.2020",
                125_760);

        System.out.println(tom.getMonthlySalary());
        System.out.println(john.getMonthlySalary());

        System.out.println(john.retire());
    }
}
