package center.alora.examples.ejb;

import java.util.List;

import javax.ejb.Remote;

import org.Alora.EAP.Archetype.archetypes.jpa.Game;

@Remote
public interface IGame {

	public List<Game> getGames();
	
}
