import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lambda {
    public static void main(String[] args) {

        // Should look into this more since there is more to this.

        /* lambda expressions - feature for Java 8 and above. Also known as an anonymous method.
                                It is a shorter way to write anonymous classes with only one method.

                                need to use a functional interface or use a pre-defined functional interface
                                they contain only one abstract method.
                                ex: ActionListener, Runnable, (user-defined)

                                A lambda expression can be used in any place where a functional interface is required.
                                How to use a lambda expression:
                                (argument) -> {statement/s}
         */


        String name = "Bob";
        char symbol = ',';
        myInterface myInterface = (myName, mySymbol) -> {
            System.out.println("Hello " + myName + mySymbol);
            System.out.println("it is a nice today!");
        };


        myInterface myInterface2 = (myName, mySymbol) -> {
            System.out.println("Hello " + myName + mySymbol + " how are you?");
        };

        myInterface2.message(name, symbol);


        // Example of using lambda on ActionListener. Requires GUI construction
        MyFrame myFrame = new MyFrame();



    }
}

// user-defined interface.
@FunctionalInterface
interface myInterface{
    public void message(String name, char symbol);
}



// GUI construction for example with actionListener interface.
class MyFrame extends JFrame{
    JButton myButton = new JButton("MY BUTTON");
    JButton myButton2 = new JButton("Exit");

    MyFrame(){

        // Button1
        myButton.setBounds(100, 100, 200, 100);

        // Without using lambda
//        myButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("You clicked the button!");
//            }
//        });

        // With Lambda example
        myButton.addActionListener((e) -> {
            System.out.println("You clicked the button!"); // Outputs "you clicked the button!" on click.
        });


        // Button2
        myButton2.setBounds(100, 200, 200, 100);

        // Without using lambda
//        myButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                MyFrame.this.dispose();
//            }
//        });


        // With Lambda example
        myButton2.addActionListener((e) -> {
           this.dispose(); // Closes the application on click.
        });


        this.add(myButton);
        this.add(myButton2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.setLayout(null);
        this.setVisible(true);
    }
}