package allowance;

import emp.Employee;

public class Allowance extends Employee {
    private double allowanceAmount;

    public Allowance(String departmentName, String employeeName, double allowanceAmount) {
        super(departmentName, employeeName);
        this.allowanceAmount = allowanceAmount;
    }

    public void displayAllowance() {
        System.out.println("Allowance for employee " + employeeName + ": $" + allowanceAmount);
    }
}
