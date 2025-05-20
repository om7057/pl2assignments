public class Quest10 {
    public static void main(String[] args) {
        Child1 child1 = new Child1();
        Child2 child2 = new Child2();

        System.out.println("Accessing public members:");
        child1.publicMethod();
        child2.publicMethod();
        
        System.out.println("\nAccessing protected members:");
        child1.protectedMethod();
        child2.protectedMethod();

       
        System.out.println("\nAccessing default members:");
        child1.defaultMethod(); 
        child2.defaultMethod(); 
    }
}

class Parent {
    public void publicMethod() {
        System.out.println("Public method of Parent class");
    }

    protected void protectedMethod() {
        System.out.println("Protected method of Parent class");
    }

    protected void defaultMethod() { 
        System.out.println("Default method of Parent class");
    }
}

class Child1 extends Parent {
}

class Child2 extends Parent {
    
}
