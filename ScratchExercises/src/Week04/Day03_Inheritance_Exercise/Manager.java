package Week04.Day03_Inheritance_Exercise;

public class Manager extends Employee {

    public Manager(long employeeId,
                   String employeeName,
                   String employeeAddress,
                   long employeePhone,
                   double salary) {

        super(employeeId, employeeName, employeeAddress, employeePhone);
        this.setBasicSalary(salary);

    }

    @Override
    public double calculateTransportAllowance() {

        double transportAllowance;

        transportAllowance = 15/100.0 * this.getBasicSalary();

        return transportAllowance;

    }
}
