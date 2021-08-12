package co.com.yourcompany.certification.nameproject.exceptions;

public class TechChallenge extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public TechChallenge(Exception e) {
        super(e);
    }

}
