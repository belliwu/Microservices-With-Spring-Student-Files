package edume.bootsolution.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Player
{
	@Id
	@GeneratedValue
	private long id;
	private String name = null;
	private String position = null;

	public Player(String name, String position)
	{
		this.name = name;
		this.position = position;
	}
}

