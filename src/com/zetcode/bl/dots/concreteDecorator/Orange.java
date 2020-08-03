package com.zetcode.bl.dots.concreteDecorator;

import com.zetcode.bl.dots.component.Dot;
import com.zetcode.bl.dots.decorator.DecoratedDot;

public class Orange extends DecoratedDot {
	private final String color ="src/resources/dots/orange.png";
	public Orange(Dot pDot){
		this.decDot = pDot;
	}

	@Override
	public String getColor(){
		return this.color;
	}
}
