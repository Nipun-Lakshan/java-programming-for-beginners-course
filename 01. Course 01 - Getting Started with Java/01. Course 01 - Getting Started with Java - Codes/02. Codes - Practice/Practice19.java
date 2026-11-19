public class Practice19 {

    public static void main(String[] args) {

        // Define the maximum integer value
        int maxIntVal = Integer.MAX_VALUE;
        System.out.println(maxIntVal);

        // Add 10 to the maximum value to demonstrate overflow
        int result = maxIntVal + 10;

        // Observe the unexpected result due to overflow
        System.out.println(result); // What will this print?

    }
    
}