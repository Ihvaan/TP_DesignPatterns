package AbstractFactory_LibrairieElementsGraphiques;

import javax.swing.*;

public class User {
    public static void main(String[] args) {
        // Choose the OS
        String os = "Linux";  // Change this to "Windows" or "MacOS" to test other factories

        GraphicalComponentFactory factory;

        switch (os) {
            case "Windows":
                factory = new WindowsFactory();
                break;
            case "Linux":
                factory = new LinuxFactory();
                break;
            case "MacOS":
                factory = new MacOSFactory();
                break;
            default:
                throw new IllegalArgumentException("Unknown OS: " + os);
        }

        Button button = factory.createButton("Click Me!");
        Menu menu = factory.createMenu("File");

        JFrame frame = new JFrame("Abstract Factory Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new java.awt.FlowLayout());

        frame.add(button.toSwingButton());
        frame.setJMenuBar(new JMenuBar() {{
            add(menu.toSwingMenu());
        }});

        frame.setVisible(true);
    }
}
