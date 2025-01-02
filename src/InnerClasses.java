public class InnerClasses {
    public static void main(String[] args) {

        // Inner class - An inner class is a class inside another class.
        //               Useful if a class should be limited in scope.
        //               Usually private, but not necessary.
        //               Help group classes that belong together.
        //               Extremely useful for listeners for specific events.
        //               Precursor for anonymous inner classes.

        Outside out = new Outside();
        Outside.Inside in = out.new Inside();
        System.out.println(out.x + in.y);

        in.Greeting(); // Using methods in the inner class

    }
}


class Outside
{
    String x = "Hello ";

    class Inside
    {
        String y = "World!";

        public void Greeting()
        {
            System.out.println(x+y);
        }
    }

}