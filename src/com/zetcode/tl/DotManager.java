package com.zetcode.tl;

import com.zetcode.bl.dots.component.Dot;
import com.zetcode.bl.dots.concreteDecorator.Orange;
import com.zetcode.bl.dots.concreteDecorator.Purple;
import com.zetcode.bl.dots.decorator.DecoratedDot;

public class DotManager {
	private Dot dot = new Dot();
	
	public Dot getDot(){
		return this.dot;
	}

	public void decorateDot(int decType){
		switch (decType){
			case 1:
				dot = new Purple(dot);
				break;
			case 2:
				dot = new Orange(dot);
				break;
			case 3:
				unDecDot();
				break;
		}
	}
	
	public void unDecDot(){
		if (!this.dot.getColor().equals("src/resources/dots/green.png")) {
			DecoratedDot decorated = (DecoratedDot) this.dot;
			this.dot = decorated.getDecDot();
		}
	}
}
