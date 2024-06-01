package Task6;

public class WrongPasswordException extends Throwable {
    public WrongPasswordException(String message) {
        super(message);
    }

    public WrongPasswordException() {

    }
}
