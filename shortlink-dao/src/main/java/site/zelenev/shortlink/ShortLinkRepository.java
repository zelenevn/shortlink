package site.zelenev.shortlink;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ShortLinkRepository extends CrudRepository<ShortLinkEntity, Long> {

    Optional<ShortLinkEntity> findByToken(String token);
}
