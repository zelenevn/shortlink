package site.zelenev.shortlink;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.view.RedirectView;

public interface ShortLinkRedirectMapping {

    @GetMapping("{token}")
    RedirectView redirectToOriginalLink(@PathVariable String token);
}
