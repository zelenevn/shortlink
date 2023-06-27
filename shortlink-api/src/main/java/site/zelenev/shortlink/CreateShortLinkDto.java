package site.zelenev.shortlink;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreateShortLinkDto {

    private String originalLink;
}
