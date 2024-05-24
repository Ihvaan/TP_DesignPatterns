package AbstractFactory_LibrairieElementsGraphiques;

import javax.swing.JMenu;

public class LinuxMenu extends Menu {
    public LinuxMenu(String text) {
        super(text);
    }

    @Override
    public JMenu toSwingMenu() {
        return new JMenu("Linux Menu: " + text);
    }
}

