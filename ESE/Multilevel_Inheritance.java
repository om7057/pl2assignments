// Class A
class A {
    public int publicVarA = 10;
    protected int protectedVarA = 20;
    int defaultVarA = 30;
    private int privateVarA = 40;

    public void publicMethodA() {
        System.out.println("Public method in Class A");
    }

    protected void protectedMethodA() {
        System.out.println("Protected method in Class A");
    }

    void defaultMethodA() {
        System.out.println("Default method in Class A");
    }

    private void privateMethodA() {
        System.out.println("Private method in Class A");
    }
}

// Class B extends A
class B extends A {
    public int publicVarB = 50;
    protected int protectedVarB = 60;
    int defaultVarB = 70;
    private int privateVarB = 80;

    public void publicMethodB() {
        System.out.println("Public method in Class B");
    }

    protected void protectedMethodB() {
        System.out.println("Protected method in Class B");
    }

    void defaultMethodB() {
        System.out.println("Default method in Class B");
    }

    private void privateMethodB() {
        System.out.println("Private method in Class B");
    }
}

// Class C extends B
class C extends B {
    public int publicVarC = 90;
    protected int protectedVarC = 100;
    int defaultVarC = 110;
    private int privateVarC = 120;

    public void publicMethodC() {
        System.out.println("Public method in Class C");
    }

    protected void protectedMethodC() {
        System.out.println("Protected method in Class C");
    }

    void defaultMethodC() {
        System.out.println("Default method in Class C");
    }

    private void privateMethodC() {
        System.out.println("Private method in Class C");
    }
}

public class Multilevel_Inheritance {
    public static void main(String[] args) {
        C obj = new C();

        // Accessing members and methods of Class A
        System.out.println("Accessing members and methods of Class A:");
        System.out.println("Public variable in A: " + obj.publicVarA);
        System.out.println("Protected variable in A: " + obj.protectedVarA);
        System.out.println("Default variable in A: " + obj.defaultVarA);
        // Private members of Class A are not accessible in Class C

        obj.publicMethodA();
        obj.protectedMethodA();
        obj.defaultMethodA();
        // Private methods of Class A are not accessible in Class C

        // Accessing members and methods of Class B
        System.out.println("\nAccessing members and methods of Class B:");
        System.out.println("Public variable in B: " + obj.publicVarB);
        System.out.println("Protected variable in B: " + obj.protectedVarB);
        System.out.println("Default variable in B: " + obj.defaultVarB);
        // Private members of Class B are not accessible in Class C

        obj.publicMethodB();
        obj.protectedMethodB();
        obj.defaultMethodB();
        // Private methods of Class B are not accessible in Class C

        // Accessing members and methods of Class C
        System.out.println("\nAccessing members and methods of Class C:");
        System.out.println("Public variable in C: " + obj.publicVarC);
        System.out.println("Protected variable in C: " + obj.protectedVarC);
        System.out.println("Default variable in C: " + obj.defaultVarC);
        // Private members of Class C are not accessible outside Class C

        obj.publicMethodC();
        obj.protectedMethodC();
        obj.defaultMethodC();
        // Private methods of Class C are not accessible outside Class C
    }
}
