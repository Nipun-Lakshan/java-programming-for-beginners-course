public class Variables {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        // ### Variables

        int numberOfStars; // We declare a variable akin to opting for a box
        numberOfStars = 88; // We then fill it with a value
        System.out.println(numberOfStars); // Finally, we verify its contents. It outputs: 88

        int numberOfStars1 = 88; // creating and assigning the variable with a value
        System.out.println(numberOfStars1);

        // ### Naming Conventions

        // Correct variable naming
        int myAge = 20;
        int myWeight = 72;
        int district9Population = 10000;

        // Incorrect variable naming (commented intentionally)
        // int 0zero = 0;
        // int ?questionMark = 1;

        // ### Assignment Operations in Java

        int constellations = 88; // We design a box, label it and deposit a value inside
        System.out.println(constellations); // We inspect its contents. It outputs: 88

        constellations = 77; // We change the value of the variable
        System.out.println(constellations); // We inspect the updated contents. It outputs: 77

        // ### Java Constants

        // final dataType CONSTANT_NAME = value;
        final int DAYS_IN_WEEK = 7;
        System.out.println(DAYS_IN_WEEK); // Output: 7

        // DAYS_IN_WEEK = 8; // Compilation Error
    }
}
