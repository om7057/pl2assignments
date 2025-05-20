import java.util.Scanner;

class Student {
    String prn;
    String name;
    int age;

    public Student(String prn, String name, int age) {
        this.prn = prn;
        this.name = name;
        this.age = age;
    }
}

class UGStudent extends Student {
    int semester;
    double fees;

    public UGStudent(String prn, String name, int age, int semester, double fees) {
        super(prn, name, age);
        this.semester = semester;
        this.fees = fees;
    }
}

class PGStudent extends Student {
    int semester;
    double stipend;

    public PGStudent(String prn, String name, int age, int semester, double stipend) {
        super(prn, name, age);
        this.semester = semester;
        this.stipend = stipend;
    }
}

public class Quest9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UGStudent[] ugStudents = new UGStudent[5];
        System.out.println("Enter details for UG students:");
        for (int i = 0; i < 5; i++) {
            System.out.println("UG Student " + (i + 1) + ":");
            System.out.print("PRN: ");
            String prn = scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Semester: ");
            int semester = scanner.nextInt();
            System.out.print("Fees: ");
            double fees = scanner.nextDouble();
            scanner.nextLine();
            ugStudents[i] = new UGStudent(prn, name, age, semester, fees);
            if (i == 4) {
                break;
            }
        }

        PGStudent[] pgStudents = new PGStudent[5];
        System.out.println("\nEnter details for PG students:");
        for (int i = 0; i < 5; i++) {
            System.out.println("PG Student " + (i + 1) + ":");
            System.out.print("PRN: ");
            String prn = scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Semester: ");
            int semester = scanner.nextInt();
            System.out.print("Stipend: ");
            double stipend = scanner.nextDouble();
            scanner.nextLine();
            pgStudents[i] = new PGStudent(prn, name, age, semester, stipend);
            if (i == 4) {
                break;
            }
        }

        scanner.close();

        double totalAgeUG = 0;
        for (UGStudent student : ugStudents) {
            totalAgeUG += student.age;
        }
        double avgAgeUG = totalAgeUG / ugStudents.length;
        System.out.println("\nAverage age of UG students: " + avgAgeUG);

        double totalAgePG = 0;
        for (PGStudent student : pgStudents) {
            totalAgePG += student.age;
        }
        double avgAgePG = totalAgePG / pgStudents.length;
        System.out.println("Average age of PG students: " + avgAgePG);
    }
}
