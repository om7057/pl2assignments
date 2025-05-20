public class SpeedChecker {
    final static int SPEED_LIMIT = 100;

    public static void main(String[] args) {
        int speed = 120;

        if (speed > SPEED_LIMIT) {
            System.out.println("Alert: Speed limit exceeded! Your speed is " + speed + " km/h, which is higher than the speed limit of " + SPEED_LIMIT + " km/h.");
        } else {
            System.out.println("You are within the speed limit. Drive safely.");
        }
    }
}
