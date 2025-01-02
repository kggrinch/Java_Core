public class Inheritance {
    public static void main(String[] args)
    {
        // Inheritance - The process where one parent class allows other subclasses to acquire the attributes and
        //               methods from the parent class.
        //               The subclasses must use the extends keyword when using inheritance.

        Car car = new Car();
        System.out.print("car.go(): "); car.go(); // Inherits method from vehicle class
        System.out.println("car.speed: " + car.speed); // Inherits attributes from vehicle class
        System.out.println("car.doors: " + car.doors); // Can use its own attributes and methods.
//      car.pedals;                                    // Cannot use attributes and methods from other subclasses.


        Bicycle bicycle = new Bicycle();
        System.out.print("bicycle.go(): "); bicycle.go(); // Inherits method from vehicle class
        System.out.println("bicycle.speed: " + bicycle.speed); // Inherits attributes from vehicle class
        System.out.println("bicycle.pedals: " + bicycle.pedals); // Can use its own attributes and methods.
//      bicycle.doors;                                     // Cannot use attributes and methods from other subclasses.
    }
}

// Parent Class
class Vehicle {
    double speed;
    void go()
    {
        System.out.println("This vehicle is moving");
    }
    void stop()
    {
        System.out.println("This vehicle is stopped");
    }
}

// Child Class
class Car extends Vehicle {
    int wheels = 4;
    int doors = 4;
}
// Child Class
class Bicycle extends Vehicle {
    int wheels = 2;
    int pedals = 2;
}


