import java.util.Scanner;

public class Polymorphism {
    public static void main(String[] args)
    {
        // Polymorphism - greek word for poly-"many", morph - "form" many shapes/forms.
        //                The ability of an object to identify as more than one type.

        Cat cat = new Cat();
        Dog dog = new Dog();
        Bird bird = new Bird();

//      Cat[] racers = {cat, dog, bird}; This is an issue because dog and bird are not cat.
        Animal[] racers = {cat, dog, bird}; // Correct way since cat, dog, and bird are Animal. (polymorphism)

        // Using a for each loop to go through the array of Animal call the go method from each Animal class.
        for(Animal animals : racers) {
            animals.go();
        }

        // Dynamic Polymorphism example - Using polymorphism after compilation (during runtime)
        Scanner scanner = new Scanner(System.in);
        Animal animal; // Saves memory for an animal but does not instantiate it.

        System.out.println("What Animal do you want?");
        System.out.println("(Dog = 1) or (Cat = 2) or (Bird = 3)");
        int choice = scanner.nextInt();


        if(choice == 1)
        {
            animal = new Dog(); // If Choice is 1 instantiates animal to be dog during runtime
            animal.speak();
        }
        else if(choice == 2)
        {
            animal = new Cat(); // If Choice is 2 instantiates animal to be cat during runtime
            animal.speak();
        }
        else if (choice == 3)
        {
            animal = new Bird(); // If Choice is 3 instantiates animal to be bird during runtime
            animal.speak();
        }
        else
        {
            animal = new Animal(); // If Choice is other than 1,2,3 instantiates animal to be animal during runtime
            System.out.println("Invalid Choice");
            animal.speak();
        }
    }
}

// Parent Class
class Animal {
    void go()
    {

    }
    void speak()
    {
        System.out.println("Animal makes sound!");
    }
}
// Child Class
class Cat extends Animal {
    @Override // This is method overriding so that when the go method is called in the parent class the subclass
             // overrides it and calls the method in its own class.
    void go()
    {
        System.out.println("Cat is running");
    }
    @Override
    void speak()
    {
        System.out.println("Meow!");
    }
}
// Child Class
class Dog extends Animal {
    @Override
    void go()
    {
        System.out.println("Dog is running");
    }
    @Override
    void speak()
    {
        System.out.println("Bark!");
    }
}
// Child Class
class Bird extends Animal {
    @Override
    void go()
    {
        System.out.println("Bird is flying");
    }
    @Override
    void speak()
    {
        System.out.println("Chirp!");
    }
}
