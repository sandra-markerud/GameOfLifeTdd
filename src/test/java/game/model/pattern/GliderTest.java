package game.model.pattern;

import static game.model.State.ALIVE;
import static game.model.State.DEAD;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.assertj.core.groups.Tuple.tuple;
import game.model.Cell;
import java.util.List;
import org.junit.jupiter.api.Test;

public class GliderTest {

    @Test
    void createGlider() {
        Glider glider = new Glider();

        List<Cell> cells = glider.pattern();

        assertThat(cells).size().isEqualTo(9);
    }

    @Test
    void createGliderOnSpecificPosition() {
        Glider glider = new Glider(5, 6);

        List<Cell> cells = glider.pattern();

        assertThat(cells).extracting(Cell::getPositionX, Cell::getPositionY)
                .containsExactly(
                        tuple(5,6), tuple(5,7), tuple(5,8),
                        tuple(6,6), tuple(6,7), tuple(6,8),
                        tuple(7,6), tuple(7,7), tuple(7,8));
    }

    @Test
    void createGliderOnDefaultPosition() {
        Glider glider = new Glider();

        List<Cell> cells = glider.pattern();

        assertThat(cells).extracting(Cell::getPositionX, Cell::getPositionY)
                .containsExactly(
                        tuple(0,0), tuple(0,1), tuple(0,2),
                        tuple(1,0), tuple(1,1), tuple(1,2),
                        tuple(2,0), tuple(2,1), tuple(2,2));
    }

    @Test
    void createGliderMatchesPattern() {
        Glider glider = new Glider();

        List<Cell> cells = glider.pattern();

        assertThat(cells).extracting(Cell::getState)
                .containsExactly(DEAD, DEAD, ALIVE, ALIVE, DEAD, ALIVE, DEAD, ALIVE, ALIVE);
    }
}
