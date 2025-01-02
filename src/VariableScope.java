import java.util.Random;

public class VariableScope {
    public static void main(String[] args) {

        // Local - Declared inside a method. Visible only to that method

        // Global - Declared outside a method, but within a class. Visible to all parts of a class.

        DiceRoller diceRoller = new DiceRoller();
    }
}

class DiceRoller
{
    Random RandomGlobal = new Random(); // global variable
    int numberGlobal; // global variable



    DiceRoller()
    {
        Random randomLocal = new Random(); // local variable
        int numberLocal = 0; // local variable
        roll1(randomLocal, numberLocal); // This is one
    }

    // Since random and number are local variable our roll method cannot access them. Therefore, we need to pass them
    // through the method.
    void roll1(Random random, int number)
    {
        number = random.nextInt(6)+1; // Plus 1 because you get in the range from 0 to 5 when you write nextInt(6)
        System.out.println(number);
    }

    // Another way to solve the issue is by making the random and number variables be global by instantiating them
    // outside the constructor.
    void roll2()
    {
        numberGlobal = RandomGlobal.nextInt(6);
        System.out.println(numberGlobal);
    }
}