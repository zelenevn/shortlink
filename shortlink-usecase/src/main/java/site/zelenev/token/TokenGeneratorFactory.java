package site.zelenev.token;

public final class TokenGeneratorFactory {

    public static TokenGenerator getTokenGenerator() {
        return new ApacheCommonsTokenGenerator();
    }
}
