package Decorator_Authentification;

public class DecoratorOAuth extends BaseAuthent {

    public DecoratorOAuth(User user) {
        super(user);
    }

    @Override
    public boolean authenticate() {
        String oauthToken = "kQhWFFmEOLePPZM";
        return oauthToken != null && super.authenticate();
    }
}
