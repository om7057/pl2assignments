public class ConstructorExample {
    

    public ConstructorExample() {
        System.out.println("Default Constructor");
    }

    public ConstructorExample(int value) {
        System.out.println("Parameterized Constructor 1 with value: " + value);
    }

    public ConstructorExample(String message) {
        System.out.println("Parameterized Constructor 2 with message: " + message);
    }

    public ConstructorExample(ConstructorExample other) {
        System.out.println("Copy Constructor with message: " + other.getMessage());
    }

    public String getMessage() {
        return "Hello from another instance!";
    }

    public static void main(String[] args) {
ConstructorExample defaultConstructor = new ConstructorExample();
        ConstructorExample paramConstructor1 = new ConstructorExample(42);
        ConstructorExample paramConstructor2 = new ConstructorExample("Hello, Constructors!");
        ConstructorExample copyConstructor = new ConstructorExample(paramConstructor2);

        
        System.out.println(copyConstructor.getMessage());
    }
}