package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

public class DeserializationExp {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Deserialization - The reverse process of converting a byte stream into an object.
        //                   (Think of this as if you're loading a saved file)

        //                 Steps to Deserialize
        //                 ---------------------------------------------------------------
        //                 1. Declare your object (don't instantiate)
        //                 2. Your class should implement Serializable interface
        //                 3. Add import java.io.Serializable;
        //                 3. FileInputStream fileIn = new FileInputStream(file path);
        //                 4. ObjectInputStream in = new ObjectInputStream(fileIn);
        //                 5. objectName = (Class) in.readObject();
        //                 6. out.close(); fileOut.close();
        //                 ----------------------------------------------------------------

        User user = null;

        FileInputStream fileIn = new FileInputStream("/Users/kirillgrichanichenko/IdeaProjects/Core/src/Serialization/UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        user = (User) in.readObject();
        in.close();
        fileIn.close();

        System.out.println(user.name);
        System.out.println(user.password); // This value will be null since the field is declared transient in the user class
        user.sayHello();

        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);
    }
}