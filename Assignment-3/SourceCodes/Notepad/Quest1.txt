import java.util.Scanner;

public class Sphere {
    static double radius;

    public static double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }

    public static double calculateVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the sphere: ");
        radius = scanner.nextDouble();

        double area = calculateArea();
        double volume = calculateVolume();

        System.out.println("Area of the sphere: " + area);
        System.out.println("Volume of the sphere: " + volume);

        scanner.close();
    }
}
