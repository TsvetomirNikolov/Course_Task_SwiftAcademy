package DataAccessLayer;

public class DALException extends Exception {

    public DALException(String message) {
        super(message);
    }

    public DALException(String message, Throwable cause) {
        super(message, cause);
    }
}
