package site.zelenev.shortlink;

public class ShortLink {

    private String token;

    private String original;

    public ShortLink(String token, String original) {
        this.token = token;
        this.original = original;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }
}
