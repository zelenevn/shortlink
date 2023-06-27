package site.zelenev.shortlink;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ShortLinkDtoMapper {

    ShortLinkDto toDto(ShortLink shortLink);

}
