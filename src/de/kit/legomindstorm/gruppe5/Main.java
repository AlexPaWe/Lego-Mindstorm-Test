package de.kit.legomindstorm.gruppe5;

import lejos.hardware.Button;
import lejos.hardware.Key;
import lejos.hardware.KeyListener;

public class Main {

	public static boolean enterPressed = false;
	
	public static void main(String[] args) {
		
		Button.ENTER.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(Key k) {
				enterPressed = true;
			}

			@Override
			public void keyReleased(Key k) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		while (!enterPressed) {
			
		}

	}

}
