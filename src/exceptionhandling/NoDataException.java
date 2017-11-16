package exceptionhandling;

public class NoDataException extends Exception {

    public NoDataException() {
        super();
    }
    
    public NoDataException(String errorMessage) {
        super(errorMessage);
    }
}
