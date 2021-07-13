package game.model;

import static game.model.State.ALIVE;
import static game.model.State.DEAD;

import java.util.Objects;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cell cell = (Cell) o;
    return positionX == cell.positionX && positionY == cell.positionY && state == cell.state;
  }

  @Override
  public int hashCode() {
    return Objects.hash(positionX, positionY, state);
  }

  @Override
  public String toString() {
    return "Cell{" +
        "positionX=" + positionX +
        ", positionY=" + positionY +
        ", state=" + state +
        '}';
  }
}
