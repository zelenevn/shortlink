package site.zelenev.shortlink;

import site.zelenev.token.TokenGenerator;

public final class ShortLinkInteractorFactory {

    public static ShortLinkInputBoundary getShortLinkInputBoundary(ShortLinkGateway shortLinkGateway, TokenGenerator tokenGenerator) {
        return new ShortLinkInteractor(shortLinkGateway, tokenGenerator);
    }
}
