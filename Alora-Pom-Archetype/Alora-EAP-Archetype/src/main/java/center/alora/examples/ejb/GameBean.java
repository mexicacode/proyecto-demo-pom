package center.alora.examples.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.Alora.EAP.Archetype.archetypes.jpa.Game;
import org.Alora.EAP.Archetype.daos.GameDao;

@Stateless
public class GameBean implements IGame {
	
	@Inject
	private GameDao gameDao;

	@Override
	public List<Game> getGames() {
		return gameDao.findAll();
	}

}
