package site.zelenev.shortlink;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ShortLinkEntityMapper {

    ShortLinkEntity toEntity(ShortLink shortLink);

    ShortLink toDomain(ShortLinkEntity shortLinkEntity);
}
