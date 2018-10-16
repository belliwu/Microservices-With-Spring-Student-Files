package edume.bootsolution.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import edume.bootsolution.model.Player;

//@RestResource(path="players", rel="player")
public interface PlayerRepository extends CrudRepository<Player, Long>
{

}
