package com.zetcode.bl.apples.concrete;

import com.zetcode.bl.apples.prototype.Apple;

import javax.swing.*;

public class BlueApple extends Apple {
	public BlueApple(){setPoints(2);setIcon(new ImageIcon("src/resources/apples/blue.png"));}
	public BlueApple(ImageIcon icon, int points) {
		super();
		setIcon(icon);
		setPoints(points);
	}

	@Override
	public Apple clone() {
		return new BlueApple(getIcon(), getPoints());
	}
}
