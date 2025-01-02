public class Keywords {
    public static void main(String[] args) {
        // Keywords

        // final - Anything that is declared as final cannot be changed or updated later in the program.
        //         It becomes a constant value. For good practice it is good to make the variable name all capitalized.

        // static - modifier, A single copy of a variable/method is created and shared. The class "owns" the static
        //          member.

        // this - is a keyword used to refer to the specific object being worked with.

        // super - keyword refers to the superclass (parent) of an object. Very similar to the "this" keyword.
        //         Used with inheritance.

        // transient - keyword used in serialization to ignore specific fields when serializing an object.
        //             See serialization package to see some examples of usage.



//-----------final------------------------------------------------------------------------------------------------------------------//
        System.out.println("final keyword");
        final double PI = 3.14159;
//      PI = 2; // This causes and exception because you cannot update PI since it is declared final.

        System.out.println("PI: " + PI);



//-----------static------------------------------------------------------------------------------------------------------------------//
        System.out.println("\nstatic keyword");
        System.out.println("Friend.numberOfFriends: " + Friend.numberOfFriends); // You can call the numberOfFriends
                                                                                // variable using the class.

        Friend friend1 = new Friend("Spongebob"); // Creating a friend object
        System.out.println("Friend.numberOfFriends after creating friend object: "
                + Friend.numberOfFriends); // Calling the numberOfFriends variable using the class

        System.out.println("friend1.numberOfFriends " + friend1.numberOfFriends); // You can also call the
                                                                                 // numberOfFriends variable using the
                                                                                // object, but if a variable is
                                                                                // declared static it is best to use
                                                                                // it in a static way and call
                                                                               // it through the class.

        System.out.println("friend1.name " + friend1.name); // This is an example of a non-static variable that
                                                            // must be called through the object.
//      System.out.println(Friend.name); // This causes an exception because name is a non-static variable and cannot
                                         // be called through the class.

        System.out.print("Friend.displayFriends(): ") ;Friend.displayFriends(); // Calling the static displayFriends
                                                                                 // method through the class.

        // A real example of a static method is the round function in a Math class. It doesn't make sense to call a
        // math object (Math math = new Math()). Instead it is more efficient to just call the class and use
        // the function you need.
        Math.round(PI);

//-----------super------------------------------------------------------------------------------------------------------------------//
        System.out.println("\nsuper keyword");

        Hero hero1 = new Hero("Batman", 42, "$$$");
        System.out.println("I am a hero and my name is " + hero1.name + ". I am " + hero1.age + " years old " +
                "and my super power is " + hero1.power + ".");

        Hero hero2 = new Hero("Superman" , 47, "laser eyes");
        System.out.println("\nHero2.toString:\n" + hero2);
        
    }
}



//-----------static------------------------------------------------------------------------------------------------------------------//
class Friend {
    String name;
    static int numberOfFriends; // This makes it so that the whole class owns this variable and so that this
                                // variable is not able to be called through the class.
    Friend(String name)
    {
        this.name = name; // this keyword is used to refer to the specific friend like friend1's name, friends2's name.
        numberOfFriends++;
    }

    static void displayFriends()
    {
        System.out.println("You have " + numberOfFriends + " friends");
    }
}

//-----------super------------------------------------------------------------------------------------------------------------------//
class Hero extends Person{
    String power;
    Hero(String name, int age, String power)
    {
        // Instead of initializing name and age from the Hero class:
//      this.name = name;
//      this.age = age;
        // We can use the super keyword to do that work in our parent class since we're extending the Hero class
        // from the person class:

        super(name, age); // Initialized name and age in the (parent) Person class.
        this.power = power;
    }

    // You can also use the super keyword in calling methods in the parent class.
    public String toString()
    {
        return super.toString() + ", and my power is " + this.power; // The super.toString() calls the toString method
                                                                    // in the parent class.
    }
}


class Person{
    String name;
    int age;
    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String toString()
    {
        return "I am a hero and my name is " + this.name + ". I am " + this.age + " years old";
    }
}