package edume.bootsolution;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edume.bootsolution.model.Player;
import edume.bootsolution.model.Team;
import edume.bootsolution.repositories.TeamRepository;

@SpringBootApplication
public class BootSolutionApplication
{
	@Autowired
	private TeamRepository teamRepository;

	public static void main(String[] args)
	{
		SpringApplication.run(BootSolutionApplication.class, args);
	}

	@PostConstruct
	public void init()
	{
		List<Team> list = new ArrayList<>();

		Set<Player> set = new HashSet<>();
		set.add(new Player("Big Easy", "Showman"));
		set.add(new Player("Buckets", "Guard"));
		set.add(new Player("Dizzy", "Guard"));

		list.add(new Team("Harlem", "Globetrotters", set));
		list.add(new Team("Washington", "Generals", null));

		teamRepository.saveAll(list);
	}
}
