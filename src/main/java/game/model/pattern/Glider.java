package game.model.pattern;

import static game.model.State.ALIVE;
import static game.model.State.DEAD;
import game.model.Cell;
import java.util.List;

public class Glider {

    private final int startX;
    private final int startY;

    public Glider() {
        this(0, 0);
    }

    public Glider(int startX, int startY) {
        this.startX = startX;
        this.startY = startY;
    }

    public List<Cell> pattern() {
        return List.of(
                new Cell(startX, startY, DEAD),
                new Cell(startX, startY + 1, DEAD),
                new Cell(startX, startY + 2, ALIVE),
                new Cell(startX + 1, startY, ALIVE),
                new Cell(startX + 1, startY + 1, DEAD),
                new Cell(startX + 1, startY + 2, ALIVE),
                new Cell(startX + 2, startY, DEAD),
                new Cell(startX + 2, startY + 1, ALIVE),
                new Cell(startX + 2, startY + 2, ALIVE));
    }
}
