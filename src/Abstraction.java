public class Abstraction {
    public static void main(String[] args)
    {
        // abstract - abstract classes cannot be instantiated, but they can have a subclass.
        //            abstract methods are declared without an implementation.
        //            abstract methods do not have a body and must be declared abstract. The method must then be
        //            implemented in the child class.
        //            The subclasses must use the extends keyword.

        // Abstract use case example: Imagine you want to draw a shape, and a person asks you what shape are you going to
        //                            draw? You reply with, I want to draw just a shape. That won't make sense since
        //                            a shape is to generic (abstract), and you have to reply with an actual shape
        //                            like circle, square, ect.
        //                            Therefore, abstraction makes it so that you cannot instantiate something that is
        //                            abstract and doesn't make sense.

//        Shape shape = new Shape; // Cannot instantiate shape.

          Circle circle = new Circle();
          circle.statesShape();

          Shape circle2 = new Circle(); // Abstract with polymorphism.

    }
}

abstract class Shape
{
    abstract void statesShape();
}
class Circle extends Shape
{
    @Override
    void statesShape()
    {
        System.out.println("I am a circle");
    }
}
