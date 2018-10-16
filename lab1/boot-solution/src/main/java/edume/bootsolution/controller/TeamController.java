package edume.bootsolution.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import edume.bootsolution.model.Team;
import edume.bootsolution.repositories.TeamRepository;

@RestController
public class TeamController
{
	@Autowired
	private TeamRepository teamRepository;

	@GetMapping("/teams")
	public Iterable<Team> getTeams()
	{
		return teamRepository.findAll();
	}
	
	@GetMapping("/team/{id}")
	public Optional<Team> getTeam(@PathVariable("id") long id)
	{
		return teamRepository.findById(id);
	}
}
