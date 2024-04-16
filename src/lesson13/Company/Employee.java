package lesson13.Company;

public class Employee extends Worker{
    long employeeId;
    String hireDate;

    public Employee(String name, String birthDate, String endOfContract, long employeeId, String hireDate) {
        super(name, birthDate, endOfContract);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }
}
