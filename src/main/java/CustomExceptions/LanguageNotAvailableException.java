package CustomExceptions;

import org.openqa.selenium.NoSuchElementException;

public class LanguageNotAvailableException extends NoSuchElementException {
    public LanguageNotAvailableException(String reason) {
        super(reason);
    }

    public LanguageNotAvailableException(String reason, Throwable cause) {
        super(reason, cause);
    }
}
