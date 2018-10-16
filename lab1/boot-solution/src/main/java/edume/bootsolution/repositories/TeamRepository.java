package edume.bootsolution.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import edume.bootsolution.model.Team;

//@RestResource(path="teams", rel="team") 
public interface TeamRepository extends CrudRepository<Team, Long>
{

}
