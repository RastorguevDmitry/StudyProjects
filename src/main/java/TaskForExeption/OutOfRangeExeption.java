package TaskForExeption;

public class OutOfRangeExeption extends Exception {

    public OutOfRangeExeption() {
    }

    public OutOfRangeExeption(String message) {
        super(message);
    }

    public OutOfRangeExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public OutOfRangeExeption(Throwable cause) {
        super(cause);
    }
}
