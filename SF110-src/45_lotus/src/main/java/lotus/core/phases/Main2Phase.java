package lotus.core.phases;

import lotus.core.Game;

public class Main2Phase extends Phase
{
	@Override
	public void doPhase()
	{
		Game.givePriorityToCurrentPlayer();
	}
}
