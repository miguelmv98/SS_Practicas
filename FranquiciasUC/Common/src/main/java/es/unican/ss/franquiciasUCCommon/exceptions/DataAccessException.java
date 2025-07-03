package es.unican.ss.franquiciasUCCommon.exceptions;

public class DataAccessException extends RuntimeException {
    public DataAccessException(String message) {
        super(message);
    }

    public DataAccessException() {
        super();
    }
}
