interface College {
    String collegeName = "WCE Sangli";
}

class Teacher {
    String name;
    String qualification;

    public Teacher(String name, String qualification) {
        this.name = name;
        this.qualification = qualification;
    }
}

class Department extends Teacher {
    int deptNo;
    String deptName;

    public Department(String name, String qualification, int deptNo, String deptName) {
        super(name, qualification);
        this.deptNo = deptNo;
        this.deptName = deptName;
    }

    public void displayDepartmentInfo() {
        System.out.println("Department Information:");
        System.out.println("College Name: " + College.collegeName);
        System.out.println("Teacher Name: " + name);
        System.out.println("Teacher Qualification: " + qualification);
        System.out.println("Department Number: " + deptNo);
        System.out.println("Department Name: " + deptName);
    }
}

public class Quest11 {
    public static void main(String[] args) {
        Department department = new Department("Sergio Marquina", "PhD", 101, "Computer Science");
        department.displayDepartmentInfo();
    }
}
