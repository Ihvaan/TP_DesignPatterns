package Composite;

public class User {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        Directory home = new Directory("home");
        Directory user = new Directory("user");

        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        user.add(file1);
        home.add(user);
        root.add(home);
        root.add(file2);

        root.display("");
    }
}
