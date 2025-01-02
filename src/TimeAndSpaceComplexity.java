public class TimeAndSpaceComplexity {
    public static void main(String[] args)
    {
        // Time Complexity - How does algorithm speed scale as input values become larger?

        // O(1) = Constant Time
        //      - random access of an element in an array
        //      - inserting at the beginning of linkedList
        //      - Grade: A - fast
        // As data increases the time stays the same(constant).

        // O(log n) = Logarithmic Time
        //          - binary search
        //          - Grade: B - pretty fast
        // Usually includes splitting n data into halves, such as binary search.

        // O(n) = Linear Time
        //      - looping through elements in an array
        //      - searching through a linkedList
        //      - n tree nodes, or n array elements.
        //      - Grade: C - ok
        // As data increases so does the time increases with data, such as a for loop iterating through an array.

        // O(n log n) = Quasilinear Time
        //            - quicksort
        //            - mergesort
        //            - heapsort
        //            - Grade: D - pretty bad
        // Doing log n work for each n element. Halving each n data, such as mergesort.

        // O(n^2) = Quadratic Time
        //        - insertion sort
        //        - selection sort
        //        - bubble sort
        //        - Grade: F - bad
        // Doing double work for each n elements, such as insertion sort, nested for-loop.

        // O(2^n) = Exponential Time - Could be 3^n, 4^n - (any value)^n
        //        - backtracking problems
        //        - subsets
        //        - recursion
        //        - Grade: F - bad
        // Usually in call stacks and fib recursion. Getting going deep as much as n and, such as fib recursion.

        // O(n!) = Factorial Time
        //       - permutations
        //       - traveling salesman problem
        //       - Grade: F - awful
        // forking data by a multiple n * (n-1) * (n-2)...


        // Space Complexity - How does the space usage scale as input gets larger?
        //                  - What space does the program create? Is it in place?
        //                  - Runtime stack counts unless told otherwise.

        // O(1) = Constant Space
        //      - Grade: A - low space usage

        // O(log n) = Logarithmic Space
        //          - Grade: B - pretty low space usage

        // O(n) = Linear Space
        //      - Grade: C - average space usage

        // O(n log n) = Quasilinear Space
        //            - Grade: D - high space usage

        // O(n^2) = Quadratic Space
        //        - Grade: F - very high space usage

        // O(2^n) = Exponential Space - Could be 3^n, 4^n - (any value)^n
        //        - Grade: F - very high space usage

        // O(n!) = Factorial Space
        //       - Grade: F - extremely high space usage

        // Optimization of algorithms)
        // Questions: When to optimize an algorithm, should you
        // a) reduce Time but increase space usage. Time(v) space(^)
        // b) reduce space usage but increase time. Time(^) space(v)

        // Answer) You can always buy more memory, but you cannot buy more time. So it is almost always better
        // to optimize time.
        









    }
}
