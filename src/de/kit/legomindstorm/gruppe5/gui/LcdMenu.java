package de.kit.legomindstorm.gruppe5.gui;

import de.kit.legomindstorm.gruppe5.Section;
import lejos.hardware.lcd.LCD;

public class LcdMenu {
	
	private String[] menuItems;
	
	private int selected;
	
	public LcdMenu() {
		for (int i = 0; i < Section.values().length; i++) {
			Section section = Section.values()[i];
			menuItems[i] = section.id() + ". " + section.description();
		}
		
	}

	public void drawMenu() {
		
		// clear LCD before drawing menu
		LCD.clear();
		
		// create the output String
		String output = "";
		for (int i = 0; i < menuItems.length; i++) {
			if (i != 0) {
				output.concat("\n");
			}
			
			// mark selected entry
			String selectionArrow = (i == selected)? "> " : "  ";
			
			output = output + selectionArrow + menuItems[i];
		}
		
		// draw output String to LCD screen
		LCD.drawString(output, 0, 0);
		
	}
	
	public void up() {
		selected = --selected % menuItems.length;
		drawMenu();
	}
	
	public void down() {
		selected = ++selected % menuItems.length;
		drawMenu();
	}
}
