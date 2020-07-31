package com.zetcode.bl.apples.concrete;

import com.zetcode.bl.apples.prototype.Apple;

import javax.swing.*;

public class RedApple extends Apple {
	public RedApple(){setPoints(1);setIcon(new ImageIcon("src/resources/apples/red.png"));}
	public RedApple(ImageIcon icon, int points) {
		super();
		setIcon(icon);
		setPoints(points);
	}

	@Override
	public Apple clone() {
		return new RedApple(getIcon(), getPoints());
	}
}
