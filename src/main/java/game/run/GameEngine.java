package game.run;

import static game.model.ModelProperties.COLUMNS;
import static game.model.ModelProperties.ROWS;

import game.model.GridCellModel;
import game.view.Display;
import game.view.GameOfLifeDisplay;
import game.view.Gridpoints;

public class GameEngine {

	private Display display;

	public GameEngine() {
		display = new GameOfLifeDisplay();
	}

	public void run() {
		while (true) {
			display.update(new Gridpoints(new GridCellModel(ROWS, COLUMNS)));
			waitForNextTurn(GameProperties.TIME_BETWEEN_TURNS);
		}
	}

	private void waitForNextTurn(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}