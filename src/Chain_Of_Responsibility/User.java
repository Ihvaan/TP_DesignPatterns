package Chain_Of_Responsibility;

public class User {
    public static void main(String[] args) {
        Validator formatValidator = new FormatValidator();
        Validator lengthValidator = new LengthValidator();
        Validator unicityValidator = new UnicityValidator();

        formatValidator.setNext(lengthValidator);
        lengthValidator.setNext(unicityValidator);

        String password1 = "SAf1nette76%?";
        String password2 = "password";

        System.out.println("Validating Password 1: " + password1);
        if (formatValidator.validate(password1)) {
            System.out.println("Password 1 is valid.");
        } else {
            System.out.println("Password 1 is invalid.");
        }

        System.out.println("\nValidating Password 2: " + password2);
        if (formatValidator.validate(password2)) {
            System.out.println("Password 2 is valid.");
        } else {
            System.out.println("Password 2 is invalid.");
        }
    }
}
