public class Recursion {
    public static void main(String[] args)
    {
        // Recursion = Apply the result of a procedure, to a procedure. A recursive method calls itself. Can be a
        //             substitute for iteration. Divide a problem into sub-problems of the same type as the
        //             original. Commonly used with advanced sorting algorithms and navigating trees.

        // Advantaged = easier to read/write
        //              easier to debug

        // Disadvantages = sometimes slower
        //                 uses more memory
        //                 can cause stackoverflow if data is too big.

        // Factorial
        System.out.println(factorial(4));

        // Iteration vs Recursion
        // Iteration
        walkIteration(4);

        // Recursion
        walkRecursion(4);

        // Power
        System.out.println(power(2, 8));
    }

    // Factorial recursion
    public static int factorial(int x)
    {
        if(x <= 1) // Base case
            return 1;
        else
            return x * factorial(x-1);
    }

    // Iteration Walk Example
    public static void walkIteration(int steps)
    {
        for(int i = 0; i < steps; i++)
            System.out.println("You take a step");
    }

    // Recursion Walk Example
    public static void walkRecursion(int steps)
    {
        if(steps < 1)
            return;
        System.out.println("You took a step");
        walkRecursion(steps - 1);
    }

    // Power recursion
    public static int power(int base, int exponent)
    {
        if(exponent <= 1)
            return base;
        return base * power(base, exponent-1);
    }

}
