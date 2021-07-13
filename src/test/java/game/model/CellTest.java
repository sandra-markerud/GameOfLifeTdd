package game.model;

import static game.model.State.ALIVE;
import static game.model.State.DEAD;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CellTest {

  @Test
  void checkStateOfCell_alive() {
    Cell cell = new Cell(1, 2, ALIVE);

    boolean isAlive = cell.isAlive();

    assertThat(isAlive).isTrue();
  }

  @Test
  void checkStateOfCell_dead() {
    Cell cell = new Cell(1, 2, DEAD);

    boolean isAlive = cell.isDead();

    assertThat(isAlive).isTrue();
  }

}
