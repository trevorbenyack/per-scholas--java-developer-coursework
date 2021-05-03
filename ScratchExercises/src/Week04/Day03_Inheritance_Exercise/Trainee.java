package Week04.Day03_Inheritance_Exercise;

public class Trainee extends Employee {

        public Trainee(long employeeId,
                       String employeeName,
                       String employeeAddress,
                       long employeePhone,
                       double salary) {

            super(employeeId, employeeName, employeeAddress, employeePhone);
            this.setBasicSalary(salary);

        }
}
