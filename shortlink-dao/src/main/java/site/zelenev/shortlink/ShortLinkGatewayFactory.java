package site.zelenev.shortlink;

public final class ShortLinkGatewayFactory {

    public static ShortLinkGateway getShortLinkGateway(ShortLinkRepository shortLinkRepository, ShortLinkEntityMapper shortLinkEntityMapper) {
        return new ShortLinkJpaGateway(shortLinkRepository, shortLinkEntityMapper);
    }
}
