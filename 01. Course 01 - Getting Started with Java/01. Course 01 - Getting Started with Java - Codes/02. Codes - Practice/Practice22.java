public class Practice22 {

    public static void main(String[] args) {
        
        // Declare and initialize variables for fuel capacity, consumption and flight duration
        int fuelCapacity = 1500; // in gallons
        int consumption = 120; // in gallons per hour
        int flightDuration = 2; // in hours

        // Calculate the remaining fuel after the flight
        int remainingFuelCapacity = (fuelCapacity - (consumption * flightDuration));

        // Use a logical operation to determine if the remaining fuel is more than half of the fuel capacity
        boolean isHalfOfFuelRemained = (remainingFuelCapacity >= (fuelCapacity / 2));

        // Print out the result in a format
        System.out.println("Enough fuel for the next journey? " + isHalfOfFuelRemained);
        
    }

}