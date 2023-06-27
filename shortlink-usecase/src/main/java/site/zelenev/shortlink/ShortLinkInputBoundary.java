package site.zelenev.shortlink;

public interface ShortLinkInputBoundary {

     ShortLink createShortLink(String link);

    ShortLink getShortLinkByToken(String token);

    String getOriginalLinkByToken(String token);
}
