package Composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemComponent {
    private List<FileSystemComponent> components = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    @Override
    public void add(FileSystemComponent component) {
        components.add(component);
    }

    @Override
    public void remove(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public void display(String indentation) {
        System.out.println(indentation + name);
        for (FileSystemComponent component : components) {
            component.display(indentation + "  ");
        }
    }
}
