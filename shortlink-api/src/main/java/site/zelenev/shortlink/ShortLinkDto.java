package site.zelenev.shortlink;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ShortLinkDto {

    private String token;

    private String original;
}
