package Decorator_Authentification;

public class DecoratorJWT extends BaseAuthent {

    public DecoratorJWT(User user) {
        super(user);
    }

    @Override
    public boolean authenticate() {
        String jwtToken = "{token:NvxkNXVVeocLpDg}";
        return jwtToken != null && jwtToken.contains("{") && super.authenticate();
    }
}
