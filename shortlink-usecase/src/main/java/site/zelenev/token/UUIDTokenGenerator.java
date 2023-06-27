package site.zelenev.token;

import java.util.UUID;

final class UUIDTokenGenerator implements TokenGenerator {

    @Override
    public String generateUniqueToken() {
        return UUID.randomUUID().toString();
    }
}
