package co.com.yourcompany.certification.nameproject.exceptions;

public class TechPropertiesDoesNotLoadException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public TechPropertiesDoesNotLoadException(Exception e) {
        super(e);
    }
}
