public class ComparisonOperators {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        int spaceshipSpeed = 20000; // speed in mph
        int asteroidSpeed = 15000; // speed in mph
        System.out.println("Is spaceship faster than an asteroid? " + (spaceshipSpeed > asteroidSpeed));

        int currentFuelLevel = 90; // current fuel level in %
        int requiredFuelLevel = 100; // required fuel level in %

        boolean isEnoughFuel = currentFuelLevel == requiredFuelLevel; // this results in 'false'
        boolean isFuelLow = currentFuelLevel != requiredFuelLevel; // this results in 'true'

        int distanceToPlanetA = 5000; // distance in kms
        int distanceToPlanetB = 3000; // distance in kms

        boolean isACloser = distanceToPlanetA < distanceToPlanetB; // this results in 'false'
        boolean isBCloserOrSame = distanceToPlanetA >= distanceToPlanetB; // this results in 'true'

    }

}