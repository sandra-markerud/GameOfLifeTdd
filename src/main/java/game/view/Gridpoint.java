package game.view;

import static game.view.ViewProperties.deadCellColor;
import static game.view.ViewProperties.livingCellColor;
import game.model.Cell;
import java.awt.Color;

public class Gridpoint {

	private Color color;
	private int positionX;
	private int positionY;

	public Gridpoint(int x, int y, Color color) {
		positionX = x;
		positionY = y;
		this.color = color;
	}

	public int getX() {
		return positionX;
	}

	public int getY() {
		return positionY;
	}

	public Color getColor() {
		return color;
	}

	public static Gridpoint of(Cell cell) {
		Color color = cell.isAlive() ? livingCellColor : deadCellColor;
		return new Gridpoint(cell.getPositionX(), cell.getPositionY(), color);
	}
}
