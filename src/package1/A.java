package package1;
import package2.*;
public class A {

    protected String protectedMessage = "This is protected";


    public static void main(String[] args) {
        C c = new C();

        // Not visible since default message has a default modifier and C is in a different package.
//        System.out.println(c.defaultMessage);

        // Visible since public message has a public modifier and C is in a different package.
        System.out.println(c.publicMessage); // Visible since c

        B b = new B();
        // Not visible since private message has a private modifier and only visible in its own class.
//        System.out.println(b.privateMessage);
    }
}
