package exception;

public class NoSuchServiceException extends Exception{

    public NoSuchServiceException(){
        super();
    }

    public NoSuchServiceException(String message){
        super(message);
    }
}
