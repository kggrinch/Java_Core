package package2;
import package1.*; // Could change to import package1.*; to import everything

public class Asub extends A {
    public static void main(String[] args)
    {
        C c = new C();
        System.out.println(c.defaultMessage); // Has access since it is in the same package.

        Asub asub = new Asub();
        System.out.println(asub.protectedMessage); // Has access since it is a subClass of A.

    }
}
