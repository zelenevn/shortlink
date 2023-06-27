package site.zelenev.shortlink;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ShortLinkRestController implements ShortLinkRestMapping {

    private final ShortLinkInputBoundary shortLinkInputBoundary;

    private final ShortLinkDtoMapper shortLinkDtoMapper;

    @Override
    public ShortLinkDto createShortLink(CreateShortLinkDto createShortLinkDto) {
        String original = createShortLinkDto.getOriginalLink();
        ShortLink created = shortLinkInputBoundary.createShortLink(original);
        return shortLinkDtoMapper.toDto(created);
    }

    @Override
    public ShortLinkDto getShortLinkByToken(String token) {
        ShortLink found = shortLinkInputBoundary.getShortLinkByToken(token);
        return shortLinkDtoMapper.toDto(found);
    }
}
