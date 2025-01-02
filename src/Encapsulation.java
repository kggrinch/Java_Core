public class Encapsulation {
    public static void main(String[] args)
    {
        // Encapsulation - attributes of a class will be hidden or private, can be accessed only through (getters/setters).
        //                 You should make attributes private if you don't have a reason to make them public/protected

        Sedan sedan = new Sedan("Chevrolet", "Camaro", 2021);

        // Retrieving Attributes
//      System.out.println(sedan.make); // Incorrect. cannot access this attribute since its private. Best practice to
                                        // create a getter method to access this.
        System.out.println("sedan.getMake(): " + sedan.getMake()); // Correct. Using the getter method to access the attribute.
        System.out.println("sedan.getModel(): " + sedan.getModel());
        System.out.println("sedan.getYear(): " + sedan.getYear());


        // Changing Attributes
//      sedan.year = 2022; // Incorrect. Cannot change this attribute since its private. Have to create a setter method.

        sedan.setYear(2022); // Correct. Using the setter method to change the attribute.
        System.out.println("seden.getYear() after changing year: " + sedan.getYear());
    }
}


class Sedan
{
    private String make;
    private String model;
    private int year;

    Sedan(String make, String model, int year)
    {
        this.setMake(make); // Since there is a setter method you can call that in the constructor when instantiating the object.
        this.model = model;
        this.year = year;
    }

    // Setter Methods
    public void setMake(String make)
    {
        this.make = make;
    }
    public void setModel(String model)
    {
        this.model = model;
    }
    public void setYear(int year)
    {
        this.year = year;
    }

    // Getter methods
    public String getMake()
    {
        return make;
    }
    public String getModel()
    {
        return model;
    }
    public int getYear()
    {
        return year;
    }
}