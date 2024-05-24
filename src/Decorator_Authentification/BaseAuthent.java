package Decorator_Authentification;

public class BaseAuthent {
    protected User user;

    public BaseAuthent(User user) {
        this.user = user;
    }

    public boolean authenticate() {
        if (user.login != null && user.login.length() == 8 && user.password != null) {
            return user.password.matches(".*\\d.*") && user.password.matches(".*[a-z].*") &&
                    user.password.matches(".*[A-Z].*") && user.password.matches(".*\\p{Punct}.*");
        }
        return false;
    }
}
