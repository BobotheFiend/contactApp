package ng.ContactApp.exceptions;

public class ContactAppException extends Exception {

    public ContactAppException(String message) {
        super(message);
    }
    public ContactAppException(String message, Throwable cause) {
        super(message, cause);
    }
    public ContactAppException(){
        super();
    }
    public ContactAppException(Throwable cause) {
        super(cause);
    }
}
