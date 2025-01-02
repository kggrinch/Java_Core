package Serialization;

import java.io.*;

public class SerializationExp {
    public static void main(String[] args) throws IOException {

        // Serialization - The process of converting an object into a byte stream.
        //                 Persists (saves the state) the object after program exits.
        //                 This byte stream can be saved as a file or sent over a network.
        //                 Can be sent to a different machine
        //                 Byte stream can be saved as a file (.ser) which is platform independent
        //                 (Think of this as if you're saving a file with the object's information)


        //                 Steps to Serialize
        //                 ---------------------------------------------------------------
        //                 1. Your object class should implement Serializable interface
        //                 2. Add import java.io.Serializable;
        //                 3. FileOutputStream fileOut = new FileOutputStream(file path);
        //                 4. ObjectOutputStream out = new ObjectOutputStream(fileOut);
        //                 5. out.writeObject(objectName);
        //                 6. out.close(); fileOut.close();
        //                 ----------------------------------------------------------------

        // Deserialization - The reverse process of converting a byte stream into an object.
        //                   (Think of this as if you're loading a saved file)

        // Important notes - 1. Child classes of a parent class that implements Serializable will do so as well.
        //                   2. Static fields are not serialized (they belong to the class, not an individual object)
        //                   3. The class's definition ("class file") itself is not recorded, cast it as the object type
        //                   4. Fields declared as "transient" aren't serialized, they're ignored
        //                   5. SerialVersionUID is a unique version ID

        // SerialVersionUID - serialVersionUID is a unique ID that functions like a version #
        //                    verifies that the sender and receiver of a serialized object, have loaded classes for
        //                    that object that match.
        //                    Ensures object will be compatible between machines.
        //                    Number must match. Otherwise, this will cause a InvalidClassException.
        //                    A SerialVersionUID will be calculated based on class properties, members, ect.
        //                    A Serializable class can declare its own serialVersionUID explicitly (recommended)






        User user = new User();
        user.name = "Bob Burgers";
        user.password = "I<3Pizza123";

        FileOutputStream fileOut = new FileOutputStream("/Users/kirillgrichanichenko/IdeaProjects/Core/src/Serialization/UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println("Object info saved");

        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);
    }
}