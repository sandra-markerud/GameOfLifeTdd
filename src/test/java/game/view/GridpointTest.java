package game.view;

import static game.model.State.DEAD;
import static game.view.ViewProperties.*;
import static org.assertj.core.api.Assertions.assertThat;
import game.model.Cell;
import org.junit.jupiter.api.Test;

public class GridpointTest {

    @Test
    void convertCellToGridPoint() {
        Cell cell = new Cell(5, 6, DEAD);

        Gridpoint gridPoint = Gridpoint.of(cell);

        assertThat(gridPoint.getColor()).isEqualTo(deadCellColor);
        assertThat(gridPoint.getX()).isEqualTo(5);
        assertThat(gridPoint.getY()).isEqualTo(6);
    }
}
