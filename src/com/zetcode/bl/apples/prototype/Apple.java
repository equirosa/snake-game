package com.zetcode.bl.apples.prototype;

import javax.swing.*;

/**
 * @author Eduardo Jose Quiros Alvarado
 * @version 1.0.0
 */
public abstract class Apple {
	ImageIcon icon;
	int points;

	public abstract Apple clone();

	// Getters
	/**
	 * @return ImageIcon value of the Apple.
	 */
	public ImageIcon getIcon() {
		return icon;
	}

	/**
	 * @return Int value of the points the Apple is worth.
	 */
	public int getPoints() {
		return points;
	}
}
