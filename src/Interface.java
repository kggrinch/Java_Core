public class Interface {
    public static void main(String[] args)
    {
        // Interface - A template that can be applied to a class.
        //             Similar to inheritance, but specifies what a class has/must do.
        //             Classes can apply more than one interface, inheritance is limited to 1 parent class.
        //             The classes must use the implements keyword when using an interface.

        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt(); // Cant use flee() method since does not implement prey interface.

        Fish fish = new Fish();
        fish.flee();
        fish.hunt();
    }
}

// Prey Interface
interface Prey
{
    void flee();
}

// Predator Interface
interface Predator
{
    void hunt();
}

// Implements the Prey interface
class Rabbit implements Prey
{
    @Override
    public void flee()
    {
        System.out.println("The rabbit is fleeing");
    }
}

// Implements both the prey and predator interfaces
class Fish implements Predator, Prey
{
    @Override
    public void hunt()
    {
        System.out.println("The fish is hunting smaller fish");
    }
    @Override
    public void flee()
    {
        System.out.println("The fish is fleeing from bigger fish");
    }

}

// Implements the predator interface.
class Hawk implements Predator
{

    @Override
    public void hunt()
    {
        System.out.println("The hawk is hunting");
    }
}