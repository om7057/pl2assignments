import useful.Useme;

public class Quest8 {
    public static void main(String[] args) {
        double length = 5;
        double breadth = 4;
        double area = Useme.area(length, breadth);
        System.out.println("Area of rectangle: " + area);

        double totalMarks = 500;
        double obtainedMarks = 450;
        double percentage = Useme.percentage(totalMarks, obtainedMarks);
        System.out.println("Percentage obtained: " + percentage);
    }
}
