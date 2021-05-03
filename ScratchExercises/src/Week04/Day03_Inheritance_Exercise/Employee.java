package Week04.Day03_Inheritance_Exercise;

public class Employee {

    private long employeeId;
    private String employeeName;
    private String employeeAddress;
    private long employeePhone;
    private double basicSalary;
    private double specialAllowance;
    private double hra;

    public Employee() {

        specialAllowance = 250.80;
        hra = 1000.50;

    }

    public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone) {

        this();
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;

    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public long getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(long employeePhone) {
        this.employeePhone = employeePhone;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getSpecialAllowance() {
        return specialAllowance;
    }

    public void setSpecialAllowance(double specialAllowance) {
        this.specialAllowance = specialAllowance;
    }

    public double getHra() {
        return hra;
    }

    public void setHra(double hra) {
        hra = hra;
    }

    public double calculateSalary() {

        double salary;

        salary = basicSalary + ( basicSalary * specialAllowance / 100) + (basicSalary * hra/100);

        return salary;

    }

    public double calculateTransportAllowance() {

        double transportAllowance;

        transportAllowance = 10/100.0 * basicSalary;

        return transportAllowance;
    }

}
