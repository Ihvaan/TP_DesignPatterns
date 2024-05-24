package AbstractFactory_LibrairieElementsGraphiques;

import javax.swing.JMenu;

public class WindowsMenu extends Menu {
    public WindowsMenu(String text) {
        super(text);
    }

    @Override
    public JMenu toSwingMenu() {
        return new JMenu("Windows Menu: " + text);
    }
}
