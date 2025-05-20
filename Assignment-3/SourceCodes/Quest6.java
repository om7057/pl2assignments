abstract class AbstractClass {
    AbstractClass() {
        System.out.println("This is constructor of abstract class");
    }

    abstract void a_method();

    void normalMethod() {
        System.out.println("This is a normal method of abstract class");
    }
}

class SubClass extends AbstractClass {
    void a_method() {
        System.out.println("This is abstract method");
    }
}

public class Quest6 {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.a_method();
        obj.normalMethod();
    }
}
