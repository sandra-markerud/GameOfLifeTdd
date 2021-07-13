package game.model;

import static game.model.ModelProperties.COLUMNS;
import static game.model.ModelProperties.ROWS;
import static game.model.State.ALIVE;
import static game.model.State.DEAD;
import static org.assertj.core.api.Assertions.assertThat;

import game.model.pattern.Glider;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GridCellModelTest {

  private GridCellModel model;

  @BeforeEach
  void setUp() {
    model = new GridCellModel(ROWS, COLUMNS);
  }

  @Test
  void initializeModel_findDeadCell() {
    Cell point = model.getCellAtPosition(5, 6);

    assertThat(point)
        .isNotNull()
        .satisfies(
            cell -> assertThat(cell.getState()).isEqualTo(DEAD));
  }

  @Test
  void updateModel_createLivingCell() {
    model.updateCellAtPosition(5, 6, ALIVE);
    Cell point = model.getCellAtPosition(5, 6);

    assertThat(point)
        .isNotNull()
        .satisfies(
            cell -> assertThat(cell.getState()).isEqualTo(ALIVE));
  }

  @Test
  void checkModel_cellIsWithinBoundaries() {
    boolean isWithinBoundaries = model.isCellWithinBoundaries(5, 6);

    assertThat(isWithinBoundaries).isTrue();
  }

  @Test
  void checkModel_cellIsNotWithinBoundaries_isDead() {
    boolean isWithinBoundaries = model.isCellWithinBoundaries(ROWS + 1, COLUMNS + 1);

    assertThat(isWithinBoundaries).isFalse();
  }

  @Test
  void flattenModel() {
    List<Cell> points = model.flatten();

    assertThat(points).size().isEqualTo(ROWS * COLUMNS);
  }

  @Test
  void initModelWithGlider_GliderExistsAtDefaultPosition() {
    Glider glider = new Glider();
    GridCellModel model = new GridCellModel(ROWS, COLUMNS, glider);

    List<Cell> initializedCells = model.flatten();

    assertThat(initializedCells).containsAll(glider.pattern());
  }

}
