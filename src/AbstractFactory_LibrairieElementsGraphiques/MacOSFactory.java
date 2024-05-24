package AbstractFactory_LibrairieElementsGraphiques;

public class MacOSFactory implements GraphicalComponentFactory {
    @Override
    public Button createButton(String text) {
        return new MacOSButton(text);
    }

    @Override
    public Menu createMenu(String text) {
        return new MacOSMenu(text);
    }
}
