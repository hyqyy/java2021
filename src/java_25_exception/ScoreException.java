package java_25_exception;

public class ScoreException extends Exception{

    public ScoreException() {
    }

    public ScoreException(String message) {
        super(message);
    }


    public ScoreException(String message, Throwable cause) {
        super(message, cause);
    }
}
