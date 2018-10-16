package edume.bootsolution.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@Entity
//@XmlRootElement
public class Team
{
	@Id
	@GeneratedValue
	private long id;
	private String location = null;
	private String name = null;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "teamId")
	private Set<Player> player = null;

	public Team(String location, String name, Set<Player> player)
	{
		this.location = location;
		this.name = name;
		this.player = player;
	}

}
