public class CheckArray {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 25, 20, 30, 40};

        boolean hasTen = false;
        boolean hasTwentyLater = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 10) {
                hasTen = true;
            }

            if (hasTen && numbers[i] == 20) {
                hasTwentyLater = true;
                break; 
            }
        }

        if (hasTen && hasTwentyLater) {
            System.out.println("The array contains 10 followed by 20.");
        } else {
            System.out.println("The array does not meet the criteria.");
        }
    }
}
