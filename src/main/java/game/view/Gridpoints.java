package game.view;

import game.model.GridCellModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Gridpoints implements Iterable<Gridpoint> {

	private final List<Gridpoint> gridpoints = new ArrayList<>();

	public Gridpoints(GridCellModel model) {
		gridpoints.addAll(model.flatten().stream()
				.map(Gridpoint::of).collect(Collectors.toList()));
	}

	@Override
	public Iterator<Gridpoint> iterator() {
		return gridpoints.iterator();
	}

}