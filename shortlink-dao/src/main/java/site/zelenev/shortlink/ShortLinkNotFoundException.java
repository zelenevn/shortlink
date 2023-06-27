package site.zelenev.shortlink;

public class ShortLinkNotFoundException extends RuntimeException {

    public ShortLinkNotFoundException(String message) {
        super(message);
    }
}
