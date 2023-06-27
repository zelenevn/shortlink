package site.zelenev.shortlink;

import site.zelenev.token.TokenGenerator;

class ShortLinkInteractor implements ShortLinkInputBoundary {

    private final ShortLinkGateway shortLinkGateway;

    private final TokenGenerator tokenGenerator;

    public ShortLinkInteractor(ShortLinkGateway shortLinkGateway, TokenGenerator tokenGenerator) {
        this.shortLinkGateway = shortLinkGateway;
        this.tokenGenerator = tokenGenerator;
    }

    @Override
    public ShortLink createShortLink(String link) {
        String token = tokenGenerator.generateUniqueToken();
        ShortLink shortLink = new ShortLink(token, link);
        return shortLinkGateway.saveShortLink(shortLink);
    }

    @Override
    public ShortLink getShortLinkByToken(String token) {
        return shortLinkGateway.getShortLinkByToken(token);
    }

    @Override
    public String getOriginalLinkByToken(String token) {
        return shortLinkGateway.getOriginalLinkByToken(token);
    }
}
