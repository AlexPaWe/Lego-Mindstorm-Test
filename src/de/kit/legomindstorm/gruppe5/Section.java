package de.kit.legomindstorm.gruppe5;

/*
 * Enumeration containing all sections of the course with their identifiers.
 */
public enum Section {
	LINE_FOLLOWING(1),
	BRIDGE(2),
	LABYRINTH(3),
	PUSH_BOX(4);
	
	private final int id;
	
	Section(int id) {
		this.id = id;
	}
	
	public int id() {
		return id;
	}
	
}
