package Composite;

public class File extends FileSystemComponent {
    public File(String name) {
        super(name);
    }

    @Override
    public void display(String indentation) {
        System.out.println(indentation + name);
    }
}
