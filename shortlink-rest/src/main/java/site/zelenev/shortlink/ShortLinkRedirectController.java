package site.zelenev.shortlink;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.view.RedirectView;

/**
 * Контроллер, предназначенный для редиректа пользователя по полной ссылке
 * @author Zelenev Nikolay
 */
@Controller
@RequiredArgsConstructor
@Slf4j
public class ShortLinkRedirectController implements ShortLinkRedirectMapping {

    private final ShortLinkInputBoundary shortLinkInputBoundary;

    @Override
    public RedirectView redirectToOriginalLink(String token) {
        String originalLink = shortLinkInputBoundary.getOriginalLinkByToken(token);
        log.info("Redirecting to {}", originalLink);
        return new RedirectView(originalLink);
    }
}
