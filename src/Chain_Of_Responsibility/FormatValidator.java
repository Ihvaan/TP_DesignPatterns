package Chain_Of_Responsibility;

import java.util.regex.Pattern;

public class FormatValidator extends Validator {
    private static final Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,}$");

    @Override
    public boolean validate(String data) {
        if (!pattern.matcher(data).matches()) {
            System.out.println("Format validation failed");
            return false;
        }
        return super.validate(data);
    }
}

