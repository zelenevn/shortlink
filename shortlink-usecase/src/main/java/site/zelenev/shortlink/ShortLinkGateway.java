package site.zelenev.shortlink;

public interface ShortLinkGateway {

    ShortLink saveShortLink(ShortLink shortLink);

    String getOriginalLinkByToken(String token);

    ShortLink getShortLinkByToken(String token);
}
