public class ArithmeticAndLogicalOperators {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        // Arithmetic Operators
        int a = 10;
        int b = 2;

        System.out.println(a + b); // Outputs: 12
        System.out.println(a - b); // Outputs: 8
        System.out.println(a * b); // Outputs: 20
        System.out.println(a / b); // Outputs: 5
        System.out.println(a % b); // Outputs: 0

        // Logical Operators
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println(false && false); // false

        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || true); // true
        System.out.println(false || false); // false

        System.out.println(!true); // false
        System.out.println(!false); // true

        // Usage of Logical Operators
        int speed = 60;
        int minSpeed = 30;
        int maxSpeed = 70;

        System.out.println(speed > minSpeed && speed < maxSpeed); // Prints: true

        // Integer Overflow Scenario
        int maxInt = Integer.MAX_VALUE; // the maximal integer, equals to 2^31 - 1
        int overflow = maxInt + 1; // causes an overflow, there is no integer after the maximal one.
        System.out.println(overflow); // Prints: -2147483648, which is -2^31 - the minimal integer number

    }

}