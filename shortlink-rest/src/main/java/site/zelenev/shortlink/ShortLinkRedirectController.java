package site.zelenev.shortlink;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequiredArgsConstructor
public class ShortLinkRedirectController implements ShortLinkRedirectMapping {

    private final ShortLinkInputBoundary shortLinkInputBoundary;

    @Override
    public RedirectView redirectToOriginalLink(String token) {
        String originalLink = shortLinkInputBoundary.getOriginalLinkByToken(token);
        return new RedirectView(originalLink);
    }
}
