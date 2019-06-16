package TaskForExeption;

public class DataNotFoundExeption extends Exception {

    public DataNotFoundExeption() {
    }

    public DataNotFoundExeption(String message) {
        super(message);
    }

    public DataNotFoundExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public DataNotFoundExeption(Throwable cause) {
        super(cause);
    }
}
