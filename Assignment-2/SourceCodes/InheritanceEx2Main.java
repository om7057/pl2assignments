import dept.Department;
import emp.Employee;
import allowance.Allowance;

public class InheritanceEx2Main {
    public static void main(String[] args) {
        Department department = new Department("Finance");
        department.displayDepartment();

         Employee employee = new Employee("Finance", "Sergio Marquina");
        employee.displayEmployee();

        Allowance allowance = new Allowance("Finance", "Sergio Marquina", 500);
        allowance.displayAllowance();
    }
}
