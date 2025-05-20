package dept;

public class Department {
    protected String departmentName;

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public void displayDepartment() {
        System.out.println("Department: " + departmentName);
    }
}
