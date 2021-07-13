package game.model;

import static game.model.State.DEAD;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GridCellModel {

  private final Cell[][] cells;

  public GridCellModel(int rows, int columns) {
    this.cells = new Cell[rows][columns];
    initCells();
  }

  private void initCells() {
    for (int row = 0; row < this.cells.length; ++row) {
      for (int column = 0; column < this.cells[0].length; ++column) {
        cells[row][column] = new Cell(row, column, DEAD);
      }
    }
  }

  public Cell getCellAtPosition(int row, int column) {
    return cells[row][column];
  }

  public void updateCellAtPosition(int row, int column, State state) {
    cells[row][column] = new Cell(row, column, state);
  }

  public boolean isCellWithinBoundaries(int row, int column) {
    return row >= 0 && column >= 0 &&
        row < this.cells.length && column < this.cells[0].length;
  }

  public List<Cell> flatten() {
    return Arrays.stream(cells)
        .flatMap(Arrays::stream)
        .collect(Collectors.toList());
  }

}
