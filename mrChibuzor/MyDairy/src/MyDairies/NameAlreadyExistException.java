package MyDairies;

public class NameAlreadyExistException extends RuntimeException {
    public NameAlreadyExistException(String message) {
        super(message);
    }

}
