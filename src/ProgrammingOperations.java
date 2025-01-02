public class ProgrammingOperations {
    public static void main(String[] args)
    {

        // Division with integers
        int x = 3542 / 10; // In a regular division operation the answer would be 354.2, but since this is integer
        System.out.println(x); // division the reminder would always get removed so x = 354.

        int y = 5 / 10; // Regular division answer = 0.5
        System.out.println(y); // Integer division answer = 0

        // Modulus
        int k = 3542 % 10; // In modulus operation you are returning the remainder of the divided number. Ex:
                          // [5 % 2 = 1], since 5 / 2 will equal 4 with a remainder of 1.
        System.out.println(k); // Returns 2 since 3542 / 10 = 354 with a remainder of 2.

        

    }
}
