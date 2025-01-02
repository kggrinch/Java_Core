package Serialization;
import java.io.Serializable;

public class User implements Serializable {

    // It is recommended to manually have a serialVersionUID as a data field.
    private static final long serialVersionUID = 1;
    String name;
    transient String password;

    public void sayHello()
    {
        System.out.println(name + " Say's Hello");
    }
}
