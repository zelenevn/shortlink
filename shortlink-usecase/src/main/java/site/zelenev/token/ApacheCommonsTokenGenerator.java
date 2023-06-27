package site.zelenev.token;

import org.apache.commons.lang3.RandomStringUtils;

public class ApacheCommonsTokenGenerator implements TokenGenerator {

    private static final int DEFAULT_TOKEN_LENGTH = 6;
    private static final boolean DEFAULT_USE_LETTERS = true;
    private static final boolean DEFAULT_USE_NUMBERS = true;

    @Override
    public String generateUniqueToken() {
        return RandomStringUtils.random(DEFAULT_TOKEN_LENGTH, DEFAULT_USE_LETTERS, DEFAULT_USE_NUMBERS);
    }
}
