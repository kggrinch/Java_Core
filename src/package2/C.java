package package2;
import package1.*;

// If remove public from the class name then the class will only be available to classes in the same package since
// it will become a default modifier.
public class C {
                String defaultMessage = "This is the default";
    public      String publicMessage = "This is public";
    protected   String protectedMessage = "This is protected";

    private     String privateMessage = "This is private";
}
