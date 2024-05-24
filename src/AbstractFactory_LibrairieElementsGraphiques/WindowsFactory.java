package AbstractFactory_LibrairieElementsGraphiques;

public class WindowsFactory implements GraphicalComponentFactory {
    @Override
    public Button createButton(String text) {
        return new WindowsButton(text);
    }

    @Override
    public Menu createMenu(String text) {
        return new WindowsMenu(text);
    }
}

