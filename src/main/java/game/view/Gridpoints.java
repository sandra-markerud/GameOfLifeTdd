package game.view;

import game.model.GridCellModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Gridpoints implements Iterable<Gridpoint> {

	private final List<Gridpoint> gridpoints = new ArrayList<>();

	public Gridpoints(GridCellModel model) {
//		gridpoints.addAll();
	}

	@Override
	public Iterator<Gridpoint> iterator() {
		return gridpoints.iterator();
	}

}