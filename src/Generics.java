public class Generics {
    public static void main(String[] args) {
        // Generics - enable types (classes, and interfaces) to be parameters when defining:
        //            classes. interfaces, and methods. A benefit is to eliminate the need to create multiple versions of
        //            methods or classes for various data types. Use 1 version for al reference data types.




        // Generic methods
        System.out.println("Generic Methods");

        Integer[] intArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
        Character[] charArray = {'A', 'B', 'C', 'D'};
        String[] stringArray = {"Hello", "Hi", "Goodbye"};

        // To print all these arrays normally we would have to create a method for each datatype.
        System.out.println("Without using generics: ");
        displayIntegerArray(intArray);
        displayDoubleArray(doubleArray);
        displayCharacterArray(charArray);
        displayStringArray(stringArray);

        // Printing all the arrays using the generic method
        System.out.println("\nWith Generics: ");
        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(charArray);
        displayArray(stringArray);

        // Return first element in the array (Generic method)
        System.out.println("\nGetFirst() with generic");
        System.out.println(getFirst(intArray));
        System.out.println(getFirst(doubleArray));
        System.out.println(getFirst(charArray));
        System.out.println(getFirst(stringArray));


        // Generic Classes
        System.out.print("\nGeneric Classes");

        // You can create each single class separately. However, if you are using each class for the same purpose
        // it is more efficient if you create one class using generics that way you can just reuse that one class.

        // Without Generics
        myIntegerClass myInt = new myIntegerClass(1);
        myDoubleClass myDouble = new myDoubleClass(3.14);
        myCharacterClass myCharacter = new myCharacterClass('@');
        myStringClass myString = new myStringClass("Hello");

        System.out.println("\nCalling .getValue() on all classes (without generics)");
        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myCharacter.getValue());
        System.out.println(myString.getValue());

        // Generics
        myGenericClass<Integer> myIntG = new myGenericClass<>(1);
        myGenericClass<Double> myDoubleG = new myGenericClass<>(3.14);
        myGenericClass<Character> myCharacterG = new myGenericClass<>('@');
        myGenericClass<String> myStringG = new myGenericClass<>("Hello");
        // Note: very similar to ArrayList<DataType> arrayList = new ArrayList<>();
        // Note: You do not have to specify dataType in <> since java recognises it using generics

        System.out.println("\nCalling .getValue() on all classes (with generics)");
        System.out.println(myIntG.getValue());
        System.out.println(myDoubleG.getValue());
        System.out.println(myCharacterG.getValue());
        System.out.println(myStringG.getValue());

        // Generic Classes with multiple parameters
        System.out.println("\nGeneric Classes With Multiple Parameters");
        myGenericClassP<Integer, String> myGenericP = new myGenericClassP<>(1, "Joe");
        System.out.println("myGenericP.getValue(): " + myGenericP.getValue());
        System.out.println("myGenericP.getText(): " + myGenericP.getText());
        System.out.print("myGenericP.printBoth(): "); myGenericP.printBoth();
        // Note: Very similar to HashMap<Integer, String> hashMap = new HashMap<>();


        // Generics Bounded Types - This allows you to create the objects of a generic class to have data of specific
        //                          derived types ex.Number.
        System.out.println("\nGeneric Classes With Bounded Types");
        myGenericClassBounded<Integer> myGenericClassBounded = new myGenericClassBounded<>(1);

        // This would cause an excepting error because the generic class is only number bounded.
//      myGenericClassBounded<String> myGenericClassBounded2 = new myGenericClassBounded<>("Hello");

        System.out.println("myGenericClassBounded.getValue(): " + myGenericClassBounded.getValue());









    }


    /** Methods */
    // To print the all the arrays I would have to create five methods with different datatype.
    // Instead, we can use generics so that each array is able to reuse the same method.
    // Generic Method to print all arrays.
    public static <T> void displayArray(T[] array)
    {
        for(T x : array)
            System.out.print(x + " ");
        System.out.println(" ");
    }

    // Generic Method that returns a generic dataType.
    public static <T> T getFirst(T[] array)
    {
        return array[0];
    }


    // Without using generic
    public static void displayIntegerArray(Integer[] array)
    {
        for(Integer x : array)
            System.out.print(x+" ");
        System.out.println(" ");
    }
    public static void displayDoubleArray(Double[] array)
    {
        for(Double x : array)
            System.out.print(x+" ");
        System.out.println(" ");
    }
    public static void displayCharacterArray(Character[] array)
    {
        for(Character x : array)
            System.out.print(x+" ");
        System.out.println(" ");
    }
    public static void displayStringArray(String[] array)
    {
        for(String x : array)
            System.out.print(x+" ");
        System.out.println(" ");
    }
}

/** Classes */


// To initialize all the objects I would have to create five classes with different datatype.
// Instead, we can use generics so that each object is able to reuse the same class.


// Class with Generics
class myGenericClass<T> {
    T x;
    myGenericClass(T x)
    {
        this.x = x;
    }
    public T getValue()
    {
        return x;
    }
}

// Class with Generics (with multiple parameters)
class myGenericClassP<T, S> {
    T x;
    S y;
    myGenericClassP(T x, S y)
    {
        this.x = x;
        this.y = y;
    }
    public T getValue()
    {
        return x;
    }
    public S getText()
    {
        return y;
    }
    // Notice I print them instead of getting them. That is because a method could only return one dataType at a time.
    public void printBoth()
    {
        System.out.println("[" + x + "," + y + "]");
    }
}

// Generic class with bounded types (only numbers)
class myGenericClassBounded<T extends Number> {
    T x;
    myGenericClassBounded(T x)
    {
        this.x = x;
    }
    public T getValue()
    {
        return x;
    }
}


// Classes without generics
class myIntegerClass {
    Integer x;
    myIntegerClass(Integer x)
    {
        this.x = x;
    }
    public Integer getValue()
    {
        return x;
    }
}

class myDoubleClass {
    Double x;
    myDoubleClass(Double x)
    {
        this.x = x;
    }
    public Double getValue()
    {
        return x;
    }
}

class myCharacterClass {
    Character x;
    myCharacterClass(Character x)
    {
        this.x = x;
    }
    public Character getValue()
    {
        return x;
    }
}

class myStringClass {
    String x;
    myStringClass(String x)
    {
        this.x = x;
    }
    public String getValue()
    {
        return x;
    }
}