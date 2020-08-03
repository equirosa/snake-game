package com.zetcode.bl.dots.decorator;

import com.zetcode.bl.dots.component.Dot;

public abstract class DecoratedDot extends Dot{
	protected Dot decDot;
	
	public Dot getDecDot(){
		return decDot;
	}
}
