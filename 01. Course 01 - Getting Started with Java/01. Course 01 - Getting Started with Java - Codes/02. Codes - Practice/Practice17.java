public class Practice17 {

    public static void main(String[] args) {

        // Assign the distance to the Moon (384400 kilometers) to a variable
        int distanceToTheMoon = 384400; // in Kms

        // Assign the distance to Mars (225000000 kilometers) to another variable
        int distanceToMars = 225000000; // in Kms

        // Compare the distance to the Moon to see if it's less than 1 million
        // kilometers
        boolean canSpaceCraftReachMoon = distanceToTheMoon < 1000000;

        // Check if the distance to Mars is greater than the distance to the Moon
        boolean compareDistanceToMarsWithMoon = distanceToMars > distanceToTheMoon;

        // Print results of these two comparisons to the console
        System.out.println("Is the distance to the Moon is less than 1 million kilometers? " + canSpaceCraftReachMoon);
        System.out.println(
                "Is the distance to Mars is greater than distance to the Moon? " + compareDistanceToMarsWithMoon);

    }

}