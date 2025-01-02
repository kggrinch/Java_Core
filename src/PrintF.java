public class PrintF {
    public static void main(String[] args) {

        // Printf() - An optional method to control, format, and display text to the console window.
        //            Two arguments = format string + (object/variable/value)
        //            % [flags] [width] [precision] [conversion-character]

        System.out.println("[Printf Example]");
        System.out.printf("This is a format string %+10.2f",123.000000);

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;

        // [conversion-character]
        System.out.print("\n\n[conversion-character]");

        System.out.printf("\n%b",myBoolean); // Boolean conversion-character = %b
        System.out.printf("\n%c",myChar); // Character conversion-character = %c
        System.out.printf("\n%s",myString); // String conversion-character = %s
        System.out.printf("\n%d",myInt); // Integer conversion-character = %d
        System.out.printf("\n%f",myDouble); // Double conversion-character = %f



        // [width] - Minimum number of character to be written as output
        System.out.println("\n\n[width]");

        System.out.printf("Hello %10s",myString);
        System.out.printf("\nHello %-10s",myString);

        // [precision] - Sets number of digits of precision when outputting floating-point values.
        System.out.println("\n\n[precision]");
        System.out.printf("You have this much money %f ", myDouble); // Default
        System.out.printf("\nYou have this much money %.2f ", myDouble); // With precision

        // [flag] - Adds an effect to output based on the flag added to format specifier.
        // - : left-justify
        // + : output a plus ( + ) or minus ( - ) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000
        System.out.println("\n\n[flag]");
        System.out.printf("You have this much money %-20f ", myDouble);
        System.out.printf("\nYou have this much money %20f ", myDouble);

        myDouble = -1000;
        System.out.printf("\nYou have this much money %+f ", myDouble);
        System.out.printf("\nYou have this much money %020f ", myDouble);
        System.out.printf("\nYou have this much money %,f ", myDouble);


    }
}