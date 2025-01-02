public class MethodChaining {
    public static void main(String[] args) {

        // Method chaining - a common syntax for invoking multiple method class in oop. condense code into less lines.

        String name = "     bro";

        // Instead of doing all of this you can write it all in one line
//        name = name.concat("    code   ");
//        name = name.toUpperCase();
//        name.trim(); // This method removes all blank spaces before and after the string.

        name = name.concat(" code   ").toUpperCase().trim();
        System.out.println(name);
    }
}
