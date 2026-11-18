public class DataTypes {

    public static void main(String[] args) {

        // 01. Integer Data Types
        int daysInWeek = 7;
        System.out.println(daysInWeek);

        int maximalInteger = 2147483647;
        System.out.println(maximalInteger);  // This will print: 2147483647

        // int tooBigInteger = 2147483648; // Oops! Error, the number is too large

        // 02. Floating Point Data Types
        float pi = 3.1415926f;
        System.out.println(pi);

        // 03. Boolean Data Type
        boolean isEarthRound = true;
        System.out.println(isEarthRound);
        boolean isEarthFlat = false;
        System.out.println(isEarthFlat);

        // 04. Char Data Type
        char firstLetterOfAlphabet = 'A'; // A character is always surrounded by single quotes
        System.out.println(firstLetterOfAlphabet); // This will print: A

        // 05. String
        String welcome = "Welcome to Java!";
        System.out.println(welcome); // This will print: Welcome to Java!

        // 06. null Value
        String unknown = null;
        System.out.println(unknown);  // This will print: null

    }

}