package site.zelenev.shortlink;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import site.zelenev.token.TokenGenerator;
import site.zelenev.token.TokenGeneratorFactory;

@Configuration
public class ShortLinkConfiguration {

    @Bean
    public TokenGenerator tokenGenerator() {
        return TokenGeneratorFactory.getTokenGenerator();
    }

    @Bean
    public ShortLinkInputBoundary shortLinkInputBoundary(ShortLinkGateway shortLinkGateway, TokenGenerator tokenGenerator) {
        return ShortLinkInteractorFactory.getShortLinkInputBoundary(shortLinkGateway, tokenGenerator);
    }
}
