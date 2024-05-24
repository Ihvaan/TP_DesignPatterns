package AbstractFactory_LibrairieElementsGraphiques;

public interface GraphicalComponentFactory {
    Button createButton(String text);
    Menu createMenu(String text);
}
