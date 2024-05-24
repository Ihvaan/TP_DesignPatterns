package AbstractFactory_LibrairieElementsGraphiques;

import javax.swing.JMenu;

public class MacOSMenu extends Menu {
    public MacOSMenu(String text) {
        super(text);
    }

    @Override
    public JMenu toSwingMenu() {
        return new JMenu("MacOS Menu: " + text);
    }
}

