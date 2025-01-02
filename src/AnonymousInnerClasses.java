import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousInnerClasses {
    public static void main(String[] args) {

        // Anonymous Class - an anonymous class is a inner class without a name.
        //                   Only a single object i created from one.
        //                   The object may have "extras" or "changes" and no need to create a separate innerclass when
        //                   it only needs it once.
        //                   Helps us to avoid cluttering code with a class name

        //                   Syntax is similar to a constructor, except that there is also a class definition within
        //                   a block of code. Great for Listeners

        Greeting greating = new Greeting();
        System.out.print("Calling the welcome method: ");
        greating.welcome();

        // Could change or make an update to the method in the class using this anonymous class.
        greating = new Greeting()
        {
            @Override
            public void welcome()
            {
                System.out.println("Yo bro!");
            }
        };
        System.out.print("Calling the welcome method after changes: ");
        greating.welcome();

        // Example using Listeners
        Frame frame = new Frame();



    }
}

class Greeting
{
   public void welcome()
   {
       System.out.println("Hello World!");
   }
}

// Instead of doing all the commented out code you can use an anonymous inner class
class Frame extends JFrame //implements ActionListener
{
    JButton button1 = new JButton("Button1");
    JButton button2 = new JButton("Button2");
    JButton button3 = new JButton("Button3");

    Frame()
    {
        this.add(button1);
        this.add(button2);
        this.add(button3);
        button1.setBounds(100, 100, 100, 100);
        button2.setBounds(200, 100, 100, 100);
        button3.setBounds(300, 100, 100, 100);

//        button1.addActionListener(this);
//        button2.addActionListener(this);
//        button3.addActionListener(this);

        // Instead of making all the buttons share the same actionListener they can all have
        // their specific actionListener making the code cleaner.
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You clicked " + button1.getText());
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You clicked " + button2.getText());
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You clicked " + button3.getText());
            }
        });



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.setVisible(true);
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        System.out.println("You clicked " + button1.getText());
//    }
}