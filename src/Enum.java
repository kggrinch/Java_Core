public class Enum {
    public static void main(String[] args) {

        // Enum - enumerated (ordered listing of items in a collection).
        //        Enums are constants that behave similar to objects and cannot be changed.
        //        Example of Enums: days of the week, months of the year, or planets in the solar system.

        Planet myPlanet = Planet.EARTH;
        habitable(myPlanet);

    }

    private static void habitable(Planet myPlanet)
    {
        switch(myPlanet)
        {
            case EARTH:
                System.out.println("Habitable");
                System.out.println("This is planet number #" + myPlanet.number);
                break;
            default:
                System.out.println("Not Habitable");
                System.out.println("This is planet number #" + myPlanet.number);
                break;
        }
    }
}


enum Planet{
    MERCURY(1),
    VENUS(2),
    EARTH(3),
    MARS(4),
    JUPITER(5),
    SATURN(6),
    URANUS(7),
    NEPTUNE(8),
    PLUTO(9);

    // Enums can also have attributes to their objects.
    int number;

    // Enums can also have constructors since they hold objects
    Planet(int number)
    {
        this.number = number;
    }


}