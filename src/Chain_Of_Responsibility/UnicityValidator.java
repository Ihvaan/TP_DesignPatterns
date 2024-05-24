package Chain_Of_Responsibility;

import java.util.List;

public class UnicityValidator extends Validator {
    private static final List<String> existingPasswords = List.of("password1", "Password@123");

    @Override
    public boolean validate(String data) {
        if (existingPasswords.contains(data)) {
            System.out.println("Unicity validation failed");
            return false;
        }
        return super.validate(data);
    }
}

