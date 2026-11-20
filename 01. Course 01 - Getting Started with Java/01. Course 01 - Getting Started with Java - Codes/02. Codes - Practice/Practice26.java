public class Practice26 {

    public static void main(String[] args) {
        
        int planetNumber = 7;

        // Convert the planetNumber integer to a double using casting.
        double planetNumberInDouble = planetNumber;
        
        // Convert the new double to a String
        String planetNumberStr = Double.toString(planetNumberInDouble);
        
        // Printing out the String value after conversion.
        System.out.println("In our galaxy, the planet count is: " + planetNumberStr);

    }
    
}