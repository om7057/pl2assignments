public class FactorialCalculator {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide exactly one integer as a command-line argument.");
            return;
        }

        int number = Integer.parseInt(args[0]);

        long factorial = calculateFactorial(number);

        if (factorial == -1) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
    }

    private static long calculateFactorial(int n) {
        if (n < 0) {
            return -1;
        }

        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
