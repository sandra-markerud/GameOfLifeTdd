package game.view;

public class GridModel {

  private final Gridpoint[][] cells;

  public GridModel(int width, int height) {
    this.cells = new Gridpoint[height][width];
    initCells();
  }

  public Gridpoint getPointAtPosition(int i, int i1) {
    return cells[i][i1];
  }

  private void initCells() {
  }

}
