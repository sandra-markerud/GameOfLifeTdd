package game.model;

import static game.model.State.ALIVE;
import static game.model.State.DEAD;

public class Cell {

  private final int positionX;
  private final int positionY;
  private final State state;

  public Cell(int positionX, int positionY, State state) {
    this.positionX = positionX;
    this.positionY = positionY;
    this.state = state;
  }

  public int getPositionX() {
    return positionX;
  }

  public int getPositionY() {
    return positionY;
  }

  public State getState() {
    return state;
  }

  public boolean isAlive() {
    return state == ALIVE;
  }

  public boolean isDead() {
    return state == DEAD;
  }

}
