package Week04.Day03_Inheritance_Exercise;

import java.util.ArrayList;

public class InheritanceActivity {

    public static void main(String[] args) {

        Manager mng = new Manager(126534,
                "Peter",
                "Chennai India",
                237844,
                65000);

        System.out.println("Manager Salary is $" + mng.calculateSalary());

        Trainee trainee = new Trainee(29846,
                "Jack",
                "Mumbai India",
                442085,
                45000);

        System.out.println("Trainee Salary is $" + trainee.calculateSalary());

        System.out.println("Manager transport allowance is $" + mng.calculateTransportAllowance());
        System.out.println("Trainee transport allowance is $" + trainee.calculateTransportAllowance());

        ArrayList<Integer> intList = new ArrayList<>();
        ArrayList<ArrayList<String>> twoDimStringList = new ArrayList<>();
        ArrayList<Object> twoDimObjectList = new ArrayList<>();
        twoDimObjectList.add("first element");
        twoDimObjectList.add(3);

        System.out.println(twoDimObjectList.toString());

    }
}
