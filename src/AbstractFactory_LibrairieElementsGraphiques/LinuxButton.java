package AbstractFactory_LibrairieElementsGraphiques;

import javax.swing.JButton;

public class LinuxButton extends Button {
    public LinuxButton(String text) {
        super(text);
    }

    @Override
    public JButton toSwingButton() {
        return new JButton("Linux Button: " + text);
    }
}

