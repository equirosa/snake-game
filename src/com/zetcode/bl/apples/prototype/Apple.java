package com.zetcode.bl.apples.prototype;

import javax.swing.*;

/**
 * @author Eduardo Jose Quiros Alvarado
 * @version 1.0.0
 */
public abstract class Apple {
	private ImageIcon icon;
	private int points;

	public abstract Apple clone();

	// Getters
	/**
	 * @return ImageIcon value of the Apple.
	 */
	public ImageIcon getIcon() {
		return this.icon;
	}

	/**
	 * @return Int value of the points the Apple is worth.
	 */
	public int getPoints() {
		return this.points;
	}
}
