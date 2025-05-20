package emp;

import dept.Department;

public class Employee extends Department {
    protected String employeeName;

    public Employee(String departmentName, String employeeName) {
        super(departmentName);
        this.employeeName = employeeName;
    }

    public void displayEmployee() {
        System.out.println("Employee: " + employeeName);
    }
}
