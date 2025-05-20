public class Declaration {
    public static void main(String[] args) {
        String strLiteral = "Hello, World!";
        System.out.println("String using String literal: " + strLiteral);

        String strNew = new String("Hello, World!");
        System.out.println("String using new keyword: " + strNew);

        boolean areEqual = strLiteral.equals(strNew);
        System.out.println("Are the strings equal? " + areEqual);
    }
}
