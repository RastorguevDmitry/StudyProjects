package TaskForExeption;

public class FileNotFoundExeption extends Exception {

    public FileNotFoundExeption() {
    }

    public FileNotFoundExeption(String message) {
        super(message);
    }

    public FileNotFoundExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public FileNotFoundExeption(Throwable cause) {
        super(cause);
    }
}
