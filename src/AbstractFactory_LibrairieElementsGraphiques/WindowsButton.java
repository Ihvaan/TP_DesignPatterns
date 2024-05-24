package AbstractFactory_LibrairieElementsGraphiques;

import javax.swing.JButton;

public class WindowsButton extends Button {
    public WindowsButton(String text) {
        super(text);
    }

    @Override
    public JButton toSwingButton() {
        return new JButton("Windows Button: " + text);
    }
}
