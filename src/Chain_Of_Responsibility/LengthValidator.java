package Chain_Of_Responsibility;

public class LengthValidator extends Validator {
    @Override
    public boolean validate(String data) {
        if (data.length() < 8 || data.length() > 20) {
            System.out.println("Length validation failed");
            return false;
        }
        return super.validate(data);
    }
}
