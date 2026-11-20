public class Practice23 {

    public static void main(String[] args) {

        double spaceshipSpeedInKmph = 12450.5; // Spaceship speed in kilometers per hour
        int spaceshipSpeedInSum = (int) (spaceshipSpeedInKmph / 60); // Explicitly casting to int

        System.out.println("Spaceship speed converted to space-units per minute: " + spaceshipSpeedInSum);

    }

}