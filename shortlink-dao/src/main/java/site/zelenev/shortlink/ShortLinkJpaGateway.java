package site.zelenev.shortlink;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class ShortLinkJpaGateway implements ShortLinkGateway {

    private final ShortLinkRepository shortLinkRepository;

    private final ShortLinkEntityMapper shortLinkEntityMapper;

    @Override
    public ShortLink saveShortLink(ShortLink shortLink) {
        ShortLinkEntity shortLinkEntity = shortLinkEntityMapper.toEntity(shortLink);
        ShortLinkEntity saved = shortLinkRepository.save(shortLinkEntity);
        return shortLinkEntityMapper.toDomain(saved);
    }

    @Override
    public String getOriginalLinkByToken(String token) {
        Optional<ShortLinkEntity> found = shortLinkRepository.findByToken(token);
        if (found.isPresent()) {
            ShortLinkEntity shortLinkEntity = found.get();
            return shortLinkEntity.getOriginal();
        }
        throw new ShortLinkNotFoundException(String.format("Short link with %s token not found.", token));
    }

    @Override
    public ShortLink getShortLinkByToken(String token) {
        Optional<ShortLinkEntity> found = shortLinkRepository.findByToken(token);
        if (found.isPresent()) {
            ShortLinkEntity shortLinkEntity = found.get();
            return shortLinkEntityMapper.toDomain(shortLinkEntity);
        }
        throw new ShortLinkNotFoundException(String.format("Short link with %s token not found.", token));
    }
}
