package demo4;

public class PosNotLegalException extends RuntimeException{
    public PosNotLegalException() {
    }

    public PosNotLegalException(String message) {
        super(message);
    }
}
