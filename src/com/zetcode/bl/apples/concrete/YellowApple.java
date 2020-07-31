package com.zetcode.bl.apples.concrete;

import com.zetcode.bl.apples.prototype.Apple;

import javax.swing.*;

public class YellowApple extends Apple {
	public YellowApple(){setPoints(3);setIcon(new ImageIcon("src/resources/apples/yellow.png"));}
	public YellowApple(ImageIcon icon, int points) {
		super();
		setIcon(icon);
		setPoints(points);
	}

	@Override
	public Apple clone() {
		return new YellowApple(getIcon(), getPoints());
	}
}
