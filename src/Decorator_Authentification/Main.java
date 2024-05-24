package Decorator_Authentification;

public class Main {
    public static void main(String[] args) {
        User user = new User("user1234", "Password1!");

        BaseAuthent baseAuth = new BaseAuthent(user);
        System.out.println("Base Authentication: " + baseAuth.authenticate());

        DecoratorOAuth oauthAuth = new DecoratorOAuth(user);
        System.out.println("OAuth Authentication: " + oauthAuth.authenticate());

        DecoratorJWT jwtAuth = new DecoratorJWT(user);
        System.out.println("JWT Authentication: " + jwtAuth.authenticate());

        DecoratorAPIKeys apiKeyAuth = new DecoratorAPIKeys(user);
        System.out.println("API Key Authentication: " + apiKeyAuth.authenticate());
    }
}

