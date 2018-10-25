package de.kit.legomindstorm.gruppe5;

/*
 * Enumeration containing all sections of the course with their identifiers.
 */
public enum Section {
	LINE_FOLLOWING(1, "Follow the line"),
	BRIDGE(2, "Bridge"),
	LABYRINTH(3, "Labyrinth"),
	PUSH_BOX(4, "Push the Box");
	
	private final int id;
	private final String description;
	
	Section(int id, String description) {
		this.id = id;
		this.description = description;
	}
	
	public int id() {
		return id;
	}
	
	public String description() {
		return description;
	}
	
}
