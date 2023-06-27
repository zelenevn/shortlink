package site.zelenev.shortlink;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("shortlink")
public interface ShortLinkRestMapping {

    @PostMapping
    ShortLinkDto createShortLink(@RequestBody CreateShortLinkDto createShortLinkDto);

    @GetMapping("{token}")
    ShortLinkDto getShortLinkByToken(@PathVariable String token);
}
