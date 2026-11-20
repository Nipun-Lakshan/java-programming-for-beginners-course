public class TypeConversion {

    public static void main(String[] args) {

        // 01. Implicit Type Conversion (Widening Conversion)
        int i = 10; // an integer
        double d = i; // automatic conversion to double

        System.out.println("The value of d: " + d); // Output: The value of d: 10.0

        // 02. Explicit Type Conversion (Narrowing Conversion)
        d = 10.25; // a double number
        i = (int) d; // casting the double to int

        System.out.println("The value of i: " + i); // Output: The value of i: 10

        int ten = 10; // an integer with value 10
        String tenString = Integer.toString(ten); // A string with value "10"
        System.out.println("The value of tenString: " + tenString); // Output: The value of tenString: 10

        // 03. String to Integer Conversion
        String twentyFiveString = "25";
        int twentyFive = Integer.parseInt(twentyFiveString);
        System.out.println("The value of twentyFive: " + twentyFive); // Output: The value of twentyFive: 25

        // String invalidNumber = "25abc";
        // int number = Integer.parseInt(invalidNumber); // Oops! This will throw an error, "25abc" is not a number!
    }

}