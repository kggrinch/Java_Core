public class SwitchCases {
    public static void main(String[] args) {

        // Switch - A switch is a statement that allows a variable to be tested for equality against a list of values.
        //          It is good to use when you find yourself using a lot of if statements.

        // Switch works with the following data types - byte, short, char, and int.
        // It also works with enum types such as - Character, Byte, Short, Integer, and String.

        String day = "Pizza";

        switch(day)
        {
            // Checks if the day variable is "Sunday"
            case "Sunday" :
                System.out.println("It is Sunday"); // If it is true executes the print statement. if false moves on.
                break; // Breaks out of the switch operation if the boolean is true.

            case "Monday" :
                System.out.println("It is Monday");
                break; // If we remove the break then once the case finds a match it will execute all the print
                    // after the case. So if it's monday, monday will print then tuesday and so on.

            case "Tuesday" :
                System.out.println("It is Tuesday");
                break;

            case "Wednesday" :
                System.out.println("It is Wednesday");
                break;

            case "Thursday" :
                System.out.println("It is Thursday");
                break;

            case "Friday" :
                System.out.println("It is Friday");
                break;

            case "Saturday" :
                System.out.println("It is Saturday");
                break;

            // This is a default case if all the other cases are not found.
            default:
                System.out.println("That is not a day of the week");
        }

    }
}
