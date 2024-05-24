package AbstractFactory_LibrairieElementsGraphiques;

import javax.swing.JButton;

public class MacOSButton extends Button {
    public MacOSButton(String text) {
        super(text);
    }

    @Override
    public JButton toSwingButton() {
        return new JButton("MacOS Button: " + text);
    }
}
