package AbstractFactory_LibrairieElementsGraphiques;

public class LinuxFactory implements GraphicalComponentFactory {
    @Override
    public Button createButton(String text) {
        return new LinuxButton(text);
    }

    @Override
    public Menu createMenu(String text) {
        return new LinuxMenu(text);
    }
}

