package game.view;

import static game.view.ViewProperties.deadCellColor;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class GridModelTest {

  @Test
  void initializeModel_findDeadZell() {
    GridModel model = new GridModel(100, 160);

    Gridpoint point = model.getPointAtPosition(50, 50);

    assertThat(point)
        .isNotNull()
        .satisfies(
            gridpoint -> assertThat(gridpoint.getColor()).isEqualTo(deadCellColor));


  }

}
