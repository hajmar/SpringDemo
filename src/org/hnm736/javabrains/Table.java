package org.hnm736.javabrains;

import java.util.List;

public class Table {
	private Plate plate;
	private List<Chair> chairs;
	
	Table(Plate plate, List<Chair> chairs)	{
		plate = plate;
		this.chairs = chairs;
	}
}
