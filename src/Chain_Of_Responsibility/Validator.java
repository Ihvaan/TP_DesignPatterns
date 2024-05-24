package Chain_Of_Responsibility;

public abstract class Validator {
    protected Validator next;

    public void setNext(Validator next) {
        this.next = next;
    }

    public boolean validate(String data) {
        if (next != null) {
            return next.validate(data);
        }
        return true;
    }
}
