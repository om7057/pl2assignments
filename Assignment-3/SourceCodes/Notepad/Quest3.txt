public class Outer {
    private static int staticOuterVar = 10;
    private int nonStaticOuterVar = 20;

    static class StaticInner {
        void accessOuterStatic() {
            System.out.println("Accessing outer static variable from static inner class: " + staticOuterVar);
        }
    }

    class NonStaticInner {
        void accessOuterNonStatic() {
            System.out.println("Accessing outer static variable from non-static inner class: " + staticOuterVar);
            System.out.println("Accessing outer non-static variable from non-static inner class: " + nonStaticOuterVar);
        }
    }

    public static void main(String[] args) {
        Outer.StaticInner staticInner = new Outer.StaticInner();
        staticInner.accessOuterStatic();

        Outer outer = new Outer();
        Outer.NonStaticInner nonStaticInner = outer.new NonStaticInner();
        nonStaticInner.accessOuterNonStatic();
    }
}
