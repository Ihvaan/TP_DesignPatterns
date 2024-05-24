package Decorator_Authentification;

public class DecoratorAPIKeys extends BaseAuthent {

    public DecoratorAPIKeys(User user) {
        super(user);
    }

    @Override
    public boolean authenticate() {
        String apiKey = "e88c562a7355c727f55c0a2ac6353ad8672704c56b672d98a3050f0f0633dfac";
        return apiKey != null && super.authenticate();
    }
}
